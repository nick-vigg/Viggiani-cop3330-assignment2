package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListRemovalTest {

    @Test
    void removeEmployeeJohnSmith() {
        //given
        EmployeeListRemoval elr = new EmployeeListRemoval();
        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        //when
        List actual = elr.removeEmployee(employees, "John Smith");
        employees.remove("John Smith");
        List expected = employees;
        //then
        assertEquals(expected, actual);
    }
    @Test
    void removeEmployeeJackieJackson() {
        //given
        EmployeeListRemoval elr = new EmployeeListRemoval();
        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        //when
        List actual = elr.removeEmployee(employees, "Jackie Jackson");
        employees.remove("Jackie Jackson");
        List expected = employees;
        //then
        assertEquals(expected, actual);
    }
    @Test
    void removeEmployeeChrisJones() {
        //given
        EmployeeListRemoval elr = new EmployeeListRemoval();
        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        //when
        List actual = elr.removeEmployee(employees, "Chris Jones");
        employees.remove("Chris Jones");
        List expected = employees;
        //then
        assertEquals(expected, actual);
    }
    @Test
    void removeEmployeeAmandaCullen() {
        //given
        EmployeeListRemoval elr = new EmployeeListRemoval();
        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        //when
        List actual = elr.removeEmployee(employees, "Amanda Cullen");
        employees.remove("Amanda Cullen");
        List expected = employees;
        //then
        assertEquals(expected, actual);
    }
    @Test
    void removeEmployeeJeremyGoodwin() {
        //given
        EmployeeListRemoval elr = new EmployeeListRemoval();
        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        //when
        List actual = elr.removeEmployee(employees, "Jeremy Goodwin");
        employees.remove("Jeremy Goodwin");
        List expected = employees;
        //then
        assertEquals(expected, actual);
    }

}