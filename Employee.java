import java.util.*;

public abstract class Employee extends Person{
    public Employee(int id, String name, int age, String address, String phone, String email) {
        super(id, name, age, address, phone, email);
    }
    abstract void calSalary();

}
