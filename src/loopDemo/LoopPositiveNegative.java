package loopDemo;

public class LoopPositiveNegative {
/*
 write a  function and that create a loop between 1-10.and determind which number is Positive and
    which number is Negative
*/


    public void loop1(){

        for(int a=1;a<=10;a++){    //use for loop between1-10
            System.out.println(a);
        }

        int number =-5;       //determind positive and negative

        if(number==0){
            System.out.println(number + " is a positive number ");
        }
        else if(number>0){
            System.out.println(number + " is a positive number");
        }
        else if(number<0 ){
            System.out.println(number+ " is a negative number");
        }

    }







    public static void main(String[] args) {
        LoopPositiveNegative obj =new LoopPositiveNegative();
        obj.loop1();

    }
}
