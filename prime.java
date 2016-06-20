import java.util.*;

public class prime {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Type your number: ");
      int num = console.nextInt();
      boolean prime = isPrime(num);
      if (prime) {
         System.out.println("Is it a prime number? :" + prime);
      } else {
         System.out.print(prime + "! Why? " + num + " = ");
         factor(num);
      }
   }
   
   public static boolean isPrime(int num) {
      for (int i = 2; i < num; i++) {
         if (num % i == 0) {
            return false;
         }      
      }
      return true;
   }
   
   public static void factor(int num) {
      int i = 2;
      while (num > 1) {
         if (num % i == 0) {
            System.out.print(i + " ");
            num /= i;
         } else {
            i++;
         }
      }
      System.out.println();
   }
   
}