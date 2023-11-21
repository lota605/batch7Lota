package loopDemo;

public class LoopDivided {


    public void divided(){

        //Write a function and create a loop inside it from 20-50 and find which number is divided by 7.

         for(int a=20;a<=50;a++){
         System.out.println(a);
        }

        int num2 = 49;

        if(num2 %7 ==0){
            System.out.println(num2 + " is divided by 7");
        }
        else if(num2 %7 ==1){
            System.out.println(num2 + " is not divided by 7");
        }

    }


    public static void main(String[] args) {

        LoopDivided obj= new LoopDivided();
    }
}
