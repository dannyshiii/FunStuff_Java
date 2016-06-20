import java.util.*;

public class prime2 {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Type your range: ");
      int range = console.nextInt();
      System.out.print("Prime number(s) in this range: ");
      printPrime(range);
   }
   
   public static void printPrime(int range) {
      int count = 0;
      for (int i = 2; i <= range; i++) {
         boolean isPrime = prime(i);
         if (isPrime) {
            System.out.print(i + " ");
            count++;
         }
      }
      System.out.println();
      System.out.println("There are " + count + " prime numbers in the range.");
   }

   public static boolean prime(int num) {
      for (int i = 2; i < num; i++) {
         if (num % i == 0) {
            return false;
         }      
      }
      return true;
   }
   
}