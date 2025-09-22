package horta;

import java.util.ArrayList;

import ProvaPratica.Utilizador;
// classe talhao

public class talhao {
	
	private int numero;
	private float area;
	private ArrayList<Plantacao> plantacoes;
	/**
	 * @param numero
	 * @param area
	 * @param plantacoes
	 */
	public talhao(int numero, float area) {
		this.numero = numero;
		this.area = area;
		plantacoes = new ArrayList<>();
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @return the area
	 */
	public float getArea() {
		return area;
	}

	public Plantacao procurarPlantacao(int numero) {
		for(Plantacao p : plantacoes) {
			if(u.getNome().equalsIgnoreCase(numero)) {
				return p;
			}
		}
		return null;
		
	public void adicionarPlantacao(Plantacao p) {
		plantacoes.add(p);
	}
	/**
	 * @return the plantacoes
	 */
	public ArrayList<Plantacao> getPlantacoes() {
		return plantacoes;
	}
	
	
}
