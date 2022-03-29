
import java.util.Scanner;
public class calculator {
    int x=0;
    int y =0;
    public calculator(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int adder(){
        return this.x+this.y;
    }
    public int subtractor(){
        return this.x-this.y;
    }
    public int multiplier(){
        return this.x*this.y;
    }
    public int divider(){
        return this.x/this.y;
    }
    public String clear(){
        this.x = 0;
        this.y =  0;
        return("cleared");
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter a number:");
        int x = myObj.nextInt();  // Read user input
        System.out.print("Enter another number:");
        int y = myObj.nextInt();  // Read user input
        calculator calc = new calculator(x, y);
        System.out.println("Addition: "+calc.adder());
        System.out.println("Subtraction: "+calc.subtractor());
        System.out.println("Multiplication: "+calc.multiplier());
        System.out.println("Division: "+calc.divider());
        System.out.println(calc.clear());
    }
}
