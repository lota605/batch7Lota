package arrayPractice;

public class ArrayDemo{

    String [] studentName ={"Arafat","Jobayda","Urmi","Razia"};
    //studentName is ArrayVariable. index start with 0 and lenght start with 0.
    //we store multipale valu in singla variable in Array.
    String location ="lynn";

    public void arraya(){
        System.out.println(studentName[0]);
        System.out.println(studentName[1]);
        System.out.println(studentName[2]);
        System.out.println(studentName[3]);
      //  System.out.println(studentName[4]);  //here if put index 4 then out of bounds for length 4


        System.out.println(location);

    }

    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        obj.arraya();

    }

    }



