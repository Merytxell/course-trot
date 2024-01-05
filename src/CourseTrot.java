import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CourseTrot {

	public static void main(String[] args) {


		int speed
		int distance;

		public Horse() {
			this.speed = 0;
			this.distance = 0;
		}



		//speed += evol;
		//for (i = 0; i < 20; i++) 
		//speed = horses[i];


		// Initialiser le tableau des chevaux
		public static int horse () {
			horse[] horses = new horse[20];
			for (int i = 0; i < horses.length; i++) {
				horses[i] = new horse();
			}
		}






	}
	//lancer de dé	
	public static int dice () {
		for (int i = 0; i < horses.length; i++) {
			int d = dice ();
			int newSpeed = addSpeed(horses[i].speed, de);
			horses[i].newDistance += newSpeed;
			horses[i].speed = newSpeed;
		}
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

}

//créer des chevaux - ok
// créer "un plateau avec des "distances"
// créer un dés qui annonce la vitesse 
// faire que les 3 premiers chevaux qui arrivent gagnent.- ok