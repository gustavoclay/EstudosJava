package com.teste.cursojava.aula45;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //upcasting

		Pessoa aluno2 = (Pessoa) new Aluno(); //(Pessoa) - transforma��o de tipo - cast
		
		Pessoa aluno3 = new Pessoa();
		//Aluno aluno4 = (Aluno) aluno3;//erro- n�o � poss�vel realizar a convers�o devido aos atributos da superclasse 
	}

}
