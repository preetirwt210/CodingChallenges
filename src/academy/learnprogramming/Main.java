package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
       PracticeQuestion PQ=new  PracticeQuestion();
        PQ.checkNumber(5);

        SpeedConverter sc=new SpeedConverter();
        sc.printConversion(1.5);

        MegaBytesConverter mb=new MegaBytesConverter();
        mb.printMegaBytesAndKiloBytes(2500);

        boolean shouldWakeUp=BarkingDog.shouldWakeUp(true,1);
        System.out.println(shouldWakeUp);

        boolean isLeapYear=LeapYear.isLeapYear(-1600);
        System.out.println(isLeapYear);

        boolean e=EqualSumChecker.hasEqualSum(1,1,2);
        System.out.println(e);

        boolean t=TeenNumberChecker.hasTeen(9,99,19);
        System.out.println(t);
        boolean s=TeenNumberChecker.isTeen(9);
        System.out.println(s);

       System.out.println(SecondsAndMinutes.getDurationString(65,55));

        System.out.println(AreaCalculator.area(5.0));

        System.out.println(AreaCalculator.area(5.0, 4.0));

     MinutesToYearsDaysCalculator.printYearsAndDays(561600);

     IntEqualityPrinter.printEqual(1,2,3);

     System.out.println(PlayingCat.isCatPlaying(false,35));

     DayOfTheWeek.printDayOfTheWeek(-1);
    }
}
