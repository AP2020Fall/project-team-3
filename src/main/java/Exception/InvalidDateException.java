package Exception;

public class InvalidDateException extends Exception {
    public InvalidDateException() {
        super("Invalid Start or End Date!");
    }
}
