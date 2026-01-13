package com.company.lesson5_1

class Person {
    String name;        // 共有属性：姓名
    int age;            // 共有属性：年龄

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}

class Student extends Person {
    public void study() {
        System.out.println("学习");
    }
}

class Teacher extends Person {
    double salary;      // 教师特有属性：薪资

    public void teach() {
        System.out.println("教书");
    }
}

public class Example01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "张三";
        student.age = 16;
        System.out.print("我叫" + student.name + "，我今年" + student.age + "岁。");
        System.out.println("我可执行如下方法：");
        student.eat();
        student.sleep();
        student.study();

        Teacher teacher = new Teacher();
        teacher.name = "王明";
        teacher.age = 30;
        teacher.salary = 5000;
        System.out.print("我叫" + teacher.name + "，我今年" + teacher.age + "岁，我的薪资是" + teacher.salary + "元/月。");
        System.out.println("我可执行如下方法：");
        teacher.eat();
        teacher.sleep();
        teacher.teach();
    }
}