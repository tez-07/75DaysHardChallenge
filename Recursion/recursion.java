package Workshop;

public class recursion {
    
    public static void printNum(int n){
        if(n==6){
            return;
        }
        System.out.print(n+" ");
        printNum(n+1);
    }
    
    public static void main(String[] args) {
     
        printNum(1);
    }
}
