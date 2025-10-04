public class factorial {

    public static void main(String[] args) {
        int res = fac(5);
        System.out.println(res);
    }

    static int fac(int n){
        if(n<=1){
            return 1;
        }
        
        return n* fac(n-1);


        /*
         * fact(5) = fact(5) * fact(4)                          = fact(5) *24 = 120
         *                  fact(4) * fact(3)                   = fact(4) * 6 = 24
         *                      fact(3) * fact(2)               = fact(3) * 2 = 6
         *                                  fact(2) * fact(1)   = 2
         * 
         */
    }
    
}
