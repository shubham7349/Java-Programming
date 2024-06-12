//claculate the percentage of given number
import java.util.Scanner;
public class ch_1_5ps {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter subject 1");
        int a=sc.nextInt();
        System.out.println("enter subject of 2");
        int b=sc.nextInt();
        System.out.println("enter subject of 3");
        int c=sc.nextInt();
        System.out.println("enter subject of three");
        int d=sc.nextInt();
        System.out.println("subject of 5");
        int e=sc.nextInt();
        int sum=a+b+c+d+e; 
        int percentage=sum/5;
        System.out.println("Percentage : "+percentage);
    
    }
    
}
