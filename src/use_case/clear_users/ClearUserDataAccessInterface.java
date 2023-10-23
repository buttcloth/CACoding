package use_case.clear_users;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public interface ClearUserDataAccessInterface {

    boolean existsUsers();

    ArrayList<String> removeUsers() throws FileNotFoundException, IOException;
}
