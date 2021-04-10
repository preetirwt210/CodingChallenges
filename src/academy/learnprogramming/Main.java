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
    }
}
