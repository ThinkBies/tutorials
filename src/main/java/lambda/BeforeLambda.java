package lambda;

/**
 * This example the demonstrates the usage of anonymous class(Before Lambda)
 * @author thinkbies.com
 *
 */
public class BeforeLambda {
	
	public static void main(String[] args) {
		
		EventListener<String> listener = new EventListener<String>() {
			
			//Member variables like these are not allowed in Lambda
			private int count;
			
			public void execute(String str) {
				System.out.println("Executing "+str);
				System.out.println("Executed "+(++count)+" time(s)");
			}
			
		};
		
		listener.execute("Listener 1");
		listener.execute("Listener 2");
		listener.execute("Listener 3");
		
	}

}
