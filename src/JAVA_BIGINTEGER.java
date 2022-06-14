import java.math.*;
import java.util.Scanner;
public class  JAVA_BIGINTEGER{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String  s1=input.nextLine();
        String s2=input.nextLine();
        input.close();
        System.out.println(new BigInteger(s1).add(new BigInteger(s2)));
        System.out.println(new BigInteger(s1).multiply(new BigInteger(s2)));
    }
}
