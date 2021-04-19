package academy.learnprogramming;

public class LargestPrime {
 public static int getLargestPrime(int number){
      if((number<0) && (!isPrime(number))){
          return -1;
      }
      else{
          
      }

 }
 public static boolean isPrime(int num){
     while(num>1){
         if(num%2!=0){
            return true;
         }
     }return false;
 }
}
