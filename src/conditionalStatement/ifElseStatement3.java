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
        else if((temp==49)||(temp<69)){
            System.out.println("Watm");
        }
        else if((temp==69)||(temp<89)){
            System.out.println("Hot visit Bangladesh?India");
        }
    }



    public void greater(){

        //.take two numbers from user and print the greater number.
        Scanner scan = new Scanner(System.in);  //Pre defiend class
        int a=scan.nextInt();
        System.out.println("The first number is " +a);
        int b = scan.nextInt();
        System.out.println("The second number is " +b);

        if(a>b){
            System.out.println(a + "is The greater number  ");
        }
        else if(a==b){
            System.out.println(a +"is The equal number " + b);
        }
        else{
            System.out.println(a +"is The smaller number ");
        }

    }



    public void num(){
        // positive and negative number

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if((number==0) || (number>0)){
            System.out.println("this is positive number");
        }
        else if(number<0){
            System.out.println("This is negative number");
        }
    }

    public static void main(String[] args) {
        ifElseStatement3 obj = new ifElseStatement3();

        //obj.Faranheide();
       obj.greater();
       //obj.num();




    }
}
