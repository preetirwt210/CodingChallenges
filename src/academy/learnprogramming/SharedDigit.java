package academy.learnprogramming;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b ){
        if((a>=10 && a<=99)&&(b>=10 && b<=99)){
         int numFirst=a/10;
         int numLast=a%10;
         int numFirst2=b/10;
         int numLast2=b%10;

         return ((numFirst==numFirst2)||(numLast==numLast2)|| (numFirst==numLast2)||(numFirst2==numLast));
        }
        return false;
    }
}
