
import java.util.*;

public class Kuh {
	   static void KuhName(String name) {
		   System.out.println("Die Kuh Heißt: " + name);
	   }
	   static void MilchMenge(String Milch) {
		   System.out.println("Die Kuh Gibt " + Milch +" Liter Milch");
	   }
	   static void geburtsjahr(String Jahr) {
		   System.out.println("Die Kuh Wurde " + Jahr + " Geboren");
		   int c = Calendar.YEAR;
		   int b = Integer.parseInt(Jahr);
		   int a = 2021;
		   int zeit = (a - b);
		   System.out.println("Das war vor " + zeit +" Jahren");
	   }
	   public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			
			KuhName("Muh");
			MilchMenge("100");
			geburtsjahr("1876");

		}
	   

}
