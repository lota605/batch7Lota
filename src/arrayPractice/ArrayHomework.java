package arrayPractice;

public class ArrayHomework {



    public void homework1() {

        //  1.consider an array of the following numbers:25,26,28,29,35
        //    print the sum of even numbers only for the array element

        int[] num = {25, 26, 28, 29, 35};    //create Array

        int sum = 0;

        for (int i = 0; i < num.length; i++) {      //use for loop
            sum = sum + num[i];
        }
        System.out.println("sum of element of array: " + sum);

        for (int i = 0; i <= 4; i++) {

            if (num[i] % 2 == 0) {
                System.out.println(num[i] + " is an Even Number");

            }

        }
    }
    public void homework2(){

        // 2.write a program to find the sum of 20-30

        int sum=0;
        for(int i=20; i<=30; i++){     //use for loop
            sum = sum + i;
        }
        System.out.println("sum of element of number is: " +sum);
    }



public void homework3(){

        //  3.Take 5 number like 100,200,300,400,500 as an array and find the average of those number.


    int [] number ={100,200,300,400,500};      //create Array

    int sum=0;         //declare sum=0

    for(int i=100;i<=500;i++){             //use for oop
        sum = sum + i;

    }
    System.out.println("sum of the element of Array is : " + sum);

    double average= sum/ number.length;    //average use as a variable, and double is data type.

    System.out.println("average of the element of array is : " + average);
}


    public static void main(String[] args) {

        ArrayHomework obj = new ArrayHomework();

       obj.homework1();
       // obj.homework2();
      //  obj.homework3();
    }


}
