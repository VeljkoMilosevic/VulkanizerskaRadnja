package gume;


/**
 * 
 * Klasa koja predstavlja auto gume.
 * @author Veljko Milosevic
 * @version 1.0.0
 *
 */
public class AutoGuma {
	
	
	/**
	 * Atribut string koji prestavlja marku modela
	 */
	private String markaModel = null;
	
	/**
	 * Celobrojni atribut precnik
	 */
	private int precnik = 0;
	
	/**
	 * Celobrojni atribut sirina
	 */
	private int sirina = 0;
	
	/**
	 * Celobrojni atribut visina
	 */
	private int visina = 0;
	
	
	/**
	 * Metoda vraca marku modela.
	 * @return String koji predstavlja marku modela.
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	
	/**
	 * Metoda koja imenuje ulazni parametar u naziv marke modela klase.
	 * @param String koji predstavlja marku modela.
	 * @throws java.lang.RuntimeException
	 *             izuzetak se pojavljuje u slucaju da je ulazni parametar
	 *             <ul>
	 *             <li>null
	 *             <li>kraci od 3 znaka.
	 *             </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null || markaModel.length()<3)
			throw new RuntimeException("Morate uneti marku i model");
	this.markaModel = markaModel;
	}
	
	/**
	 * Metoda vraca precnik.
	 * @return Celobrojna vrednost koji predstavlja precnik.
	 */
	public int getPrecnik() {
		return precnik;
	}
	
	/**
	 * Metoda koja imenuje ulazni parametar u atribut precnik klase.
	 * @param Celobrojna vrednost koja predstavlja precnik.
	 * @throws java.lang.RuntimeException
	 *             izuzetak se pojavljuje u slucaju da je ulazna celobrojna vrednost
	 *             <ul>
	 *             <li>manja od 13
	 *             <li>veca od 22.
	 *             </ul>
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 ||  precnik > 22) 
	//if (precnik < 13 && precnik > 22) Greske je &&. Treba ||
			throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	
	/**
	 * Metoda vraca sirinu.
	 * @return Celobrojna vrednost koji predstavlja sirinu.
	 */
	public int getSirina() {
		return sirina;
	}
	
	/**
	 * Metoda koja imenuje ulazni parametar u atribut sirinu klase.
	 * @param Celobrojna vrednost koja predstavlja sirinu.
	 *  @throws java.lang.RuntimeException
	 *             izuzetak se pojavljuje u slucaju da je ulazna celobrojna vrednost
	 *             <ul>
	 *             <li>manja od 135
	 *             <li>veca od 355.
	 *             </ul>
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			//if (sirina < 135 && sirina > 355) Greska je &&. Treba ||
			throw new RuntimeException("Sirina van opsega");
	this.sirina = sirina;
	}
	
	/**
	 * Metoda vraca visinu.
	 * @return Celobrojna vrednost koji predstavlja visinu.
	 *        
	 */
	public int getVisina() {
		return visina;
	}
	

	/**
	 * Metoda koja imenuje ulazni parametar u atribut visina klase.
	 * @param Celobrojna vrednost koja predstavlja visinu.
	 * @throws java.lang.RuntimeException
	 *             izuzetak se pojavljuje u slucaju da je ulazna celobrojna vrednost
	 *             <ul>
	 *             <li>manja od 25
	 *             <li>veca od 95.
	 *             </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
	this.visina = visina;
	}
	
	/**
	 * Metoda koja vraca imena i vrednosti atributa nekog objekta ove klase.
	 * @return String koji predstavlja ime i vrednost nekog objekta atributa ove klase.
	 */
	@Override
	public String toString() {
	return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
	", sirina=" + sirina + ", visina=" + visina + "]";
	}
	
	/**
	 * 	Metoda koja provera da li su dva objekta, od
	 *  kojih je bar jedan objekat klase AutoGuma, jednaki.
	 *  @param Ulazni parametar je neki objekat.
	 *  @return Metoda vraca true ako su objekti jednaki a false ako nisu.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
	AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
	} 	else if (!markaModel.equals(other.markaModel))
				return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
	return true;
	}

}
