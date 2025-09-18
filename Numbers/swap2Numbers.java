public class swap2Numbers {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int c;

        System.out.println("Before swapping "+a+" and "+b);

        c = b;      //c=20      b empty
        b = a;      //b=10      a got empty
        a = c;      //a=20      

        System.out.println("After swapping "+a+" and "+b);
    }
}
