package utils.myArrayList.impl;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    public void addListTest() throws ArrayOutOfIndexException {
        MyArrayList<Object> expectedEmployeeData = new MyArrayList<>();
        expectedEmployeeData.add("Muhammad");
        expectedEmployeeData.add(1);
        expectedEmployeeData.add(33.5);
        expectedEmployeeData.get(0);
        expectedEmployeeData.get(1);
        expectedEmployeeData.get(2);
        assertTrue(true);

    }

    @Test
    public void getIndexTest() throws Exception {
        MyArrayList<Object> employee = new MyArrayList<>();
        employee.add("Muhammad");
        employee.add(1);
        employee.add(36.7f);
        employee.get(0);
        assertNotNull(employee);
    }

    @Test
    public void getIndexTest1() throws Exception {
        MyArrayList<Object> employee = new MyArrayList<>();
        employee.add(9);
        employee.add("Muhammad");
        employee.add(null);
        employee.get(2);
        assertTrue(true);
    }

    @Test(expected = ArrayOutOfIndexException.class)
    public void getIndexOutOfBoundTest() throws Exception {
        MyArrayList<Object> employee = new MyArrayList<>();
        employee.add("Muhamamd");
        employee.add(22);
        employee.add(0.00);
        employee.get(12);
        assertTrue(true);

    }

}
