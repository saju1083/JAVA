package basicjava;
import java.util.Scanner;
import java.math.BigInteger;
public class Add_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr the Frist Number:");
        String num1 = sc.nextLine();
        System.out.println("Enter the Second Number:");
        String num2 = sc.nextLine();
        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);
        BigInteger sum = bigNum1.add(bigNum2);
        System.out.println("Sum: " + sum);
    }
}
