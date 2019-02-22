import java.util.ArrayList;

public class JavaArrayListADT {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<Employee>();

        
        list.add(new Employee(22, "Abhishek Raghav"));

        for (Employee employee : list) {

            System.out.println(employee);

        }

    }
}

class Employee{

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
