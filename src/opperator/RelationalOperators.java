package opperator;

public class RelationalOperators {
    //>,<, >=,<=, ==, !=  this is not going to return a value.they will give only true or false

int a =20;  //instance/object variable
int b =9;

public void relational(){
    boolean result1=a>b;
    System.out.println(result1);

    boolean result2=a<b;
    System.out.println(result2);
    boolean result4=a>=b;
    System.out.println(result4);

    boolean result3=a<=b;
    System.out.println(result3);

    boolean result5=a!=b;
    System.out.println(result5);
    boolean result6=a==b;
    System.out.println(result6);
}






    public static void main(String[] args) {
        RelationalOperators obj= new  RelationalOperators();
        obj.relational();


    }
}
