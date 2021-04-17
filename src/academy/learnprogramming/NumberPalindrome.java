package academy.learnprogramming;

public class NumberPalindrome {
       public static boolean isPalindrome(int number) {
         int reverse=0;
         int lastDigit;
         int num=number;
         while(num!=0 || num>0){
             lastDigit=0;
             lastDigit= num%10;
             reverse=(reverse *10) + lastDigit;

             num/=10;
         }if(reverse==number){
             return true;
           }
         return  false;
       }
}
