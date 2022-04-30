public class StaticStady {
    public static void main(String[] args){
        Test.m1();
        Test test=new Test();
        test.m2();//이렇게 위에 뭘 만들어줘야 호출이됨 근데 static은 그냥 호출
    }
 }
 class Test{
    static void m1(){
        System.out.println("유틸리티 메소드");
    }
    void m2(){
        System.out.println("걍 메소드");
    }
 }