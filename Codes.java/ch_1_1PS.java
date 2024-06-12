import java.util.Scanner; 
public class ch_1_1PS {
    public static void main(String[] args) {
       System.out.println("Enter value of KM : ");
       Scanner sc = new Scanner(System.in);
       int  km = sc.nextInt();
        float mile = (float) (0.62 * km);
        System.out.println("Miles : "+mile);

    }
}
