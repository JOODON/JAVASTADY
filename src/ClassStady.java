public class ClassStady {
    public static void main(String[] args) {
        Hero Player1 = new Hero();
        Player1.name="주동호";
        Player1.hp=100;
        Player1.punch();
        Player1.life();
    }
}
        //필드로 만들기
        class Hero {
            String name;
            int hp;
            //메소드 만들기
            public void punch () {
                System.out.println(name + "의 펀치!");
            }
            public void life () {
                System.out.println(name+"님의 남은 HP는"+hp +"입니다" );
            }
        }
