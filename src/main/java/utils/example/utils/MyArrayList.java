package utils.example.utils;


public class MyArrayList {

    private String[] array = new String[10];
    private int size = 0;


    public void add(String string) {
        array[size] = string;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public String get(int index) {
        return array[index];
    }

}
