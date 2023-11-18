package conditionalStatement;

public class EvenOddNumber {

    //  write a jaa function and take a int parameter and determine that the number is devided by 2 or not.
    //    if devided by 2 that is even else the number is odd.

    public void EvenoddNumber(int number){

        if(number % 2 ==0){
            System.out.println(number + " is an Even Number");
        }
        else if(number % 2 ==1){
            System.out.println(number + " is an Odd Number");
        }
    }

    public static void main(String[] args) {
        EvenOddNumber obj = new EvenOddNumber();
        obj.EvenoddNumber(13);


    }

}
