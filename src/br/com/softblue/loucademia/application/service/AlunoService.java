package br.com.softblue.loucademia.application.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.softblue.loucademia.application.util.StringUtils;
import br.com.softblue.loucademia.application.util.Validation;
import br.com.softblue.loucademia.domain.aluno.Aluno;
import br.com.softblue.loucademia.domain.aluno.AlunoRepository;

@Stateless
public class AlunoService {
	
	@EJB
	private AlunoRepository alunoRepository;
	
	public void createOrUpdate(Aluno aluno) {
		if (StringUtils.isEmpty(aluno.getMatricula())) {
			create(aluno);
		}else {
			update (aluno);
		}
	}
	
	private void create (Aluno aluno) {
		Validation.assertNotEmpty(aluno);		
		aluno.gerarMatricula();
		alunoRepository.store(aluno);
	}
	
	private void update(Aluno aluno) {
		Validation.assertNotEmpty(aluno);
		Validation.assertNotEmpty(aluno.getMatricula());		
		alunoRepository.update(aluno);
	}
}
