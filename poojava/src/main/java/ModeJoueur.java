
public class ModeJoueur {

	PlayerGiveNumber p = new PlayerGiveNumber();
	String numberPlayer1;
	String numberPlayer2;
	
	public String GameModePlayer(int maxChance) {
		System.out.println("Taper le numéro de votre choix" );
		numberPlayer1 = p.choicePlayer();
		while (numberPlayer1.length() != 4) {
			System.out.println("Un nombre de 4 digit seulement");
			numberPlayer1 = p.choicePlayer();
		}

		for (int i = 1; i <= maxChance; i++) {
			System.out.println("Nombre de chance utiliser " + (i - 1) + " sur " + maxChance);
			System.out.println("Tenté votre chance");
			numberPlayer2 = p.choicePlayer();
			if (numberPlayer2.equals(numberPlayer1) == true) {
				System.out.println("====");
				System.out.println("C'est gagner");
				i = 10;
			}
			else if (numberPlayer2.equals(numberPlayer1) == false) {
				CompareTheyValue(numberPlayer1, numberPlayer2);
			}
		}
		return ("0");
	}
	
	public void CompareTheyValue(String s1, String s2) {
		Integer nombre1 = Integer.parseInt(s1);
		Integer nombre2 = Integer.parseInt(s2);
		
		if(nombre1 > nombre2) {
			System.out.println("Plus grand");
			CompareAndFindVarience(s1, s2);
		}
		else {
			System.out.println("Plus petit");
			CompareAndFindVarience(s1, s2);
		}
	}
	
	public void CompareAndFindVarience(String s1, String s2) {
		Integer[] nb1 = new Integer[4];
		Integer[] nb2 = new Integer[4];
		char[] array1 = new char[4];
		char[] array2 = new char[4];
				
		for (int i = 0; i != array1.length ; i++) {
			array1[i] = s1.charAt(i);
			array2[i] = s2.charAt(i);
			nb1[i] = Character.getNumericValue(array1[i]);
			nb2[i] = Character.getNumericValue(array2[i]);
			
			if (nb1[i] > nb2[i])
				System.out.print("+");
			else if (nb1[i] < nb2[i])
				System.out.print("-");
			else
				System.out.print("=");
		}
		System.out.println(" ");
	}
}
