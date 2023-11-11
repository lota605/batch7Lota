package conditionalStatement;

public class ifElseStatement {

    //ifElse statement= conditional statement

    static int age =20;

    public static void ifelse(){

        if(age ==10){
            System.out.println("age is 10");
        }
        else if(age ==15){
            System.out.println("age is 15");
        }
        else if(age ==20){
            System.out.println("age is 20");
        }
        else{
            System.out.println("none of the above is true");
        }

    }
    public void condition(){
        int time =8;

        if(time<9){
            System.out.println("good morning");
        }
        else if(time<=11){
            System.out.println("good noon");
        }
        else if(time<=15){
            System.out.println("good afternoon");
        }
        else{
            System.out.println("good nignt");
        }
    }




    public static void main(String[] args) {
        ifElseStatement obj = new  ifElseStatement();
        obj.condition();
        ifelse();

        String veg ="Tomatoo";

        if (veg =="Tomatoo"){
            System.out.println("bring it home");
        }
        else {
            System.out.println("bring something eles");
        }
    }

}
