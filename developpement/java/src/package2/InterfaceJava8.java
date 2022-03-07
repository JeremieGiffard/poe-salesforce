package package2;

public class InterfaceJava8 {
    public static void main(String[] args) {
        var zz=new ZZ();
        zz.sayHello();
    }
}

class X{
    public void sayHello(){
        System.out.println("Bonjour tout le monde");
    }
}
interface Y{
    default void sayHello(){
        System.out.println("Salut à tous");
    }
}

interface YY{
    default void sayHello(){
        System.out.println("Say Y");
    }
}

class Z extends X implements Y{

}
class ZZ implements Y,YY{
    @Override
    public void sayHello(){
        Y.super.sayHello();
    }
}