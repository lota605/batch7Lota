package conditionalStatement;

import java.util.Scanner;

public class ifElseStatement3 {

    /*
    1.take two numbers from user and print the greater number.
    2.take a number from user find that the number is positive of negative
    Exa: 0.1.2.3 is positive and -1,-2,-3,-4.435 is negative
    3.take a temparature as user input as Farenheite
    if it is 30-49 Print cold
    if it is 50-69 Print Warm
    If it is 70-89 Print Hot visit Bangladesh/India

     */
    public void Faranheide(){
        // 3. temparature homework
        Scanner scan = new Scanner(System.in);
        int temp =scan.nextInt();

        if(temp<30){
            System.out.println("very very cold");
        }
        else if((temp==30)||(temp<49)){
            System.out.println("cold");
        }
        else if((temp==50)||(temp<69)){
            System.out.println("Watm");
        }
        else if((temp==70)||(temp<89)){
            System.out.println("Hot visit Bangladesh?India");
        }
    }

    public void greater(){
        // greater number one way
        Scanner scan = new Scanner(System.in);
       int num= scan.nextInt();


        if (num > 50) {
            System.out.println("num is greater number");

        }


    }

    public void num(){
        // positive and negative number

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number>0.0){
            System.out.println("this is positive number");
        }
        else if(number<0.0){
            System.out.println("This is negative number");
        }
    }

    public static void main(String[] args) {
        ifElseStatement3 obj = new ifElseStatement3();
        //obj.Faranheide();
       //obj.greater();
        //obj.num();

        // inside main print greater number

        int a= 100;
        int b= 50;
        if(a>b){
            System.out.println("100 is greater then 50");
        }
        else if (a<b){
            System.out.println("50 is small then 100");
        }

    }
}
