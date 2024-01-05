import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CourseTrot {

	public static void main(String[] args) {

	}


		// Initialiser le tableau des chevaux
		public static int[][] newHorses() {
			int[][] horses = new int[20][12];
			for (int i = 0; i < horses.length; i++) {
			}
			return horses;
		}

		//placer addspeed += addDistance;

		//placer speed = horses[i];

		//trouver comment changer de tour 
		public static void move(int[][] horses) {
			for (int i = 0; i < horses.length; i++) {
				int d = dice();
				int newSpeed = addSpeed(horses[i][0], d);
				horses[i][1] += newSpeed; // Distance
				horses[i][0] = newSpeed; // Vitesse
			}
		}

		//lancer de dé	
		public static int dice () {
			return (int) (Math.random()*6+1);
		}


		//1er tableau pour la vitesse
		public static int addSpeed (int currentSpeed, int d){
			int[][] speed = {  
					{0,1,1,1,2,2},//0
					{0,0,1,1,1,2},//1
					{0,0,1,1,1,2},//2
					{-1,0,0,1,1,1},//3
					{-1,0,0,0,1,1},//4
					{-2,-1,0,0,0,1},//5
					{-2,-1,0,0,0,1}//6

			};
			return speed[currentSpeed][d-1];
		}

		// initialiser la distance 
		public static int addDistance (int currentDistance, int score) {
			int distance = score*23;
			return currentDistance + distance;
		}


		//déclarer les 3 vainqueurs
		public static boolean finishRace(int[][] horses) {
			return false;
// si le cheval fait - 2400m alors il a perdu
			
		}

		//etat actuel de la course à chaque tours
		public static void currentRace(int[][] horses) {
			// donne l'état actuel de la course de chaque cheval ainsi que les tours
		}

		//résultat de la course
		public static void showResult (int[][] horses) {
			//montre les 3 vainqueurs
			public static Set <Integer> horseRace() {
				Random random = new Random();
			// le set est une collection qui permet de ne pas faire de doublon on s'assure que chaque numéro de cheval est unique
				Set < Integer> horse = new HashSet<>();//HashSet stocke des éléments et permet d'ajouter et de suprimer ce qui a déjà été suggéré par la méthode random
			//selectionner 3 chevaux
				while (horse.size() <3) {
					int randomNumber =random.nextInt(20)+1;
					horse.add(randomNumber);
						
				}
				return horse;

		}
}
	//créer des chevaux - ok
	// créer "un plateau avec des "distances" - ok
	// créer un dés qui annonce la vitesse - presque ?
	//réaliser le tiercé
	//l'état actuel de la course à chaque tours
	// montrer le résultat final 