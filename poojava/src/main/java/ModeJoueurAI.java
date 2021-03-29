
public class ModeJoueurAI {
	GenerateNumber g = new GenerateNumber();
	PlayerGiveNumber p = new PlayerGiveNumber();
	Integer digitOne;
	Integer digitTwo;
	Integer digitThree;
	Integer digitFour;
	Integer mini;
	Integer max;
	int count;
	
	String numberPlayer;
	String numberAI;
	
	public void GameModeJoueurAI(int maxChance) {
		System.out.println("Taper le numéro de votre choix" );
		numberPlayer = p.choicePlayer();
		while (numberPlayer.length() != 4) {
			System.out.println("Un nombre de 4 digit seulement");
			numberPlayer = p.choicePlayer();
		}
		numberAI = g.nombreGenerate();
		for (int i = 0; i < maxChance; i++) {
			System.out.print("Nombre de vie restante à L'AI " + (maxChance - i) + " sur " + maxChance);
			if (numberAI.equals(numberPlayer) == true) {
				System.out.println("====");
				System.out.println("C'est gagner");
				i = 10;
			}
			else if (numberAI.equals(numberPlayer) == false) {
				Comparaison(numberPlayer, numberAI);
				//numberAI = digitOne.toString() + digitTwo.toString() + digitThree.toString() + digitFour.toString();
				numberAI = g.nombreGenerate();
				count = 0;
			}
		}
	}
	
	public void Comparaison(String s1, String s2) {
		Integer nombre1 = Integer.parseInt(s1);
		Integer nombre2 = Integer.parseInt(s2);
		
		if(nombre1 > nombre2) {
			System.out.println("Plus grand");
			CompareAllDigit(s1, s2);
		}
		else {
			System.out.println("Plus petit");
			CompareAllDigit(s1, s2);
		}
	}
	
	public void CompareAllDigit(String s1, String s2) {
		Integer[] nb1 = new Integer[4];
		Integer[] nb2 = new Integer[4];
		char[] array1 = new char[4];
		char[] array2 = new char[4];
				
		for (int i = 0; i != array1.length ; i++) {
			array1[i] = s1.charAt(i);
			array2[i] = s2.charAt(i);
			nb1[i] = Character.getNumericValue(array1[i]);
			nb2[i] = Character.getNumericValue(array2[i]);
			
			if (nb1[i] > nb2[i]) {
				System.out.print("+");
				mini = nb2[i];
				max = 9;
				count += 1;
				NewGenerate(count);
			}
			else if (nb1[i] < nb2[i]) {
				System.out.print("-");
				mini = 0;
				max = nb2[i];
				count += 1;
				NewGenerate(count);
			}
			else
				System.out.print("=");
		}
		System.out.println(" ");
	}
	
	public void NewGenerate(int count) {
		switch(count) {
		case 1:
			digitOne = (int)(Math.random() * max) + mini;
			break;
		case 2:
			digitTwo = (int)(Math.random() * max) + mini;
			break;
		case 3:
			digitThree = (int)(Math.random() * max) + mini;
			break;
		case 4:
			digitFour = (int)(Math.random() * max) + mini;
			break;
		default:
			break;
		}
	}

}
