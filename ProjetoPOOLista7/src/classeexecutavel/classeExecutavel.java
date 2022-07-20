package classeexecutavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Disciplina;
import model.Nota;
import model.Professor;

public class classeExecutavel {

	public static void main(String[] args ) throws ParseException {
		// TODO Auto-generated method stub

	
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		List<Nota> notas = new ArrayList<Nota>();
		List<Professor> professores = new ArrayList<Professor>();

		
		int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Alunos: "));
		int qtdDisciplinas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de disciplinas:"));
		int qtdProfessores = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de professores:"));
		
		
		for(int i = 0; i < qtdAlunos; i++) {
			
			Aluno aluno = new Aluno();
			
		
			String nome1 = JOptionPane.showInputDialog("Nome: ");
			aluno.setNome(nome1);
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
			aluno.setIdade(idade);
			long cpf = Long.parseLong(JOptionPane.showInputDialog("Cpf:  "));
			aluno.setNumCPF(cpf);
			String dataMatricula = JOptionPane.showInputDialog("Qual a data de matrícula:  ");
			SimpleDateFormat sdfd = new SimpleDateFormat("dd/MM/yyyy");
			Date data = sdfd.parse(dataMatricula);
			
			aluno.setDataMatricula(data);
			String nomeEscola = JOptionPane.showInputDialog("Nome da Escola:  ");
			aluno.setNomeEscola(nomeEscola);
			int semestreMatriculado = Integer.parseInt(JOptionPane.showInputDialog("Semestre: "));
			aluno.setSemestreMatricula(semestreMatriculado);
	
			
	for( i = 0; i < qtdProfessores; i++) {
				
				Professor professor = new Professor();
					
				
				    nome1 = JOptionPane.showInputDialog("Nome: ");
					professor.setNome(nome1);
				 idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
					aluno.setIdade(idade);
				 cpf = Long.parseLong(JOptionPane.showInputDialog("Cpf:  "));
					aluno.setNumCPF(cpf);
					String matricula =JOptionPane.showInputDialog("Matricula: ");
			
	                professor.setInscMatricula(matricula);

	                String area =JOptionPane.showInputDialog("Area: ");
	        		
	                professor.setInscMatricula(area);
	      
		
				
		
			alunos.add(aluno);
			professores.add(professor);
		
			
		

			for(int j = 0; j < qtdDisciplinas; j++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome Disciplina?");
				Disciplina disciplina = new Disciplina(nomeDisciplina);
				
				int nroNotas = Integer.parseInt(JOptionPane.showInputDialog("Notas?"));
				
				for(int w = 0; w <nroNotas;w++) {
					float[] coletaNotas = new float[4];
					for(int z = 0; z <= 3; z++) {
						float valorNota = Float.parseFloat(JOptionPane.showInputDialog(" Nota da Disciplina?"));
						coletaNotas[w] = valorNota;
					}
					Nota nota = new Nota(coletaNotas);
					notas.add(nota);
				}
				
				disciplina.setNotas(notas);
				aluno.getDisciplinas().add(disciplina);
				professor.getDisciplinas().add(disciplina);
			
			
		
		System.out.println("------------------------");
		for(Aluno aluno1: alunos) {
			System.out.println("Lista de Alunos: ");
			System.out.println("Nome: "+aluno1.getNome());
			System.out.println("Idade: "+aluno1.getIdade());
			System.out.println("Cpf: "+aluno1.getNumCPF());
			System.out.println("Data de matricula: "+aluno1.getDataMatricula());
			System.out.println("Nome da escola: "+aluno1.getNomeEscola());
			System.out.println("Semestre : "+aluno1.getSemestreMatricula());
			System.out.println("Media: "+aluno1.calcularMediaGeral());
			System.out.println("Situacao: "+aluno1.situacao());
			System.out.println("Maior de Idade: "+aluno1.MaiorDeIdade(18));
			
			
			
			
			System.out.println("------------------------");
			for(Professor professor1: professores) {
				System.out.println("Lista de Professores: ");
				System.out.println("Nome: "+professor1.getNome());
				System.out.println("Idade: "+professor1.getIdade());
				System.out.println("Cpf: "+professor1.getNumCPF());
				System.out.println("Matricula: "+professor1.getInscMatricula());
				System.out.println("Area: "+professor1.getArea());				
				
				
			
			System.out.println("------------------------");
			System.out.println("Lista de Disciplinas");
			for(Disciplina disciplina1 : aluno1.getDisciplinas()) {
				System.out.println("Disciplina: "+disciplina1.getNomeDisciplina());
				System.out.println("Media da disciplina: "+disciplina1.getMediaDisciplina());
				System.out.println("------------------------");
				System.out.println("Lista de Notas");
				for(Nota nota : disciplina1.getNotas()) {
					for(int y = 0; y < nota.getNotas().length;y++) {
						System.out.println((" Nota: "+nota.getNotas()[y]));
					}
					System.out.println("--------------------------------------------");
				}
				System.out.println("--------------------------------------------");
				}
			}
	}
	}
}
}}}