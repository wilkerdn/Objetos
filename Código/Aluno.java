import javax.swing.JOptionPane;

public class Aluno {
	public String nome;
	public String data_nasc;
	public String cpf;
	public String curso;
	public int n_matricula;
	
	public Aluno(String nome, String data_nasc, String cpf, String curso, int n_matricula) {
		this.nome = nome;
		this.data_nasc = data_nasc;
		this.cpf = cpf;
		this.curso = curso;
		this.n_matricula = n_matricula;
	}
	
	public Aluno() {
		nome = "";
		data_nasc = "";
		cpf = "";
		curso = "";
		n_matricula = 0;
	}
	
	public void impressao_aluno() {
		JOptionPane.showMessageDialog(null, "FICHA DO ALUNO:\n"
				+ "Nome: " + nome + "\nData de nascimento: " +
				data_nasc + "\nCPF: " + cpf + "\nCurso: " + curso
				+ "\nNúmero de matricula: " + n_matricula);
	}
}

