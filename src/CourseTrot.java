import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CourseTrot {

	public static void main(String[] args) {

		// créer tableau des chevaux 
			

		//speed += evol;
		//for (i = 0; i < 20; i++) 
		//speed = horses[i];


		//System.out.println("les chevaux avancent de " + de );
		
	

		}
		
	//lancer de dé	
	public static int dice () {
	return (int) (Math.random()*6+1);

	
	}
		
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
	// générer un nombre 
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
		
public static void showResult(Set<Integer>horse) {
//iterator permet de parcourir les éléments du HashSet des horses et les affiches. Sans cela ça ne fonctionne pas
	Iterator<Integer>iterator = horse.iterator();
	while (iterator.hasNext()){
		int horseWin = iterator.next();
		System.out.println("les chevaux " + horseWin + "" + "ont gagné la course");
	}
		
	
}
	
}


//créer des chevaux 
// créer "un plateau avec des "distances"
// créer un dés qui annonce la vitesse 
// faire que les 3 premiers chevaux qui arrivent gagnent.- 