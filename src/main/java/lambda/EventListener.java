package lambda;

/**
 * This is a simple event listener interface
 * @author thinkbies.com
 *
 */
public interface EventListener<T> {

	public void execute(T t);
	
}
