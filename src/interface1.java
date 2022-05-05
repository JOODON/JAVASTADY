public class interface1 {
    public static void main(String[] args){
   SmartPhone s=new SmartPhone();
   s.beep();
   s.playmusic();
    }
}
//이놈으로 빈 껍데기를 만들어줌 공통된 것들에서는 사용하기 좋음
//클래스를 안만들어줘도 됨
interface Alarm{
    public void beep();
    public void playmusic();
}
//스마트폰이라는 클래스를 만들어서 알람이라는 인터페이스를 불러내서 사용 불러낼떄는 implements를 사용한다
//그뒤로 오버라이딩을 해서 추가로 만든다
class SmartPhone implements Alarm{
 public void beep(){
     System.out.println("알람음");
    }
    @Override
    public void playmusic() {
        System.out.println("음악재생");
    }
}