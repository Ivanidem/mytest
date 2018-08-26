package mytest;
public class Mytest{

   public static void main(String args[]){
       //Mytest t1 = new Mytest();
       int q = 0;
       A c = new A();
       c.xx();
       //System.out.println(c.z);
       }
   }
class A {
    protected int x = 1;
    public A (){
    System.out.println("A");
    }
    protected void xx (){
    System.out.println("Ax");
    }
}

class B extends A {
    protected int y = 2;
    public B (){
    System.out.println("B");
    }
    public void xx (){
    System.out.println("Bx");
    }
}

class C extends A {
    private int z = 3;
    public C (){
    System.out.println("C111");
    }
    public void xx (){
    z += 20;
    System.out.println(z);
    }
    public void xx (int ass){
        
    }
}
