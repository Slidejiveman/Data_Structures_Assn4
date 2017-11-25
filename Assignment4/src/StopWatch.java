import java.io.*;

public class StopWatch {
	private long startTime = 0;
	private long stopTime = 0;
	
	public StopWatch(){
		
	}
	
	public void start(){
		this.startTime = System.nanoTime();
	}
	
	public void stop(){
		this.stopTime = System.nanoTime();
	}
	
	public long runtime(){
		return (this.stopTime - this.startTime);
	}
	
}
