package org.javarole;

import org.javarole.education.Student;
import org.javarole.education.University;

public class Main {
    static void main(String[] args) {

        University uni = new Student();
        double var_2 = 2.56;
        int swap_A = 10;
        int swap_B = 20;
        int a = 1;
        float b = 2;
        double c = 3;
        long l = 5;
        byte d = 127;

        swap_A = swap_A+swap_B;
        swap_B = swap_A-swap_B;
        swap_A = swap_A-swap_B;

        System.out.println(a+" "+b+" "+c+" "+l+" "+d);
        inputValue(a,b,c,l,d);
        System.out.println(a+ "" +b);
        System.out.println("A : " + swap_A + " & B : " + swap_B);
        System.out.println("Narrow casting " + (int)var_2);
        System.out.println("--- Explicit Upcasting -:- " +
                "When a sub-class object is referenced by a superclass reference variable ---");
        uni.purpose();
        System.out.println("--- Explicit Downcasting  -:- " +
                "When a subclass type refers to an object of the parent class ---");
        Student stud = (Student) uni;
        stud.lecture();

        System.out.println("Hello and welcome!");
        System.out.println("======================");
        int[] num = {1, 2, 3, 4, 5};
        String[] arr = {"Geek1", "Geek2", "Geek3"};

        for(int nums : num) {
            System.out.println("numbers --- " + nums);
        }

        for(String arrs : arr) {
            System.out.println("String --- " + arrs);
        }
    }

    public static void inputValue(int a, float b, double c, long l, byte d) {
        double p = c/b;
        double q = b/a;
        double r = c/a;
        double m = r+l;
        int s = a/d;

        System.out.println(p+" "+ q+" "+ r +" "+m +" "+s);
    }
}