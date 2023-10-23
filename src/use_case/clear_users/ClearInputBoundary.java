package use_case.clear_users;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public interface ClearInputBoundary {
    ArrayList<String> execute() throws FileNotFoundException, IOException;
}
