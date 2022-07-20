package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Disciplina {
	private String nomeDisciplina;
	private List<Nota> notas;
	

	public Disciplina() {
		notas = new ArrayList<Nota>();
	}
	
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		notas = new ArrayList<Nota>();
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeDisciplina, notas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(nomeDisciplina, other.nomeDisciplina) && Objects.equals(notas, other.notas);
	}

	@Override
	public String toString() {
		return "Disciplina [nomeDisciplina=" + nomeDisciplina + ", notas=" + notas + "]";
	}
	public float getMediaDisciplina() {
		float somaNotas = 0;
		for (Nota notas : notas) {
			somaNotas += notas.getMediaNotas();
		}
		return somaNotas / notas.size();
		
	}
}
