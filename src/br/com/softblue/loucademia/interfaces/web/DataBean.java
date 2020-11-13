package br.com.softblue.loucademia.interfaces.web;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.com.softblue.loucademia.domain.aluno.Aluno.Sexo;
import br.com.softblue.loucademia.domain.aluno.Aluno.Situacao;

@Named
@ApplicationScoped
public class DataBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
		public Sexo[] getSexos() {
			return Sexo.values();
		}
		
		public Situacao[] getSituacoes() {
			return Situacao.values();
		}
}