
public class ModeAI {

	GenerateNumber g = new GenerateNumber();
	PlayerGiveNumber p = new PlayerGiveNumber();
	ModeJoueur j = new ModeJoueur();
	String numberPlayer;
	String numberAI = g.nombreGenerate();

	public String GameModeAI(int maxChance) {

		for (int i = 1; i <= maxChance; i++) {
			System.out.println("Nombre de chance utiliser " + (i - 1) + " sur " + maxChance);
			System.out.println("Tenté votre chance");
			numberPlayer = p.choicePlayer();
			if (numberPlayer.equals(numberAI) == true) {
				System.out.println("====");
				System.out.println("C'est gagner");
				i = 10;
			}
			else if (numberPlayer.equals(numberAI) == false) {
				j.CompareTheyValue(numberAI, numberPlayer);
			}
		}
		return ("0");
	}
}
