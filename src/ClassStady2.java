public class ClassStady2 {
    public static void main(String[] args) {
        Hobread hot=new Hobread();
        hot.name="팥호빵";
        hot.money=600;
        hot.print();
        //야채호빵 가격 입력
        Hobread hot1=new Hobread();
        hot1.name="야채호빵";
        hot1.money=900;
        hot1.print();
        Hobread hot2=new Hobread();
        hot2.name="피자호빵";
        hot2.money=700;
        hot2.print();
    }
}
//필드생성
class Hobread {
    String name;
    int money;

    //메소드 생성
    public void print() {
        System.out.printf("%s 가격은 %d원입니다", name, money);
        System.out.println(" ");
    }
}