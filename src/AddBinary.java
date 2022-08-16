public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        int x = a.length() - 1;
        int y = b.length() - 1;
        String res = "";
        int carry = 0;
        while (x >= 0 || y >= 0) {
            int firstDigit = x >= 0 ? a.charAt(x--) - '0' : 0;
            int secondDigit = x >= 0 ? b.charAt(y--) - '0' : 0;
            int sum = firstDigit + secondDigit + carry;
            carry = sum / 2;
            res = sum % 2 + res;
        }
        if (carry == 1) res = 1 + res;
        return res;
    }
}

