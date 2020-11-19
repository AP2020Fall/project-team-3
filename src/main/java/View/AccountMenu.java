package View;

import Model.User;
import javafx.scene.image.Image;

public class AccountMenu extends Menu {
    private static AccountMenu accountMenu;

    private AccountMenu() {
    }

    public static AccountMenu getInstance() {
        if (accountMenu == null) {
            return new AccountMenu();
        }
        return accountMenu;
    }

    public void viewInfo(User user) {
    }

    public void changePassword(User user, String before, String after) {
    }

    public void editField(User user, String field, String content) {
    }

    public void editField(User user, Image avatar) {
    }

    public void getStatistic(User user) {
    }

    public void getStatistic(User user, String game) {
    }

    public void getHistory(User user) {
    }

    public void logout() {
    }
}
