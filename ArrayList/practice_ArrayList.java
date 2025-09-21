package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class practice_ArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(72);
        list.add(12);
        list.add(24);
        list.add(34);
        
        System.out.print(list+" ");
        System.out.println();

        //search
        int element = list.get(2);
        System.out.println(element);

        //insert
        list.add(1, 33);
        System.out.println(list +" ");

        //update
        list.set(0,26);
        System.out.println(list);

        //remove
        list.remove(2);
        System.out.println(list+" ");

        //size
        int size= list.size();
        System.out.println(size);


        //iteration
        for(int i: list){
            System.out.print(i+" ");
        }

        System.out.println();

        for(int i=0; i<size; i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        //Sorting
        Collections.sort(list);
        System.out.println(list);
        
    }
}
