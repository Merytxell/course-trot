import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CourseTrot {

	public static void main(String[] args) {
		//placer addspeed += addDistance;

		//placer speed = horses[i];
		
		//faire une boucle 


	}


	// Initialiser le tableau des chevaux (inspiré de Martial et Max)
	public static int[][] newHorses() {
		int[][] horses = new int[20][12];
		for (int i = 0; i < horses.length; i++) {
		}
		return horses;
	}

	
	//trouver comment changer de tour (Inspiré de Max)
	public static void move(int[][] horses) {
		for (int i = 0; i < horses.length; i++) {
			int d = dice();
			int newSpeed = addSpeed(horses[i][0], d);
			horses[i][1] += newSpeed; // Distance
			horses[i][0] = newSpeed; // Vitesse
		}
	}

	//lancer de dé	(aide de max)
	public static int dice () {
		return (int) (Math.random()*6+1);
	}


	//1er tableau pour la vitesse (aide de max)
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

	// initialiser la distance (idée de max)
	public static int addDistance (int currentDistance, int score) {
		int distance = score*23;
		return currentDistance + distance;
	}
		

	//etat actuel de la course à chaque tours - à voir si c'est pertinent
	public static void currentRace(int[][] horses) {
		// donne l'état actuel de la course de chaque cheval ainsi que les tours
	}

	//résultat de la course
	//montre les 3 vainqueurs (à moi)
	public static Set <Integer> showResult() {
		Random random = new Random();
		// le set est une collection qui permet de ne pas faire de doublon on s'assure que chaque numéro de cheval est unique
		Set < Integer> horse = new HashSet<>();//HashSet stocke des éléments et permet d'ajouter et de suprimer ce qui a déjà été suggéré par la méthode random
		//selectionner 3 chevaux
		while (horse.size() <3) {
			int randomNumber =random.nextInt(8)+12;//modification de max 
			horse.add(randomNumber);

		}
		return horse;

	}
}
//créer des chevaux - ok
// créer "un plateau avec des "distances" - ok
// créer un dés qui annonce la vitesse - presque ?
//réaliser le tiercé - à modifier pour prendre en compte 12 et 20 chevaux
//l'état actuel de la course à chaque tours
// montrer le résultat final 