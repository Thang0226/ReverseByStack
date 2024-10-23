import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack<T> {
	private final LinkedList<T> stack;

	public MyStack() {
		stack = new LinkedList<>();
	}

	public void push(T element) {
		stack.addLast(element);
	}

	public T pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack.removeLast();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public int size() {
		return stack.size();
	}

	public T peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack.getLast();
	}
}

