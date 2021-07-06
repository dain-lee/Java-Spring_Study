
public class ArrayApp {

	public static void main(String[] args) {
		
		// egoing, jinhuck, youbin 
//      String users = "egoing, jinhuck, youbin";
        String[] users = new String[3];
        users[0] = "egoing";
        users[1] = "jinhuck";
        users[2] = "youbin";
         
        System.out.println(users[1]); // jinhuck
        System.out.println(users.length); // 3
         
        int[] scores = {10, 100, 100}; // ¿ø¼Ò, element
        System.out.println(scores[1]); // 100
        System.out.println(scores.length); // 3

	}

}
