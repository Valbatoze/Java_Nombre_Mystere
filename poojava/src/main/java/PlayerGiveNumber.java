import java.util.Scanner;

public class PlayerGiveNumber {

	public PlayerGiveNumber() {
		
	}
	
	public String choicePlayer() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String choixPlayer = scanner.nextLine();
		
		return choixPlayer;
	}
}