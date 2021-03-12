import javax.swing.JOptionPane;

public class Funcionario {
	public String nome;
	public String data_nasc;
	public String setor;
	public String data_entrada;
	public int cod_func;
	
	public Funcionario(String nome, String data_nasc, String setor, String data_entrada, int cod_func) {
		this.nome = nome;
		this.data_nasc = data_nasc;
		this.setor = setor;
		this.data_entrada = data_entrada;
		this.cod_func = cod_func;
	}
	
	public Funcionario() {
		nome = "";
		data_nasc = "";
		setor = "";
		data_entrada = "";
		cod_func = 0;
	}
	
	public void impressao_funcionario() {
		JOptionPane.showMessageDialog(null,"FICHA FUNCIONÁRIO\n" +
				"Nome: " + nome + "\nData de nascimento: " + data_nasc +
				"\nSetor: " + setor + "\nData de entrada: " + data_entrada +
				"\nCódigo do funcionário: " + cod_func);
	}
	

}
