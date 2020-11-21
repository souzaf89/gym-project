package br.com.softblue.loucademia.interfaces.acesso.web;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.softblue.loucademia.domain.acesso.Acesso;

@Named
@RequestScoped
public class RelatorioEntradaSaidaBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private String matricula;
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	
	private List<Acesso> acessos;
	
	public String gerarRelatorio() {
		return null;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}

	public List<Acesso> getAcessos() {
		return acessos;
	}	
}
