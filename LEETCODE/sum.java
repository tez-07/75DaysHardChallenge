public class sum {
    
    public static void main(String[] args) {
        
        int mainnum=138;
        System.out.println(add(mainnum));
        
    }

    static int add(int num){
        
        int sum =0;
        while (num>0) {
            int rem = num % 10;
            sum += rem; 
            num = num/10;
        }

        if(sum>9){
            return add(sum);
        }
        return sum;
    }
}
