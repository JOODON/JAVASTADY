public class ClassStady3 {
    public static void main(String[] args) {
        Game Player1=new Game("주동호",30);
        Game Player2=new Game("이선영",30);
        Player1.print(Player2);
        Player1.print(Player2);
        Player1.print(Player2);
    }
}
class Game {
    String name;
    int hp;
    Game(String Playername, int Playerhp) {
        name = Playername;
        hp = Playerhp;
    }
    void print(Game Punch){
        Punch.hp-=10;//-10은 -10을 대입 =앞에다가 -를 붙혀야 10을빼줌
        System.out.printf("%s님의 펀치 남은 HP %d입니다\n",name,hp);
        System.out.printf("%s님의 펀치 남은 HP %d입니다\n",Punch.name,Punch.hp);
    }
}
