package com.teste.cursojava.aula45;

public class teste2 {

	public static void main(String[] args) {
		
		Object obj1 = obterString();
		String s1 = (String) obj1; //Downcasting
		
		Object obj2 = "Minha String"; //Upcasting
		String s2 = (String) obj2;
		
//		Object obj3 = new Object();
//		String s3 = (String) obj3;
// Objeto n�o pode ser convertido em String
		
//		Object obj4 = obterInt();
//		String s4 = (String) obj4;
//	N�o pode ser convertido em String
		
//  Downcasting s� funciona para convers�o do tipo em particular
		
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		if (pessoa instanceof Pessoa) {
			System.out.println("� do tipo Pessoa!");
		}
		
		if (aluno instanceof Aluno) {
			System.out.println("� do tipo Aluno!");
		}
		
		if (professor instanceof Professor) {
			System.out.println("� do tipo Professor!");
		}
		
		
	}
	
	public static String obterString() {
		return "Minha String";
	}
	
	public static int obterInt() {
		return 1;
	}

}
