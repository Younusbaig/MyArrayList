package utils.example.utils;

public class ArrayOutOfIndexException extends Exception {

    public ArrayOutOfIndexException(String message){
        super(message);
    }

    public ArrayOutOfIndexException(String message, Throwable cause){
        super(message, cause);
    }

}
