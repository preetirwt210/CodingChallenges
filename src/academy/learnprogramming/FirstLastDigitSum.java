package academy.learnprogramming;

public class FirstLastDigitSum {

    public static int sumFirstAndLast(int number){

        if(number<0){
            return -1;
        }
         int sum=0;
            int lastdigit=0;
            lastdigit=number%10;
            while(number>9){
                number/=10;
         }
            return lastdigit+number;
    }
}
