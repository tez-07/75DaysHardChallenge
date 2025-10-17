package LEETCODE;

public class CalculateMoney {
    

    public static void main(String[] args) {
        int n = 10;
        System.out.println(totalMoney(n));
    }

    static int totalMoney(int n){
        
        int sum =0;
        int startofWeek = 1;
        int dayinWeek =0;

        for(int day =1; day<=n; day++){
            sum += startofWeek + dayinWeek;
            dayinWeek++;

            if(dayinWeek==7){
                dayinWeek=0;
                startofWeek++;
            }
        }

        return sum;
    }
}
