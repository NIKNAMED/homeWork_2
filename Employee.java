public class Employee {

    String fullName;
    String job;
    String email;
    String phone;
    double salary;
    int age;

    public Employee(String fullName, String job, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Job: " + job);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("-------------------");
    }
}


class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "Manager",
                "john.doe@example.com", "123-456-7890", 50000.00, 35);
        employee1.showInfo();
    }
}