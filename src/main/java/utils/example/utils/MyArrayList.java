package utils.example.utils;


public class MyArrayList<T extends Object> {

    private Object array[] = new Object[10];
    private int size = 0;


    public void add(Object obj) {
        array[size] = obj;
        size++;
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

    }

    public Object get(int index) throws ArrayOutOfIndexException, NullException {
        if (index >= array.length){
            throw new ArrayOutOfIndexException("index is out of bound");
        }

        if (array[index] != null){
            return array[index];
        }
        else
        {
            throw new NullException("error, Null value");
        }
    }


    }
