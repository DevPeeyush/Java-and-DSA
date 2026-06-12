package OOPS;

import java.util.Scanner;

public class BasicsClasses {
    // Creating a new data type (classes)
    public static class Student {
        String name ;
        int rollno ;
        double percentage ;
    }

    public static class Car{
        String car_name;
        String no_plate ;
        String car_modal;

    }

    public static void main(String[] args) {
        // Declaration of objects
        System.out.println("Enter the value of x :");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();;
        System.out.println("Value of x is : "+z);


        Student s1 = new Student();
        s1.name ="Peeyush";
        s1.rollno = 21;
        s1.percentage = 92.4;
        System.out.println(s1.percentage);

        Student s2 = new Student();
        s2.name = "Aayush";
        s2.rollno = 1;
        s2.percentage = 99.0;
        System.out.println(s2.name);

        Car c1 =new Car();
        c1.car_name = "BMW";
        c1.car_modal = "2016";
        c1.no_plate = "RJ14CV2012";
        System.out.println(c1.no_plate);

    }
}
