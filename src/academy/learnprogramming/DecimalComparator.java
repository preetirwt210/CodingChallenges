package academy.learnprogramming;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double myFirstDecimalNumber, double mySecondDecimalNumber){
        int firstNumber=(int)(myFirstDecimalNumber*1000);
        int secondNumber=(int)(mySecondDecimalNumber*1000);

        if(firstNumber - secondNumber==0){
            return true;
        }
        else {
            return false;
        }
    }
}
