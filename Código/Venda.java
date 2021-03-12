import javax.swing.JOptionPane;

public class Venda {
	public double valor;
	public String cliente;
	public String cpf_c;
	public String prazo;
	public String vendedor;
	
	public Venda(double valor, String cliente, String cpf_c, String prazo, String vendedor) {
		this.valor = valor;
		this.cliente = cliente;
		this.cpf_c = cpf_c;
		this.prazo = prazo;
		this.vendedor = vendedor;
	}
	
	public Venda() {
		valor = 0;
		cliente = "";
		cpf_c = "";
		prazo = "";
		vendedor = "";
	}
	
	public void impressao_venda() {
		JOptionPane.showMessageDialog(null,"RESUMO VENDA:\n" +
				"Valor: R$" + valor + "\nCliente: " + cliente +
				"\nCPF do cliente: " + cpf_c + "\nPrazo: " + prazo
				+ "\nVendedor(a): " + vendedor);
	}
	
}
