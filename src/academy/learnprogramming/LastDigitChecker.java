package academy.learnprogramming;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if((isValid(num1))&&(isValid(num2))&&(isValid(num3))){
            while((num1>0) &&(num2>0) &&(num3>0)){

                int lastdigit1=num1%10;
                int lastdigit2=num2%10;
                int lastdigit3=num3%10;
             if((lastdigit1==lastdigit2)||(lastdigit2==lastdigit3)||(lastdigit1==lastdigit3)){
                 return true;
             }return false;
            }

        }
        return false;
    }
    public static boolean isValid(int number){
        if((number>=10) && (number<=1000)){
            return true;
        }return false;
    }
}
