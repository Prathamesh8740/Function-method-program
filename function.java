import java.util.Scanner;
public class function{
    public static int sum(int num1,int num2 ,int num3){
       int sum = num1 + num2 +num3;
      // System.out.println("sum is :"+ sum );
      return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int addition = sum(num1,num2,num3);
        System.out.println(addition);
        sc.close();
    }
}
