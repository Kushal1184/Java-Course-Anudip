import java.util.Scanner;

public class sumofevenusingfor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        int a=0;

        for (int i=1;i<=n;i++){
            a+=i;
        }
        System.out.println("The Sum of the number "+n+" is "+a);
    }
}
