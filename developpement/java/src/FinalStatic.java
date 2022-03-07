public class FinalStatic {
    public static void main(String[] args) {
        B b=new B();
        b.direBonjour();
    }
}

class A{
    public final void direBonjour(){
        System.out.println("Bonjour");
    }
}
class B extends A{
    /*@Override
    public void direBonjour(){
        System.out.println("Hello B");
    }*/
}
final class AA{

}
class BB {

}