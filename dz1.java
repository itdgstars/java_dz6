import java.util.Random;

public class dz1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2000);
        System.out.println("Случайное целое число =  " + i);

        int b = Integer.toBinaryString(i).length()-1;
        System.out.println("Номер старшего значения бита =  "+b);
       
              
        short count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if ( j % b == 0) {
                count++;
            }
        }
        System.out.println("длина массива m1 =  "+ count); 
        int[] m1 = new int [count];
        count = 0;
               
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j % b == 0) {
                m1[count++] = j;
                }
        } 

        count = 0;
      
        for (int j = Short.MIN_VALUE; j < i; j++){
            if ( j % b != 0) {
                count++;
            }
        }
        System.out.println("длина массива m2 =  "+ count); 
        int[] m2 = new int [count];
        count = 0;
                
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j % b != 0) {
                m2[count++] = j;
                }
        }
        
        }
}