import java.util.Scanner;
public class function{
    public static int sum(int num1,int num2 ,int num3){
       int sum = num1 + num2 +num3;
      // System.out.println("sum is :"+ sum );
      return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int addition = sum(a,b,c);
        System.out.println(addition);
        sc.close();
    }
}