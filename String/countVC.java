package String;

public class countVC {
    
    public static void main(String[] args) {
        
        String str = "God, please give me the job!";
        int vowels =0; 
        int conso =0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels ++;
            }else{
                conso ++;
            }
        }

        System.out.println("Total number of vowels are: "+vowels);
        System.out.println("Total number of consonants are: "+conso);
    }
}
