package hu.pallas.Shell;

import java.io.*;
import java.util.*;


public class Beolvas {
	
	
	 private static BufferedReader br;
	 private static int[] tomb;
	 private static int tombhossz;
	 
	 public static void beolvas() throws IOException {
			ArrayList<Integer> szamok = new ArrayList<>();
	        try {
	            br = new BufferedReader(new FileReader("src/adatok.txt"));
	            String sor;
	            while ((sor = br.readLine()) != null) {
	                String[] reszek = sor.split(",");
	                    for (String resz : reszek) {
	                    int number = Integer.parseInt(resz);
	                    szamok.add(number);
	                }
	            }
	            br.close();
	            tomb = new int[szamok.size()];
	            for (int i = 0; i < szamok.size(); i++) {
	                tomb[i] = szamok.get(i);
	                tombhossz = szamok.size();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
			
	 public static BufferedReader getBr() {
	        return br;
	    }

	    public void setBr(BufferedReader br) {
	        this.br = br;
	    }

	    public static int[] getTomb() {
	        return tomb;
	    }

	    public void setTomb(int[] tomb) {
	        this.tomb = tomb;
	    }

	    public static int getTombHossz() {
	        return tombhossz;
	    }

	    public void setTombHossz() {
	        this.tombhossz = tombhossz;
	    }
	
	public static void proc() throws IOException {
		beolvas();
		System.out.println("Adatok beolvasva");
			
	}
	
}
	