public class DigitSum {
    public static void main(String[] args) {
        int result = add(7042);
        System.out.println(result);
    }

    static int add(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + add(n/10);
    }
}


/* base case:
 *      if(n<=10){
            return n;
        }
 */