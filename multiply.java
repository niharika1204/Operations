import java.util.Scanner;
public class multiply {

    public static void main(String[] args) {
        
        int num1, num2, product;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        product = num1 * num2;
        System.out.println("Product of these numbers: "+product);
    }
}
