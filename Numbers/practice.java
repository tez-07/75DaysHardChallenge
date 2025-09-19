public class practice {
    public static void main(String[] args) {
        
        int digit = 372;
        int temp = digit;
        int count =0;
        int sum =0;

        while (temp!=0) {
            count++;
            temp= temp/10;
        }
        System.err.println(count);
        
        temp = digit;
        while (temp!=0) {
            int rem = temp%10;
            sum += Math.pow(rem, count);
            temp = temp/10;
        }
        System.out.println(sum);

        if(digit==sum){
            System.out.println("armstrong number");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
}
