import java.util.ArrayList;
import java.util.Scanner;

public class CourseTrot {

	public static void main(String[] args) {
		
		// créer tableau des chevaux 
		
	
		int [] horses = {1,2,3,4,5,6,7,8,9,10,11,12};				
		
		//speed += evol;
		//for (i = 0; i < 20; i++) 
		//speed = horses[i];
		//int de = (int) (Math.random()*5+1);
		//System.out.println("les chevaux avancent de " + de );
	   
	
}
	public static int calculjetdede(int currentSpeed, int d){
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

//créer des chevaux 
// créer "un plateau avec des "distances"
// créer un dés qui annonce la vitesse 
// faire que les 3 premiers chevaux qui arrivent gagnent.- 