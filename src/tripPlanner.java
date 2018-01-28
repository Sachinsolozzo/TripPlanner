import java.util.Scanner;
import java.lang.Math;
public class tripPlanner {
    static String start;
    static String dest;
    public static void main(String[] args) {

        intro();
        budget();
        distanceTime();

    }
    public static void intro(){
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to the Vacation Planner.");
        System.out.println("Hey there! What's your name?");
        String name= input.nextLine();
        System.out.println("Nice to meet you "+name+", where are you travelling to?");
        dest= input.nextLine();
        System.out.println("Where from?");
        start= input.nextLine();
        System.out.println("Great! "+dest+" sounds like a great trip.\n**********");
    }
    public static void budget(){
        Scanner input= new Scanner(System.in);
        System.out.println("\nHow many days are you going to spend travelling?");
        int days= input.nextInt();
        System.out.println("How much money, in rupees are you planning to spend on this trip?");
        double money= input.nextDouble();
        System.out.println(("Please enter the currency symbol of "+dest+" eg. MXC: Mexico City Currency"));
        String symbol= input.next();
        System.out.println("How many "+symbol+" are in one rupee?");
        double convt= input.nextDouble();
        System.out.println("You are travelling for "+days+" days, that is the same as "+(days*24)+" hours or "+(days*24*60)+" minutes.");
        System.out.println("You are going to spend "+money+" rupees, which means you can spend upto "+(money/days)+" rupees per day.");
        System.out.println("Your total budget in "+symbol+" is "+(money*convt)+" "+symbol+" which is "+(money*convt/days)+" "+symbol+" per day.\n**********");
    }
    public static void distanceTime(){
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the respective longitudinal and latitudinal coordinates (degrees) + of "+start);
        double lon1= input.nextDouble()*(Math.PI/180);   //Converting degrees to radians.
        double lat1= input.nextDouble()*(Math.PI/180);
        System.out.println("Similarly enter the coordinates (degrees) of "+dest+" in the same order");
        double lon2= input.nextDouble()*(Math.PI/180);
        double lat2= input.nextDouble()*(Math.PI/180);
        double dis= 2*6371* Math.asin(Math.sqrt(Math.pow(Math.sin((lat2-lat1)/2),2)+(Math.cos(lat1)*(Math.cos(lat2))*(Math.pow(Math.sin((lon2-lon1)/2),2)))));
        // The code written above is the Haversine expression to find the Great-Circle Distance between two points.
        System.out.println("Your destination is at a distance of "+dis+" kms.");
        System.out.println("Ideally it would be a "+(dis/900)+" hr long flight.");    //average flight speed= 900 kmph
        System.out.println("Thank you for using this program. Have a safe journey.");
    }
}
