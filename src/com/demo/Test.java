package com.demo;


import java.util.Scanner;

public class Test {



    public static void main(String[] args) {
        System.out.println("Welcome to intellije IDE");
        Calculator c=new Calculator();
        Test t=new Test();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();

       int subresult = c.sub(a,b);
       System.out.println("substraction is="+subresult);
        int addresult = c.add(a,b);
        System.out.println("Addition is="+addresult);
        int multresult = c.mult(a,b);
        System.out.println("Multiplication is="+multresult);



    }


}
