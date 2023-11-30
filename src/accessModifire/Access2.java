package accessModifire;

public class Access2 extends Access1 {




    public static void main(String[] args) {

        Access2 obj= new  Access2();
        System.out.println(obj.houre);
        System.out.println(obj.day);
       // System.out.println(obj.minutes); we can not use becuse is private
        System.out.println(obj.year);



    }
}
