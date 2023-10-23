package use_case.clear_users;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

import interface_adapter.signup.SignupState;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }

    @Override
    public ArrayList<String> execute(SignupState state) throws FileNotFoundException, IOException {
        ArrayList<String> clearedUsers = new ArrayList<String>();
        ClearOutputData clearOutputData = new ClearOutputData(null, false, clearedUsers);
        if (!userDataAccessObject.existsUsers()) {
            userPresenter.prepareFailView("Nothing to clear.");
        } else {
            LocalDateTime now = LocalDateTime.now();
            clearedUsers = userDataAccessObject.removeUsers();
            
            clearOutputData = new ClearOutputData(now.toString(), false, clearedUsers);
            userPresenter.prepareSuccessView(clearOutputData);
        }
        return clearedUsers;
    }
}
