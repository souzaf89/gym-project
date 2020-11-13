package br.com.softblue.loucademia.interfaces.web;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.softblue.loucademia.domain.aluno.Aluno;

@Named
@RequestScoped
public class AunoBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private Aluno aluno = new Aluno();
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
