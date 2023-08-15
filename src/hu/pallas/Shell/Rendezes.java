package hu.pallas.Shell;

public class Rendezes {
	
	public static void proc(int[] arr) {
		
		int[] tomb = Beolvas.getTomb();
		int m = Beolvas.getTombHossz();
		int h[] = {1,4,13,40,121};
		for(int s= h.length -1; s >= 0; s--) {
			int tav = h[s];
			for(int j=tav; j < m; j++) {
				int temp=tomb[j];
				int i=j-tav;
				while(i>=0 && tomb[i] > temp) {
					tomb[i+tav] = tomb[i];
					i = i - tav;
				}
				tomb[i+tav]= (char) temp;
			}
		}
		for(int i=0; i < tomb.length; i++)
            System.out.println(tomb[i] + " ");
           System.out.println();

}}
