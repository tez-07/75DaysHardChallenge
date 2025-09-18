package Hash;

import java.util.HashSet;
import java.util.Iterator;

public class hset {

    public static void main(String[] args) {
        
        //creating hashset
        HashSet<Integer> hset = new HashSet<>();

        //inserting elements
        hset.add(91);
        hset.add(12);
        hset.add(45);
        hset.add(52);
        hset.add(75);

        System.out.print(hset);


        //search
        if(hset.contains(0)){
            System.out.println("doesn't contain 0");
        }else if (hset.contains(12)) {
            System.out.println();
            System.out.println("contains 12");
        }

        //remove
        hset.remove(45);
        System.out.println(hset);

        System.out.println("size of the set: " + hset.size());


        //How to use iterator
        Iterator it = hset.iterator();

        while (it.hasNext()) {
            System.out.print(it.next()+ " ");
        }
        
    }
}

    