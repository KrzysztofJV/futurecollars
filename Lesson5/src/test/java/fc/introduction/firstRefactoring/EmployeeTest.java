package fc.introduction.firstRefactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void shouldPrintEmployeeNameAndSurname(){
        //when
        String name = "Jeff";
        String surname = "Silver";

        //given
        Employee employee = new Employee(name,surname);
        String result = employee.getEmployeeInfo();

        //then
        Assertions.assertEquals("Employee name : Jeff Silver",result);
    }

    @Test
    void shouldPrintEmployeeNameSurnameAndAge(){
        //when
        String name = "Jeff";
        String surname = "Silver";
        int age = 26;

        //given
        Employee employee = new Employee(name,surname,age);
        String result = employee.getEmployeeDetails();

        //then
        Assertions.assertEquals("Employee details : Jeff Silver is 26",result);
    }

    @Test
    void shouldReturnBaseSalary(){
        //when
        String name = "Jeff";
        String surname = "Silver";
        int age = 26;
        int baseSalary = 2800;

        //given
        Employee employee = new Employee(name,surname,age,baseSalary);
        int result = employee.getBaseSalary();

        //then
        Assertions.assertEquals(baseSalary,result);
    }

    @Test
    void shouldReturnBonus(){
        //when
        String name = "Jeff";
        String surname = "Silver";
        int age = 26;
        int baseSalary = 2800;
        int bonus = 700;

        //given
        Employee employee = new Employee(name,age,baseSalary,bonus,surname);
        int result = employee.getBonus();

        //then
        Assertions.assertEquals(bonus,result);
    }

    @Test
    void shouldReturnTotalSalary(){
        //when
        String name = "Jeff";
        String surname = "Silver";
        int age = 26;
        int baseSalary = 2800;
        int bonus = 700;

        //given
        Employee employee = new Employee(name,age,baseSalary,bonus,surname);
        int result = employee.getTotalSalary();

        //then
        Assertions.assertEquals(3500,result);
    }
}