package academy.learnprogramming;

import java.util.Scanner;

public class MinAndMax {
    public static void minAndMaxInput(){
        Scanner s = new Scanner(System.in);
        int min=0;
        int max=0;
        boolean first=true;
        while(true) {
            System.out.println("Enter Number");
            boolean isAnInt=s.hasNextInt();
            if(isAnInt){
                int number = s.nextInt();
                if(first){
                    first=false;
                    min=number;
                    max=number;
                }
                if(number>max){
                    max=number;
                }if(number<min){
                     min=number;
                }
            }else{
                  break;
            }
               s.nextLine();
        }
        System.out.println("min: " + min + " max: " + max);
        s.close();
    }
}
