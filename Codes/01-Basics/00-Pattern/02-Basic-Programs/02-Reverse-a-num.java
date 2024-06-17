
// Reverse a num

public class Main {

    public static int printRevNumber(int num) {

        int revNumber = 0;
        while(num != 0) {
            int lastDigit = num % 10;
            revNumber = revNumber * 10 + lastDigit; 
            num /= 10;            
        }

        return revNumber;
    }

    public static void main(String[] args) {
        int revNum = printRevNumber(1234);
        System.out.println(revNum);
    }
}
