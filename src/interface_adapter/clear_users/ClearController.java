package interface_adapter.clear_users;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import use_case.clear_users.ClearInputBoundary;

public class ClearController {
    
    final ClearInputBoundary userClearUseCaseInteractor;
    public ClearController(ClearInputBoundary userClearUseCaseInteractor) {
        this.userClearUseCaseInteractor = userClearUseCaseInteractor;
    }

    public ArrayList<String> execute() throws FileNotFoundException, IOException {

        return userClearUseCaseInteractor.execute();
    }
}
