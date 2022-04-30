import java.util.Scanner;
public class Helloworld{
    public static void main(String[]args){
        Scanner dan=new Scanner(System.in);
        int number;
        System.out.println("몇 단을 까지출력 하시겠습니까??");
        number = dan.nextInt();
        for (int i=2; i<=9; i++) {
            for (int j = 2; j <= number; j++) {
                System.out.printf("%d*%d=%-3d",j,i, i*j);
            }
            System.out.println( );
        }

    }
}