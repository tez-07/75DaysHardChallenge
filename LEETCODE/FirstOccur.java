package LEETCODE;

public class FirstOccur {
    public int strStr(String haystack, String needle) {

        /*
        int length = haystack.length(); 
        for(int i=0; i<length; i++){
            if(haystack.contains(needle)){
                System.out.println(haystack.indexOf(needle));
                return haystack.indexOf(needle);
            }
        }
        return -1;
         */


        int n = haystack.length();
        int m = needle.length();

        for(int i=0; i<=n-m; i++){
            if(haystack.substring(i, i+m).equals(needle)){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstOccur obj = new FirstOccur();
        obj.strStr("mississipi", "issipi");
    }
}
