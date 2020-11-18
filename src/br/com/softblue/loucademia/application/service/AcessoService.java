package br.com.softblue.loucademia.application.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.softblue.loucademia.application.util.StringUtils;
import br.com.softblue.loucademia.application.util.ValidationException;
import br.com.softblue.loucademia.domain.acesso.AcessoRepository;
import br.com.softblue.loucademia.domain.acesso.TipoAcesso;
import br.com.softblue.loucademia.domain.aluno.Aluno;
import br.com.softblue.loucademia.domain.aluno.AlunoRepository;

@Stateless
public class AcessoService {

	@EJB
	private AcessoRepository acessoRepository;
	
	@EJB
	private AlunoRepository alunoRepository;
	
	public TipoAcesso registrarAcesso(String matricula, Integer rg) {
		if (StringUtils.isEmpty(matricula) && rg == null) {
			throw new ValidationException("� preciso fornecer a matr�cula ou o RG do aluno");
		}
		
		Aluno aluno;
		if (StringUtils.isEmpty(matricula) ) {
			aluno = alunoRepository.findByRG(rg);
		} else {
			aluno = alunoRepository.findByMatricula(matricula);
		}
		
		if (aluno == null) {
			throw new ValidationException("O aluno n�o foi encontrado");
		}
		
		
		return null;
	}
}
