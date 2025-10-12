package LEETCODE;


public class MostContainers11 {
    
    public static void main(String[] args) {
        int s[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(calculation(s));
    }

    static int calculation(int s[]){
        int l = 0;
        int r = s.length-1;
        
        int mid = l + (r-l)/2;

        int lar1=s[0];
        int lar2=s[r];
        while(l<mid){
            if(s[l]>lar1){
                lar1 = s[l];
                l++;
            }
            l++;
        }

        while (mid+1<r){
            if(s[mid+1]>lar2){
                lar2 = s[mid+1];
                r--;
            }
            r--;
        }

        //choose index r then left and take out the difference to find the width
        //height = [1, 8, 6, 2, 5, 4, 8, 3, 7];
        //indexes:  0  1  2  3  4  5  6  7  8
        // here: 8-1=7
        int width = r-l;
        int max = Math.multiplyExact(lar1, lar2);
        return max;
    }
}
