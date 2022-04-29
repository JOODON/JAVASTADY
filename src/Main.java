public class Main {
    public static void main(String[] args) {
       double[] grades={3.45,2.82,3.85,3.94};
       grades[2]=5.1;
        System.out.println("1학년 "+grades[0]);
        System.out.println("2학년 "+grades[1]);
        System.out.println("3학년 "+grades[2]);
        System.out.println("4학년 "+grades[3]);

        int[] sales= new int[5];//몇칸짜리 배열을 생성할지
        sales[0]=52;
        sales[1]=50;
        sales[2]=55;
        sales[3]=42;
        sales[4]=38;
        int sum=sales[0]+sales[1]+sales[2]+sales[3]+sales[4];
        System.out.println("총 판매량은 "+sum+"잔");

        int[] array=new int[10];
        int size=array.length;//배열의 갯수 구하는 코드
        System.out.println(size);
        }
    }