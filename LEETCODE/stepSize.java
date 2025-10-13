package LEETCODE;

public class stepSize {
    
    public static void main(String[] args) {

        int num = 8;
        System.out.println(countSteps(num));
    }

    static int countSteps(int num){

        if(num<=2)  return num;

        return countSteps(num-1)+countSteps(num-2);
    }
}
