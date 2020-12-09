package view;

import java.time.LocalDate;

public class AdminMenu extends Menu implements Back {
    private static final AdminMenu adminMenu = new AdminMenu();

    private AdminMenu() {
    }

    public static AdminMenu getAdminMenu() {
        return adminMenu;
    }

    private void addEvent() {
        System.out.print("Game Name: >");
        String game = scanner.nextLine();

        System.out.print("Start Year: >");
        int syear, smonth, sday;
        syear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Start Month: >");
        smonth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Start Day: >");
        sday = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Finish Year: >");
        int fyear, fmonth, fday;
        fyear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Finish Month: >");
        fmonth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Finish Day: >");
        fday = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Score: >");
        long score = scanner.nextInt();
        scanner.nextLine();

        LocalDate localDate = LocalDate.now();
        if (localDate.isAfter(LocalDate.of(fyear, fmonth, fday))) {
            System.err.println("Invalid Start or End Date!");
            return;
        } else if (score < 1) {
            System.err.println("Score can not be zero on negative");
            return;
        }

        Client.getClient().send("User addEvent " + game + " " + syear + " " + smonth + " " + sday + " " + fyear + " " + fmonth + " " + fday + " " + score);
    }

    private void showEvents() {
        Client.getClient().send("User showEvents");
    }

    private void editEvent(String eventID, String field, String content) {}

    private void removeEvent(String eventID) {}

    private void suggest() {}

    private void showSuggestions() {}

    private void removeSuggestion(String suggestionID) {}

    private void showUsers() {}

    private void showUserProfile() {}

    @Override
    public void run() {
        while (true) {
            switch (scanner.nextLine()) {
                case "addEvent":
                    addEvent();
                    break;
                case "showEvents":
                    showEvents();
                    break;
                case "editEvent":
                    editEvent();
                    break;
                case "removeEvent":
                    removeEvent();
                    break;
                case "suggest":
                    suggest();
                    break;
                case "showSuggestions":
                    showSuggestions();
                    break;
                case "removeSuggestion":
                    removeSuggestion();
                    break;
                case "showUsers":
                    showUsers();
                    return;
                case "showUserProfile":
                    showUserProfile();
                    return;
                case "accountMenu":
                    next(AccountMenu.getAccountMenu());
                    return;
                default:
                    System.err.println("Incorrect command");
                    break;
            }
        }
    }

    @Override
    public void next(Menu menu) {
        push(menu);
        menu.run();
    }
}
