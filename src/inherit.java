class Cal {
    public int sum(int v1,int v2){
        return v1+v2;
    }
}
//1차원 적인 방법
class Cal1 {
    public int sum(int v1, int v2) {
        return v1 + v2;

    }
    public int minus(int v1, int v2) {
        return v1 - v2;
    }
}   //상속을 이용할시
class Cal2 extends Cal{
    public int minus(int v1, int v2) {
        return v1 - v2;
    }
}
public class inherit {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(1, 4));
        Cal1 c1 = new Cal1();
        System.out.println(c1.minus(5, 1));
        Cal2 c2=new Cal2();
        System.out.println(c2.minus(5,1));//상속 받았기 때문에 출력이 가능함

    }
}
