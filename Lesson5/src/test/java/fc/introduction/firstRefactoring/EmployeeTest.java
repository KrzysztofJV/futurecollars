package fc.introduction.firstRefactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

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
        BigDecimal bigDecimal = new BigDecimal(baseSalary);
        Employee employee = new Employee(name,surname,age,bigDecimal);
        BigDecimal result = employee.getBaseSalary();

        //then
        Assertions.assertEquals(bigDecimal,result);
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
        BigDecimal basicSalary = new BigDecimal(baseSalary);
        BigDecimal aloneBonus = new BigDecimal(bonus);
        Employee employee = new Employee(name,age,basicSalary,aloneBonus,surname);
        BigDecimal result = employee.getBonus();

        //then
        Assertions.assertEquals(aloneBonus,result);
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
        BigDecimal basicSalary = new BigDecimal(baseSalary);
        BigDecimal aloneBonus = new BigDecimal(bonus);
        Employee employee = new Employee(name,age,basicSalary,aloneBonus,surname);
        BigDecimal result = employee.getTotalSalary();

        //then
        Assertions.assertEquals(basicSalary.add(aloneBonus),result);
    }
}