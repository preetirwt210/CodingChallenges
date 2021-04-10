package academy.learnprogramming;

public class EqualSumChecker {
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber){
        if(thirdNumber== firstNumber + secondNumber){
            return true;
        }
        else{
            return false;
        }
    }
}
