import javax.swing.JOptionPane;

public class Pizza {
	public String sabor;
	public double valor;
	public int qtd_pedacos;
	public String acrescimos;
	public String borda;
	
	public Pizza(String sabor, double valor, int qtd_pedacos, String acrescimos, String borda) {
		this.sabor = sabor;
		this.valor = valor;
		this.qtd_pedacos = qtd_pedacos;
		this.acrescimos = acrescimos;
		this.borda = borda;
	}
	
	public Pizza() {
		sabor = "";
		valor = 0;
		qtd_pedacos = 0;
		acrescimos = "";
		borda = "";
	}
	
	public void impressao_pizza() {
		JOptionPane.showMessageDialog(null,"DESCRIÇÕES DA PIZZA:\n" +
				"Sabor: " + sabor + "\nValor: R$" + valor + 
				"\nQuantidade de pedaços: " + qtd_pedacos + "\nAcréscimos: " +
				acrescimos + "\nBorda: " + borda);
	}

}
