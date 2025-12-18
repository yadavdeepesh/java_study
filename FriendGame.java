interface Game1{
    void method1();
    void method2();
}
interface Game2 extends Game1{
    void method3();
}
public class FriendGame implements Game2{
    public void method1(){
        System.out.println("Play game 1");
    }
      public void method2(){
        System.out.println("Play game 2");
    }
      public void method3(){
        System.out.println("Play game 3");
    }
}
