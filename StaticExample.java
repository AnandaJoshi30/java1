public class StaticExample {
     static int counter=0;
     static void incrementCounter(){
         counter++;
         System.out.println("Counter: " +counter);
     }
     public static void main(String[] args){
         StaticExample.incrementCounter();
         StaticExample.incrementCounter();
     }
}
