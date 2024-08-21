import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {

        BigInteger result = factorial(new BigInteger("100"));
        System.out.println(result);
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.compareTo(BigInteger.ZERO) < 0) {
            return BigInteger.ZERO;
        }
        if (n.compareTo(BigInteger.ONE) == 0) {
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}