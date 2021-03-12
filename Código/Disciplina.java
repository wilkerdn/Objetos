import javax.swing.JOptionPane;

public class Disciplina {
	public String nome;
	public String pre_req;
	public int carga_horaria;
	public int n_cursos;
	public String professor;
	
	public Disciplina(String nome, String pre_req, int carga_horaria, int n_cursos, String professor) {
		this.nome = nome;
		this.pre_req = pre_req;
		this.carga_horaria = carga_horaria;
		this.n_cursos = n_cursos;
		this.professor = professor;
	}
	
	public Disciplina() {
		nome = "";
		pre_req = "";
		carga_horaria = 0;
		n_cursos = 0;
		professor = "";
	}
	
	public void impressao_disciplina() {
		JOptionPane.showMessageDialog(null,"DADOS DA DISCIPLINA:\n" + "Nome: "
				+ nome + "\nPré requisito: " + pre_req + "\nCarga horária: "
				+ carga_horaria + " horas/aula\nNúmero de cursos: " + n_cursos
				+ "\nProfessor(a): " + professor);
	}
}
