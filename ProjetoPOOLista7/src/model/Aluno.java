package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import interfaces.CalcularMedia;

public class Aluno extends Pessoa implements CalcularMedia {
	private Date dataMatricula;
	private String nomeEscola;
	private int semestreMatricula;
	public Situacao situacao;
	private List<Disciplina> disciplinas;

	public Aluno() {
		disciplinas = new ArrayList<Disciplina>();
	}

	public Aluno(String nome, int idade, long numCPF, Date dataMatricula, String nomeEscola, int semestreMatricula,
			Situacao situacao) {
		this.nome = nome;
		this.idade = idade;
		this.numCPF = numCPF;
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.semestreMatricula = semestreMatricula;
		this.situacao = situacao;
		disciplinas = new ArrayList<Disciplina>();

	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public int getSemestreMatricula() {
		return semestreMatricula;
	}

	public void setSemestreMatricula(int semestreMatricula) {
		this.semestreMatricula = semestreMatricula;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dataMatricula, disciplinas, nomeEscola, semestreMatricula, situacao);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula) && Objects.equals(disciplinas, other.disciplinas)
				&& Objects.equals(nomeEscola, other.nomeEscola) && semestreMatricula == other.semestreMatricula
				&& Objects.equals(situacao, other.situacao);
	}	@Override
	public float calcularMediaGeral() {
		float somaNotas = 0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaDisciplina();
		}
		return somaNotas / disciplinas.size();
	}


	@Override
	public boolean calcularMediaGeral1() {
		if(calcularMediaGeral()>=7) {
			return true;
		}else return false;
	}
	
	public String situacao() {
		if(calcularMediaGeral1()) {
			
			return "APROVADO";
		}else if (calcularMediaGeral() < 7 && calcularMediaGeral() >= 5){
			return "RECUPERACAO";
		}else {
			return "REPROVADO";
		}
	}


}
