public class ReverseCases {
	public static void main(String[] args) {
		int[] numberArray = {1, 2, 3, 4, 5};
		reverseNumberArray(numberArray);
		System.out.println("Order of numbers after reverse: ");
		for (int number : numberArray) {
			System.out.print(" " + number);
		}

		String string = "Hello World I'm Thang";
		String reverseString = reverseStringWords(string);
		System.out.println("\nString after reverse: ");
		System.out.println(" " + reverseString);
	}

	public static void reverseNumberArray(int[] numberArray) {
		MyStack<Integer> stack = new MyStack<>();
		for (int number : numberArray) {
			stack.push(number);
		}
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = stack.pop();
		}
	}

	public static String reverseStringWords(String string) {
		String[] words = string.split(" ");
		MyStack<String> stack = new MyStack<>();
		for (String word : words) {
			stack.push(word);
		}
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			reverseString += stack.pop() + " ";
		}
		return reverseString;
	}
}
