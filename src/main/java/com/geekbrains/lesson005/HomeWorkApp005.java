package com.geekbrains.lesson005;

public class HomeWorkApp005 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Вадим Вадимыч", "инженер", "asd@asd.ru", 88668855L, 300, 60);
        employees[1] = new Employee("Вадим Корытыч", "бездельник", "asd@asd.ru", 895621551L, 700, 22);
        employees[2] = new Employee("Вадим Максимыч", "тусовщик", "asd@asd.ru", 45222215L, 800, 28);
        employees[3] = new Employee("Вадим Купатыч", "космонавт", "asd@asd.ru", 89584617988L, 600, 40);
        employees[4] = new Employee("Вадим Киргиз", "пират", "asd@asd.ru", 4433443L, 50000, 55);

        for (Employee employee : employees) {
            if (employee.age >= 40) {
                System.out.println(employee.printText());
            }
        }
    }

    public static class Employee {
        String name;
        String position;
        String email;
        long phone;
        int salary;
        int age;

        public Employee(String name, String position, String email, long phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public String printText() {
            String text = "Имя сотрудника: " + this.name + ". Должность: " + this.position + ". Почта: " + this.email + ". Телефон: " + this.phone + ". Зарплата: " + this.salary + ". Возраст: " + this.age;
            return text;
        }
    }
}
