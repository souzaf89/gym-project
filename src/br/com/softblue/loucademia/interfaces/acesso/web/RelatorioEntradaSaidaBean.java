package br.com.softblue.loucademia.interfaces.acesso.web;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.softblue.loucademia.application.service.AlunoService;
import br.com.softblue.loucademia.application.util.StringUtils;
import br.com.softblue.loucademia.application.util.ValidationException;
import br.com.softblue.loucademia.domain.acesso.Acesso;

@Named
@RequestScoped
public class RelatorioEntradaSaidaBean implements Serializable{
	private static final long serialVersionUID = 1L;

	@EJB
	private AlunoService alunoService;
	
	@Inject
	private FacesContext facesContext;
	
	private String matricula;
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	
	private List<Acesso> acessos;
	
	public void carregarAluno() {
		if (!StringUtils.isEmpty(matricula)) {
			gerarRelatorio();
		}
	}
	
	public String gerarRelatorio() {
		try {
		acessos = alunoService.listAcessosAlunos(matricula, dataInicial, dataFinal);
		} catch (ValidationException e) {
			facesContext.addMessage(null, new FacesMessage(e.getMessage()));
		}
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
