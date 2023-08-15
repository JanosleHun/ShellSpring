package hu.pallas.Shell;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.*;


public class Feltoltes {
	
	
		
		static int randomSzam;
		
		protected static void proc() throws IOException {
		
				int[] tomb = new int[100];
		        
		        int max = 0;
		        int min = 0;
		        
		        try {
		            PrintWriter file = new PrintWriter(
		                new BufferedWriter(
		                        new FileWriter("src/adatok.txt"))); 

		        for (int szamok = 0; szamok < tomb.length; szamok++) {
		            randomSzam = (ThreadLocalRandom.current().nextInt(1, 999));
		            tomb[szamok] = randomSzam;
		            for (int i = 0; i < tomb.length; i++) {
		                if (tomb[i] > (tomb[max])) max = i;
		            }
		                for (int j = 0; j < tomb.length; j++) {
		                    if (tomb[j] < (tomb[min])) min = j;
		                    }
		                file.print (randomSzam + ",");
		                     }
		        file.close();
		        }
		                catch (IOException e) {
		                    e.printStackTrace();
		                }
		System.out.println("Adatok feltöltése megtörtént");        
		}
		
	}


