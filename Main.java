/*
PSUDEOCODE
1. Importing time & date formatter , Local Date time and java util
2.Taking name as user input
3.Declaring month, day ,year
4.Taking month,day , year as user input
5.If month * day == year then Display That Date is magic! otherwise displaying Sorry that's just a regular date... not magic.

 */
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Working Directory" + currentDirectory);

        System.out.println("Programmer: "+ System.getProperty("user.name"));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy @ hh:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Lab 16.1: "+dtf.format(now));
        System.out.print("\n");

        System.out.print("Enter your name: ");
        String userName = scanner.next();

        int month;
        int day;
        int year;
        System.out.print("Enter the number for a month : " );
        month = scanner.nextInt();//read integer value from user
        System.out.print("Enter the number for a day : " );
        day = scanner.nextInt();//read integer value from user
        System.out.print("Enter a two-digit year : " );
        year = scanner.nextInt();//read integer value from user

        if (month * day == year){
            System.out.println(userName +", That Date is magic!");
        }
        else//otherwise
        {
            System.out.println(userName + ", Sorry that's just a regular date... not magic.");
        }
    }
}