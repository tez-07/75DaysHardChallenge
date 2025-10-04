public class nto1 {

    public static void main(String[] args) {
        revfun(5);
        fun(5);
    }

    static void revfun(int n){
        if(n==0){
            return;
        }

        revfun(n-1);
        System.out.print(n+" ");
        System.out.println();
    }

    static void fun(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        fun(n-1);
    }

}
