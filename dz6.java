

import java.util.HashMap;
import java.util.Iterator;

public class dz6 {
    private static HashMap<Integer, Object> mapH = new HashMap<>();
    private static final Object OBJ = new Object();
    public static void main(String[] args) {
        addToHMap(0);
        addToHMap(7);
        addToHMap(43);
        addToHMap(13); 
        addToHMap(44);
        addToHMap(1);
        addToHMap(9);
        addToHMap(38);
        addToHMap(10);
        addToHMap(50);
        System.out.println(isEmpty());

        printConsole();
        System.out.println();
        try {
            System.out.println(printOneEl(20));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addToHMap(Integer number){
        mapH.put(number, OBJ);   
    } 


    private static boolean isEmpty(){
        return mapH.isEmpty();
    }


    private static void printConsole(){
        Iterator<Integer> iterator = mapH.keySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }


    private static int printOneEl(int index){
        return (Integer)mapH.keySet().toArray()[index];
    }      
}

