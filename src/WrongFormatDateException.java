import java.time.format.DateTimeParseException;

public class WrongFormatDateException extends RuntimeException {
    public WrongFormatDateException(String s){
        super(s);
    }
}
