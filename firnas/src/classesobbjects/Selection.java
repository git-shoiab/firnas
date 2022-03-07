package classesobbjects;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Selection {
	public static void main(String[] args) {
		Random r=new Random();
		Set<Integer> selectedNumbers=new HashSet<Integer>();
		int x=0;
		int size=0;
		for(int i=0;size<4;i++) {
			for(int n=0;n<10000;n++) {
				x=r.nextInt(13);
				System.out.print(x+"\b\r");				
			}
			if(x==0) {
				i--;
			}
			else {
				selectedNumbers.add(x);
				size=selectedNumbers.size();
			}
		}
		selectedNumbers.forEach(System.out::println);
}

}