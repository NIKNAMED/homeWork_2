public class Massive {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иванов Иван", "Инженер",
                "ivanov@mail.com", "123456789", 50000, 35);
        employees[1] = new Employee("Иван Иван", "Программист",
                "petrov@mail.com", "987654321", 70000, 28);
        employees[2] = new Employee("Иван Иван", "Дизайнер",
                "sidorov@mail.com", "456789123", 60000, 32);
        employees[3] = new Employee("Иван Иван", "Менеджер",
                "kozlova@mail.com", "789123456", 55000, 30);
        employees[4] = new Employee("Иван Иван", "Техник",
                "belov@mail.com", "321654987", 45000, 40);

    }
}