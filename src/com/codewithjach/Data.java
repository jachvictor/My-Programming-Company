package com.codewithjach;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to jach's limited computer company");
        System.out.println("here are the list of employable positions we have for you in our company, kindly " +
                "specify your interest");
        System.out.println("1-web designer");
        System.out.println("2-andriod developer");
        System.out.println("specify using the numbering");
        byte webDesigner = input.nextByte();
        if(webDesigner ==1){
        System.out.println("enter the following data to verify if you are eligible for this position");
        System.out.println("name:");
        String name = input.next();
        System.out.println("age:");
        short age = input.nextShort();
        System.out.println("qualifications: 1-a web designer 2-andriod deveioper 3-none" +
                "specify using the numbering");
        short qualification = input.nextShort();
            System.out.println("are you experienced(1-yes 2-no " +
                    "(specify using the numbering)");
            short experience = input.nextShort();
            if(age>30 && qualification==1 &&  experience==1){
                System.out.println("sorry, you are not eligi");
            System.out.println("CONGRATS you are qaulified for this position");}
            else if(age<16)
            System.out.println("you too young for this position");
            else System.out.println("sorry, you are NOT eligible for this position");

            }
else if(webDesigner==2){ System.out.println("enter the following data to verify if you are eligible for this position");
        System.out.println("name:");
        String name = input.next();
        System.out.println("age:");
        short age = input.nextShort();
        System.out.println("qualifications: 1-a web designer 2-andriod deveioper 3-none" +
                "specify using the numbering");
        short qualification = input.nextShort();
        System.out.println("are you experienced(1-yes 2-no " +
                "(specify using the numbering)");
        short experience = input.nextShort();
if(age<30&&qualification==2&&experience==1){
    System.out.println();
    System.out.println("CONGRATS,you are qaulified for this position ");

}else if(age<16)
    System.out.println("you are too young for this position");
else System.out.println("sorry you are not eligible for this position");
}
        }

    }
