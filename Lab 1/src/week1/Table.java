package week1;

public class Table {
	
    private int length = 0;
    private int width = 0;
    private int area =0;
 
    public void changeLength(int newValue) {
         length = newValue;
    }
 
    public void changeWidth(int newValue) {
         width = newValue;
    }
 
    public void area() {
         area = length * width;
    }
 
    public void printStates() {
         System.out.println("The area of the table with a length of " + length + "cm and a width of " + width + "cm is " + area + "cm squared.");
    }
}


