package use_case.clear_users;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import interface_adapter.signup.SignupState;


public interface ClearInputBoundary {
    ArrayList<String> execute(SignupState state) throws FileNotFoundException, IOException;
}
