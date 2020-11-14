package br.com.softblue.loucademia.interfaces.web;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.com.softblue.loucademia.domain.aluno.Aluno.Sexo;
import br.com.softblue.loucademia.domain.aluno.Aluno.Situacao;
import br.com.softblue.loucademia.domain.aluno.Estado;

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
		
		public List<Estado> getEstados() {
			return null;
		}
}