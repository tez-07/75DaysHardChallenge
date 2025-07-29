//Fibonacci Series
//0 , 1
//1 , 2, 3, 5, 8, 13

package Days75;
public class Day1{

    public static void main(String[] args){

        int n1=0, n2=1, sum =0;

        System.out.println(n1+" "+n2);          // 0  1
        
        for(int i=2; i<10; i++){
            sum = n1 + n2;                      //0 + 1
            System.out.println(" "+sum);        //1

            n1 = n2;                            //1 
            n2 = sum;                           //1
        }
    }
}