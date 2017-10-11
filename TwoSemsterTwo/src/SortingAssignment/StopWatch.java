package SortingAssignment;

public class StopWatch { 

    private long start = 0;

    public double Start() {
       return start = System.nanoTime();
    } 

    public double elapsedTime() {
        long now = System.nanoTime();
        return ((now - start)/1000000);
    }
    public void reset(){
    	start = 0;
    }
}