public class abstractStday {
    public static void main(String[] args) {
        Juice j = new Juice("주스",3000);
        Coffee c = new Coffee("커피",2000);
        Beer b = new Beer("맥주",3000);
        Water w = new Water("물",100);
        Tea t = new Tea("티",300);
//그릅화 해서 하나로 묶어줌
        Drink[] drinks = {j, c, b, w, t};
//포문 처음부터 끝까지 전부 순회
        for (Drink d : drinks) {
            System.out.println(d.toString());
        }
    }
}
abstract class Drink {
    private String name;
    private int price;
//생성자
    public Drink(String name,int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return name + "은" + price + "입니다";
    }
}

class Juice extends Drink{
    public Juice(String name,int price){
        super(name,price);
    }
}
class Coffee extends Drink{
    public Coffee(String name,int price){
        super(name,price);
    }
}
class Beer extends Drink {

    public Beer(String name,int price){
        super(name,price);
    }
}
class Water extends Drink {
    public Water(String name, int price) {
        super(name, price);
    }
}
class Tea extends Drink {
    public Tea(String name, int price) {
        super(name, price);
    }
}


