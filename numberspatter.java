import java.util.Scanner;

public class numberspatter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int n= sc.nextInt();
        int a=1;

        for (int i=0;i<n;i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
