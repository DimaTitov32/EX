public class Solution {
    public static void main(String[] args) {
        System.out.println(SubProdAndSum(234));
    }
    public static int SubProdAndSum(int n){
        int prod = 1;
        int sum = 0;
        int result;

        while (n>0)
        {
            int digit = n % 10;
            prod *= digit;
            sum += digit;
            n /= 10;
        }
        return prod - sum;
    }
}
