package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import interfaces.CalcularMedia;

public class Professor extends Pessoa implements CalcularMedia {
	private String inscMatricula;
	private String area;
	private List<Disciplina> disciplinas;

public Professor() {
	
	disciplinas = new ArrayList<Disciplina>();
}
public Professor(String nome, int idade, long numCPF,String inscMatricula,String area) {
	
	super(nome, idade, numCPF);
this.inscMatricula=inscMatricula;
this.area=area;
disciplinas = new ArrayList<Disciplina>();
}

public String getInscMatricula() {
	return inscMatricula;
}
public void setInscMatricula(String inscMatricula) {
	this.inscMatricula = inscMatricula;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
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
	result = prime * result + Objects.hash(area, disciplinas, inscMatricula);
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
	Professor other = (Professor) obj;
	return Objects.equals(area, other.area) && Objects.equals(disciplinas, other.disciplinas)
			&& Objects.equals(inscMatricula, other.inscMatricula);
}
@Override
public String toString() {
	return "Professor [inscMatricula=" + inscMatricula + ", area=" + area + ", disciplinas=" + disciplinas + "]";
}
@Override
public float calcularMediaGeral() {
	float somaNotas = 0;
	for (Disciplina disciplina : disciplinas) {
		somaNotas += disciplina.getMediaDisciplina();
	}
	return somaNotas / disciplinas.size();
}

@Override
public boolean calcularMediaGeral1() {
calcularMediaGeral();
	return false;



}public String situacao() {
	if(calcularMediaGeral() > 7 && calcularMediaGeral() >=5) {
		
		return "APROVADO";
	}else {
		return "REPROVADO";
	}
}

}
