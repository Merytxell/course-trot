

public class CourseTrot {

	public static void main(String[] args) { //problème d'intentation ? 

	}


		// Initialiser le tableau des chevaux
		public static int[][] newHorses() {
			int[][] horses = new int[20][2];
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

			
		}

		//etat actuel de la course à chaque tours
		public static void currentRace(int[][] horses) {
		}

		//résultat de la course
		public static void showResult (int[][] horses) {

		}
}
	//créer des chevaux - ok
	// créer "un plateau avec des "distances" - ok
	// créer un dés qui annonce la vitesse - presque ?
	//réaliser le tiercé
	//l'état actuel de la course à chaque tours
	// montrer le résultat final 