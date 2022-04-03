package com.luboshodossy;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.testng.annotations.Test;

public class Employee {
    int age;
    int employeeId;
    String address;
    String name;
    String surname;
    Date dob;

    public Employee() {
        name = null;
        surname = null;
        age = Integer.parseInt(null);
        employeeId = Integer.parseInt(null);
        dob = new Date();
    }

    public Employee(String nameValue, String surnameValue, Date newDob) {
        name = nameValue;
        surname = surnameValue;
        dob = newDob;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameValue) {
        name = nameValue;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String newAddress) {
        address = newAddress;
    }

    public void getDob(Date newDob) {
        dob = newDob;
    }

    public void print() {
        System.out.println("Meno: " + name);
        System.out.println("Dátum narodenia: " + dob);
        System.out.println("Adresa: " + address);
    }
}
class Main {
    static void getEmployeesByGender() {

    }

    static void sortEmployeesByAge() {

    }
}





class AClassWithOneJUnitTest {
    @Test
    void demoTestMethod() {
        assertTrue(true);
    }
}

