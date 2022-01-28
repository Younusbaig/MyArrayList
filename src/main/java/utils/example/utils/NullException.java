package utils.example.utils;

public class NullException extends Exception{
    public NullException(String message){
        super(message);
    }

    public NullException(String message, Throwable cause){
        super(message, cause);
    }

}

