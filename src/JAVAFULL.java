import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class JAVAFULL {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        Person person=new Person("홍길동",10);
        System.out.println(person.toString());
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }
}
class Person{
    private String name;
    private int age;
    //디폴트 생성자
    Person(){
    }
    //내가 가진 이름이냐 아니냐를 나타낼떄 THis
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
