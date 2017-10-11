
public class Timer {

	    private long start = 0;

	    public double Start() {
	       return start = System.nanoTime();
	    } 

	    public void elapsedTime() {
	        long now = System.nanoTime();
	         System.out.println(" " + (now - start)+ " ns");
	    }
	    public void reset(){
	    	start = 0;
	    }
	}


