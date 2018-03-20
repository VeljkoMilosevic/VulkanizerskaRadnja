package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;


/**
 * 
 * @author Veljko Milosevic
 * @version 1.0.0
 *
 */
public class VulkanizerskaRadnja {
	
	/**
	 * Lista gume ciji su elementi objekti klase AutoGuma
	 */
	private LinkedList<AutoGuma> gume =
	new LinkedList<AutoGuma>();
	
	/**
	 * Klasa koja dodaje objekat AutoGume a u listu gume 
	 * @return void
	 * @param Objekat klase AutoGuma
	 * @throws NullPointerException
	 * izuzetak se pojavljuje u slucaju da je ulazni parametar
	 *             <ul>
	 *             <li>null
     *             </ul>
     *@throws RuntimeException
     *izuzetak se pojavljuje u slucaju da ulazni parametar
	 *             <ul>
	 *             <li>vec postoji u listi
     *             </ul>
	 */

	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	
	/**
	 * 
	 * Metoda koja trazi objekat klase AutoGuma u listi gume pomocu vrednosti atributa markaModel.
	 * @param String koji predstavlja atribut markaModel pomocu kojeg se trazi guma.
	 * @return Listu koja sadrzi sve gume jednog proizvodjaca.
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for(int i=0;i<gume.size();i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
	
