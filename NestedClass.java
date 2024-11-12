package nestedclass;
class Outer
{
    void display()
    {
        System.out.println("Outer class display method");
    }
    class Inner
    {
        void display()
        {
            System.out.println("Inner class display method");
        }
    }
}
public class NestedClass {
    public static void main(String[] args) {
        Outer obj1=new Outer();
        obj1.display();
        Outer.Inner obj2=obj1.new Inner();
        obj2.display();
        // TODO code application logic here
    }
}
