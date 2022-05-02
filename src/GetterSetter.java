public class GetterSetter{
    public static void main(String[]args){
        Person joo=new Person("주동호","010-7761-8482");
        System.out.printf("이름:%s \n전화번호:%s\n",joo.getName(),joo.getNumber());
        joo.setName("이선영");
        joo.setNumber("010-2417-4254");
        System.out.printf("이름:%s \n전화번호:%s",joo.getName(),joo.getNumber());
    }
}
class Person{
    private String name;
    private String number;

    public Person(String name,String number){
        this.name=name;
        this.number=number;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
