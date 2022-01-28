package utils.example.utils;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    public void addListTest() {
        MyArrayList expectedEmployeeData = new MyArrayList();
        expectedEmployeeData.add("Muhammad");
        expectedEmployeeData.add(1);
        expectedEmployeeData.add(33.5);

        MyArrayList employee = new MyArrayList();
        assertNotNull(expectedEmployeeData);
        assertEquals(employee.equals(expectedEmployeeData), expectedEmployeeData.equals(employee));
    }

    @Test
    public void getIndexTest() throws Exception {
        MyArrayList employee = new MyArrayList();
        employee.add("Muhammad");
        employee.add(1);
        employee.add(36.7f);
        employee.get(0);
        assertNotNull(employee);
    }

    @Test(expected = NullException.class)
    public void getIndexTest1() throws Exception {
        MyArrayList employee = new MyArrayList();
        employee.add(9);
        employee.add("Muhammad");
        employee.add(null);
        employee.get(2);
        assertNull(employee);
    }

    @Test(expected = ArrayOutOfIndexException.class)
    public void getIndexOutOfBoundTest() throws Exception {
        MyArrayList employee = new MyArrayList();
        employee.add("Muhamamd");
        employee.add(22);
        employee.add(0.00);
        employee.get(12);

    }

}
