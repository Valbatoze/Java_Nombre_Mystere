import java.io.IOException;

public class StartGame {

	static int maxChance = 10;
	public static void main(String[] args) throws IOException {
		
		PlayerGiveNumber p = new PlayerGiveNumber();
		ModeJoueur j = new ModeJoueur();
		ModeJoueurAI ja = new ModeJoueurAI();
		ModeAI ai = new ModeAI();
		String inf = new String();
		
		while (inf != "4") {
			System.out.println("Bienvenue dans le jeu Nombre mystère.");
			System.out.println("");
			System.out.println("Mode de Jeu");
			System.out.println("1: Générer un nombe aléatoire");
			System.out.println("2: Un joueur rentre un nombre");
			System.out.println("3: Joueur vs Joueur");
			System.out.println("4: Pour quiter");
			switch (p.choicePlayer()) {
			case "1":
				System.out.println("Vous avais choisi le mode aléatoire.");
				ai.GameModeAI(maxChance);
				break;
			case "2":
				System.out.println("Vous avais choisi le mode Joueur");
				ja.GameModeJoueurAI(maxChance);
				break;
			case "3":
				System.out.println("Vous avais choisi le mode Joueur");
				j.GameModePlayer(maxChance);
				break;
			default:
				System.out.println("Au Revoir");
				inf = "4";
				break;
			}
		}
	}

}
