package academy.learnprogramming;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstNum, int secondNum, int thirdNum ){
        if((firstNum>=13)&& (firstNum<=19) ||(secondNum>=13)&& (secondNum<=19) ||(thirdNum>=13)&& (thirdNum<=19)){
            return true;
        }
         else {
                return false;
            }
        }
        public static boolean isTeen(int fourthNum){
        if(fourthNum >=13 && fourthNum<=19){
            return true;
        }else{
            return false;
        }
        }
    }

