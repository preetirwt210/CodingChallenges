package academy.learnprogramming;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){ //12,30
        if((first<10)||(second<10)){
            return -1;
        }
        while(first!=second){
            if(first>second){ //12!>30 //12!>18 // 12>6
                first=first-second; // first=12-6=6;
            }
            else{
            second=second-first; //second=30-12=18; // second=18-12=6;
        }
        }
        return second; //18;//6
    }
}
