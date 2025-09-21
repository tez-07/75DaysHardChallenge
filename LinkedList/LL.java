package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LL {
    
    @SuppressWarnings("unchecked")              //Remove uncheck warnings
    public static void main(String[] args) {
        
    //Create linkedlist for objects that can store any primitive data types
    LinkedList listAll = new LinkedList<>();
    listAll.add("Hey");
    listAll.add(12);
    listAll.add(true);
    //listAll.add("12.5");

    System.out.println(listAll);


    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(34);

    list.add(45);
    list.add(74);
    list.add(25);

    int size = list.size();
    System.out.print(list);
    System.out.print("Size: "+size);

    Collections.sort(list);                 //Sorting
    System.out.println(list);
    Collections.sort(list.reversed());      // Reverse sorting
    System.out.println(list);

    }
}
