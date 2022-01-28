package utils.example.utils;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    public void addListTest() {
        MyArrayList expectedEmployeeData = new MyArrayList();
        expectedEmployeeData.add("Muhammad");
        expectedEmployeeData.add("Ahmed");
        expectedEmployeeData.add("abdullah");

        MyArrayList employee = new MyArrayList();
        assertNotNull(expectedEmployeeData);
        assertEquals(employee.equals(expectedEmployeeData), expectedEmployeeData.equals(employee));
    }

    @Test
    public void getIndexTest(){
        MyArrayList employee = new MyArrayList();
        employee.add("Muahammad");
        employee.add("Rehan");
        employee.add("Faizan");
        employee.get(0);
        assertNotNull(employee);
    }
}
