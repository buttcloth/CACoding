package interface_adapter.clear_users;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import interface_adapter.signup.SignupState;
import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearController {
    
    final ClearInputBoundary userClearUseCaseInteractor;
    public ClearController(ClearInputBoundary userClearUseCaseInteractor) {
        this.userClearUseCaseInteractor = userClearUseCaseInteractor;
    }

    public ArrayList<String> execute() throws FileNotFoundException, IOException {
        SignupState clearState = new SignupState();

        return userClearUseCaseInteractor.execute(clearState);
    }
}
