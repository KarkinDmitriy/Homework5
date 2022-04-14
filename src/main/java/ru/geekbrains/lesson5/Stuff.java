package ru.geekbrains.lesson5;

public class Stuff {
    private String name;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public  Stuff (String name, String post, String email, String phone, int salary, int age) {
        this.name=name;
        this.post=post;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }
    public void printInfo() {
        System.out.printf("Stuff %s, post %s, email %s, phone %s, salary %s, age %s\n", this.name, this.post, this.email, this.phone, this.salary, this.age);
    }

    public  int getAge() {
        return this.age;
    }

}
