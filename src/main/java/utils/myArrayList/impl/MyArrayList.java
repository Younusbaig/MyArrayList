package utils.myArrayList.impl;


import java.util.Collection;

public class MyArrayList<T extends Object> {

    private Object[] array;
    private int size;


    public MyArrayList(){
        array = new Object[10];
    }
    public MyArrayList(int n){
        if (n <=0){
            throw new IllegalArgumentException("Invalid capacity");
        }
        array = new Object[n];
        size = 0;
    }
    public MyArrayList(Collection<? extends T> c){
        if (c.size() > 0){
            array = c.toArray();
            size = array.length;
        }
    }

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