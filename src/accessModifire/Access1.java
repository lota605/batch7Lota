package accessModifire;

public class Access1 {

    public int houre=24;    //public is acceessbile througout the project
    private int minutes=60;  //is accessbile only its own class
    String day="Tuesday";    //no access modifier is accessible within hte package
    protected int year=365;


    public static void main(String[] args) {
        Access1 obj =new  Access1();
        System.out.println(obj.houre);
        System.out.println(obj.day);
        System.out.println(obj.minutes);
        System.out.println(obj.year);

    }
}
