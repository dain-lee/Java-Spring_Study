
public class WhyMethod {

	public static void main(String[] args) {
		
		printTwoTimes("a", "-");
        // 100000000
        printTwoTimes("a", "*");
        // 100000000
        printTwoTimes("a", "&");
        printTwoTimes("b", "!");

	}
	
	public static void printTwoTimes(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }

}
