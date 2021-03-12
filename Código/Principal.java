import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno_1 = new Aluno();
		aluno_1.nome = JOptionPane.showInputDialog("Digite o nome:");
		aluno_1.data_nasc = JOptionPane.showInputDialog("Data de nascimento:");
		aluno_1.cpf = JOptionPane.showInputDialog("CPF:");
		aluno_1.curso = JOptionPane.showInputDialog("Curso:");
		aluno_1.n_matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de matrícula:"));
		aluno_1.impressao_aluno();
		
		Aluno aluno_2 = new Aluno("João","01/01/1900","123.456.789-10","Eng. Da Computação",1234567);
		aluno_2.impressao_aluno();
		
		
		Livro livro_1 = new Livro();
		livro_1.titulo = JOptionPane.showInputDialog("Título:");
		livro_1.autor = JOptionPane.showInputDialog("Nome do autor:");
		livro_1.editora = JOptionPane.showInputDialog("Editora:");
		livro_1.n_pag = Integer.parseInt(JOptionPane.showInputDialog("Número de páginas:"));
		livro_1.ano_pub = Integer.parseInt(JOptionPane.showInputDialog("Ano de publicação:"));
		livro_1.impressao_livro();
		
		Livro livro_2 = new Livro("Extraordinário","R.J.Palacio","Intríseca",318,2013);
		livro_2.impressao_livro();
		
		
		Funcionario funcionario_1 = new Funcionario();
		funcionario_1.nome = JOptionPane.showInputDialog("Nome do funcionário:");
		funcionario_1.data_nasc = JOptionPane.showInputDialog("Data de nascimento:");
		funcionario_1.setor = JOptionPane.showInputDialog("Setor de trabalho:");
		funcionario_1.data_entrada = JOptionPane.showInputDialog("Data de entrada na empresa:");
		funcionario_1.cod_func = Integer.parseInt(JOptionPane.showInputDialog("Código do funcionário:"));
		funcionario_1.impressao_funcionario();
		
		Funcionario funcionario_2 = new Funcionario("Maria","01/01/1980","TI","01/06/2000",137);
		funcionario_2.impressao_funcionario();
		
		
		Disciplina disciplina_1 = new Disciplina();
		disciplina_1.nome = JOptionPane.showInputDialog("Nome da disciplina:");
		disciplina_1.pre_req = JOptionPane.showInputDialog("Pré - requisito:");
		disciplina_1.carga_horaria = Integer.parseInt(JOptionPane.showInputDialog("Carga horária (horas/aulas):"));
		disciplina_1.n_cursos = Integer.parseInt(JOptionPane.showInputDialog("Número de cursos que lecionam a disciplina:"));
		disciplina_1.professor = JOptionPane.showInputDialog("Professor:");
		disciplina_1.impressao_disciplina();
		
		Disciplina disciplina_2 = new Disciplina("Algorítmo e estrutura de dados III", "Algorítmo e estrutura de dados I e II", 80, 1, "Márcio");
		disciplina_2.impressao_disciplina();
		
		Venda venda_1 = new Venda();
		venda_1.valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
		venda_1.cliente = JOptionPane.showInputDialog("Nome do cliente:");
		venda_1.cpf_c = JOptionPane.showInputDialog("CPF do cliente:");
		venda_1.prazo = JOptionPane.showInputDialog("Condição de pagamento:");
		venda_1.vendedor = JOptionPane.showInputDialog("Vendedor(a):");
		venda_1.impressao_venda();
		
		Venda venda_2 = new Venda(1000.00,"José Antônio","123.456.789-10","35 dias","Marina");
		venda_2.impressao_venda();
		
		
		Animal animal_1 = new Animal();
		animal_1.nome = JOptionPane.showInputDialog("Nome:");
		animal_1.especie = JOptionPane.showInputDialog("Espécie:");
		animal_1.peso = Integer.parseInt(JOptionPane.showInputDialog("Peso em gramas:"));
		animal_1.altura = Integer.parseInt(JOptionPane.showInputDialog("Altura em cm:"));
		animal_1.habitat = JOptionPane.showInputDialog("Habitat:");
		animal_1.impressao_animal();
		
		Animal animal_2 = new Animal("Cachorro","Mamífero",5000,35,"Terra");
		animal_2.impressao_animal();
		
		
		Pizza pizza_1 = new Pizza();
		pizza_1.sabor = JOptionPane.showInputDialog("Sabor:");
		pizza_1.valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
		pizza_1.qtd_pedacos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de pedaços:"));
		pizza_1.acrescimos = JOptionPane.showInputDialog("Acréscimos:");
		pizza_1.borda = JOptionPane.showInputDialog("Sabor da borda");
		pizza_1.impressao_pizza();
		
		Pizza pizza_2 = new Pizza("Portuguesa",60.00,8,"Sem acréscimos","Cheddar");
		pizza_2.impressao_pizza();
		
	}
}
