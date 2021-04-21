package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int sum=0;
        int count=0;
        double avg=0;
        Scanner scanner=new Scanner(System.in);
        while(true){
            boolean isAnIntValue=scanner.hasNextInt();

            if(isAnIntValue){
                int number=scanner.nextInt();
                count++;
                sum+=number;
                avg=(double) sum/count;

            }
            else{
                break;
            }
              scanner.nextLine();
        }
        long average=Math.round(avg);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}