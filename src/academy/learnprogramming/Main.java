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

     DayOfTheWeek.printDayOfTheWeek(2);
     NumberInWord.printNumberInWord(1);
     System.out.println(NumberOfDaysInMonth.isLeapYear(2017));

     Twowheeler tw1;
     Fourwheeler fw1;
     tw1=new Twowheeler("RJ090990","red", "The most popular scooters in India have a displacement of 110-125cc with a mileage of around 45-60kmpl.", "Activa");
     fw1=new Fourwheeler("RJ325674","black","Securely seated.The reviving engine.Start of the ignition.A rhythmic blinker.Click of the door open", "SUV","medium");
     tw1.display();
     fw1.display();

     System.out.println(NumberOfDaysInMonth.getDaysInMonth(12,10000));

     SumOdd.sumOdd();
     System.out.println(SumOddRange.sumOdd(1,100));
     System.out.println(sumDigits.sumDigits(-1));

     System.out.println(NumberPalindrome.isPalindrome(-222));
    }
}
