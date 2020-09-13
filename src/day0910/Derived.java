package day0910;
class Base{
    public Base(String s){
        System.out.print("B");
    }
}
public class Derived extends Base{
    public Derived (String s) {
        super("asd");
        System.out.print("D");
    }
    public static void main(String[] args){
        new Derived("C");
    }
}
