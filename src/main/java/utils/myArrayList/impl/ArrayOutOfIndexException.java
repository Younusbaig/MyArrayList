package utils.myArrayList.impl;

public class ArrayOutOfIndexException extends Exception {

    public ArrayOutOfIndexException(String message){
        super(message);
    }

    public ArrayOutOfIndexException(String message, Throwable cause){
        super(message, cause);
    }

}
