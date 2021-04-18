package academy.learnprogramming;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        int lastDigit=0;


        while(number>0){
            lastDigit =number%10;// 252%10= 2
            if(number%2==0){
                sum=sum+lastDigit; //sum=
            }
            number/=10;
        }
        return sum;
    }
}
