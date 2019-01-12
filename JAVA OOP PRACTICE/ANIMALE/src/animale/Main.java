package animale;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Animal> lista = new ArrayList<>();
		Pisica pisica = new Pisica();
		Caine caine = new Caine();
		Sarpe sarpe = new Sarpe();
		Pisica pisica2 = new Pisica();
		Pisica pisica3 = new Pisica();
		Caine caine2 = new Caine();
		Sarpe sarpe2 = new Sarpe();
		lista.add(pisica);
		lista.add(caine2);
		lista.add(sarpe2);
		lista.add(caine2);
		lista.add(sarpe);
		lista.add(pisica2);
		lista.add(pisica3);
		lista.add(caine);
		
		for (Animal anim : lista) {
		anim.makeSound();
		//System.out.println(anim.sangeRece());
		}

	}
}
