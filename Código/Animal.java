import javax.swing.JOptionPane;

public class Animal {
	public String nome;
	public String especie;
	public int peso;
	public int altura;
	public String habitat;
	
	public Animal(String nome, String especie, int peso, int altura, String habitat) {
		this.nome = nome;
		this.especie = especie;
		this.peso = peso;
		this.altura = altura;
		this.habitat = habitat;
	}
	
	public Animal() {
		nome = "";
		especie = "";
		peso =  0;
		altura = 0;
		habitat = "";
	}
	
	public void impressao_animal() {
		JOptionPane.showMessageDialog(null,"FICHA ANIMAL\n" +
				"Nome: " + nome + "\nEspecie: " + especie +
				"\nPeso: " + peso + " g\nAltura: " + altura +
				" cm\nHabitat: " + habitat);
	}
	

}
