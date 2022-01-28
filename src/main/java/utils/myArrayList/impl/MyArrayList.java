package utils.myArrayList.impl;


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

    public Object get(int index) throws ArrayOutOfIndexException {
        if (index >= array.length) {
            throw new ArrayOutOfIndexException("index is out of bound");
        }

        if (array[index] != null) {
            return array[index];

        }
        return null;
    }

    public int size(){
        return this.size;
    }
}