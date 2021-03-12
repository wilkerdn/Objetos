import javax.swing.JOptionPane;

public class Livro {
	String titulo;
	String autor;
	String editora;
	int n_pag;
	int ano_pub;
	
	public Livro(String titulo, String autor, String editora, int n_pag, int ano_pub) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.n_pag = n_pag;
		this.ano_pub = ano_pub;
	}
	
	public Livro() {
		titulo = "";
		autor = "";
		editora = "";
		n_pag = 0;
		ano_pub = 0;
	}
	
	public void impressao_livro() {
		JOptionPane.showMessageDialog(null,"INFORMAÇÕES DO LIVRO\n"
				+ "Título: " + titulo + "\nAutor: " + autor + "\nEditora: "
				+ editora + "\nNúmero de páginas: " + n_pag + "\nAno de publicação: "
				+ ano_pub);
	}

}
