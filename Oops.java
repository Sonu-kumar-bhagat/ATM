// package Oops;

public class Oops {
    // String name;
    final String name="sonu";
    int roll_no;
    void print(){
        System.out.println(name);
        System.out.println(roll_no);
    }
    void eat(){
        System.out.println(name+" eats !");
    }
    public static void main(String[] args) {
        Oops stu1=new Oops();
        // stu1.name="sonu";
        stu1.roll_no=66;
        stu1.print();
        stu1.eat();

    }
}
