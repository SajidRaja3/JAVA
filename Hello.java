import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your 1st Number: ");
        a=sc.nextInt();
        System.out.print("Enter Your 2nd Number: ");
        b=sc.nextInt();
        System.out.print("Sum of Numbers is : ");
        System.out.println(a+b);
    }
}
