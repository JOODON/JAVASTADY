public class extendStady {
    public static void main(String[]args){
        Wizard wizard=new Wizard("해리포터",100,100);
        System.out.println(wizard.toString());
        Novice novice=new Novice("전사",10);
        System.out.println(novice.toString());
    }
}
class Novice{
    private String name;
    private int hp;
public Novice(String name,int hp){
    this.name=name;
    this.hp=hp;
}
//toString
public String toString(){
    return String.format("%s(HP: %d)",this.name,this.hp);
 }
}
class Wizard extends Novice{
    private int mp;
    public Wizard(String name,int hp,int mp){
        super(name,hp);//기존에 있었던 이름이랑 hp를 선언
        this.mp=mp;
    }
}