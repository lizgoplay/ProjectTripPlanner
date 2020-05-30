
import java.util.Scanner;
public class ProjectTripPlanner {
    public static void main(String[] args) {
        intro();
        budget();
        time();
        distance();
    }
    public static void intro(){
        Scanner intro = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = intro.next();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String place = intro.next();
        System.out.println("Great! " + place + " sounds like a great trip");
        System.out.println("***********");
        System.out.println();
    }
    public static void budget(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend no your trip? ");
        int spend = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currencySymbol = input.next();
        System.out.print("How many " + currencySymbol + " are there in 1 USD? ");
        double conversion = input.nextDouble();
        System.out.println();
        System.out.println("If you are travelling for " + days + " days that is the same as " + (days*24) + " hours or " +(days*1440)+ " minutes");
        double SpendPerDay = Math.floor(((double)spend/(double)days)*100)/100;
        System.out.println("If you are going to spend $" + spend + " USD that means per day you can spend up to $"+SpendPerDay+" USD");
        double SpendConversion = Math.floor(((double)spend*conversion)*100)/100;
        double SpendConversionPerDay = Math.floor((SpendConversion/days)*100)/100;
        System.out.println("Your total budget in " + currencySymbol + " is " + SpendConversion +" "+ currencySymbol+ ", which per day is " + SpendConversionPerDay +" " +currencySymbol);
        System.out.println("***********");
        System.out.println();
    }
    public static void time(){
        Scanner time = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int hours = time.nextInt();
        int MidnightDifference;
        int NoonDifference;
        if (hours<0) {
            MidnightDifference=24+hours;
        }
        else {
            MidnightDifference=0+hours;
        }
        NoonDifference = 12+hours;
        if (MidnightDifference>=24) {
            MidnightDifference = MidnightDifference%24; }
        if (NoonDifference>=24){
            NoonDifference = NoonDifference%24; }
        System.out.println("That means that when it is midnight at home it will be "+MidnightDifference+":00 in your travel destination" +
                "\nand when it is noon at home it will be "+NoonDifference+":00");
        System.out.println("***********");
        System.out.println();
    }
    public static void distance(){
        Scanner distance = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        int km2 = distance.nextInt();
        double miles2 = Math.floor((km2 /2.59000259)*100)/100;
        System.out.println("In miles2 that is " +miles2);
        System.out.println("***********");
        System.out.println();
    }

}
