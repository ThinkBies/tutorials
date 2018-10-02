package lambda;

/**
 * This example demonstrates the usages of Lambda Expressions in Java
 * @author thinkbies.com
 *
 */
public class LambdaExample {
	
	public static void main(String[] args) {
		
		EventListener<String> listener = (String str)-> System.out.println("Executing "+str);
		listener.execute("Listener 1");
		listener.execute("Listener 2");
		listener.execute("Listener 3");
		
	}

}
