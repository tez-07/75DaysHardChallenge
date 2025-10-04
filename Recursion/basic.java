public class basic {
    
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 5) return;        // base case
        System.out.println(n);     // print current number
        print(n + 1);              // recursive call
    }
}
