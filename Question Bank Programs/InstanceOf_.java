class O{}
class A extends O{}
class B extends O{}

public class InstanceOf_ {
    
    public static void main(String args[])
    {
        O a = new A();
        O b = new B();

        System.out.println(a instanceof A);
        System.out.println(a instanceof B);

        System.out.println(b instanceof A);
        System.out.println(b instanceof B);

        System.out.println(a instanceof O);
        System.out.println(b instanceof O);



    }



}
