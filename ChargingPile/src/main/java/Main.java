import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger Log = LoggerFactory.getLogger(Main.class);
	
	
	
	
	public static void main(String[] args) {
		Log.debug("Starting application Context!!!");
		Log.info(Log.getName()+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	    NettyThread nt= new NettyThread();
		nt.start();
		System.out.println("charging");
		System.out.println("charging");
		System.out.println("charging");
		System.out.println("charging");
		System.out.println("charging");	System.out.println("charging");
	}

}
