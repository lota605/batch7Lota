package arrayPractice;

public class Arrayloop {

    /*
    Write a java function and create an array in 4,5,6,7,8,9,10 and use loop and
    determine that which number is divide by 2 or not.if divided by 2 that is even else the number is odd.
     */

int [] number = {1,2,3,4,5,6,7,8,9,10};   //create an Array

public void Array(){

    //System.out.println(number.length);

    for(int i=0;i<number.length;i++){    //use for loop

        System.out.println(number[i]);
    }

int num1=11;         //even else the number is odd

    if(num1 % 2 ==0){
        System.out.println(num1 + " is an Even Number");
    }
    else if(num1 % 2 ==1){
        System.out.println(num1 + " is an Odd Number");
    }


}

public void extrawork(){
//Extra work by Lota

}





    public static void main(String[] args) {
        Arrayloop obj = new Arrayloop();
        obj.Array();
        //obj.extrawork();

    }
}
