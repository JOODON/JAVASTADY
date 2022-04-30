public class ClassStady {
    public static void main(String[] args) {
        Hero Player1 = new Hero();
        Player1.name="주동호";
        Player1.hp=100;
        Player1.punch();
        Player1.life();
        //Player2를 만들어줌
        Hero Player2 = new Hero();
        Player2.name="이선영";
        Player2.hp=70;
        Player2.punch();
        Player2.life();
        Hero Player3 = new Hero("간달프",40);
        Player3.punch();
        Player3.life();
    }
}
        //필드로 만들기
        class Hero {
            String name;
            int hp;
            Hero(){
            }
            //생성자 만들기
            Hero(String namesave,int hpsave){
            name=namesave;
            hp=hpsave;
            }
            //메소드 만들기
            public void punch () {
                System.out.println(name + "의 펀치!");
            }
            public void life () {
                System.out.println(name+"님의 남은 HP는"+hp +"입니다" );
            }
        }
