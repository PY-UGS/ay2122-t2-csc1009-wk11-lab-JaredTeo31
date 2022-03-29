import java.util.Date;
import java.util.Scanner;

public class clockTime {
    String hours;
    String minutes;
    String seconds;
    public void setHours(String hours){
        this.hours = hours;
    }
    public void setMinute(String minute){
        this.minutes = minute;
    }
    public void setSecond(String second){
        this.seconds = second;
    }
    public void setTime(String hours, String minute, String second){
        this.hours = hours;
        this.minutes = minute;
        this.seconds = second;
    }
    public String showTime(){
        return(this.hours+ ":" + this.minutes + ":" + this.seconds);
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter value for hour:");
        String hour=myObj.next();  // Read user input
        System.out.print("Enter value for minute:");
        String minute = myObj.next();  // Read user input
        System.out.print("Enter value for second:");
        String second = myObj.next();  // Read user input
        clockTime clocktime = new clockTime();
        clocktime.setTime(hour, minute, second);
        System.out.println("New time: " + clocktime.showTime());
    }
}
