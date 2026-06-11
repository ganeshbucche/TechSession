import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    long mod = 1000000007;
    long product = 1;

    for(int i = 0 ; i < N ; i++){
        long num = sc.nextLong();
        product = ((product * num) % mod);
    }

    System.out.println(product);
    sc.close();

    }
}
