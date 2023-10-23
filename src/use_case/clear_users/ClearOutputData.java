package use_case.clear_users;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ClearOutputData {

    private String clearTime;

    private boolean useCaseFailed;

    private ArrayList<String> clearedUsers;

    public ClearOutputData(String now, boolean useCaseFailed, ArrayList<String> usersDeleted) {
        this.clearTime = now;
        this.useCaseFailed = useCaseFailed;
        this.clearedUsers = usersDeleted;
    }

    public String getClearTime() {
        return clearTime;
    }
}
