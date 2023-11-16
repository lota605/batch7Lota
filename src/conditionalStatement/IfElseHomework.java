package conditionalStatement;

import java.util.Scanner;

public class IfElseHomework {
    /*
    1.A shop give discount of 10% if the cost of purchased quantity is more than 1000.
    Ask user for quantity suppose one unit will cost 100.judge and print total cost for user.
    2.write ajava function and take three int parameters and prints the greaters and print the greatest number
    3.write a java function and user the parameter of an integer between1 and 7.it displays the weekday name.
    4.write a jaa function and take a int parameter and determine that the number is devided by 2 or not.
    if devided by 2 that is even else the number is odd.

    */
    public void printGreater(){
        Scanner scan = new Scanner(System.in);  // System is Pre defiend class create by External libraries(java)
        int x = scan.nextInt();
        System.out.println("The First number is " + x);
        int y = scan.nextInt();
        System.out.println("The Second number is " + y);
        int z = scan.nextInt();
        System.out.println("The Thread number is " + z);

        if(x>y){
            System.out.println(x + "is the greater number");
        }
        else if(x>z){
            System.out.println(x + "is the greater number too");
        }
        else{
            System.out.println(x + "is not the greater number ");
        }


    }

    public void weekday() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a == 1) {
            System.out.println("Sunday");

        } else if (a == 2) {
            System.out.println("Monday");
        } else if (a == 3) {
            System.out.println("Tuesday");
        } else if (a == 4) {
            System.out.println("Wednesday");
        } else if (a == 5) {
            System.out.println("Thursday");
        } else if (a == 6) {
            System.out.println("Friday");
        } else if (a == 7) {
            System.out.println("Satarday");
        }
    }

    public static void main(String[] args) {
        IfElseHomework obj = new IfElseHomework();
        //obj.printGreater();
        obj.weekday();
    }
}
