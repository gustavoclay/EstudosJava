package com.teste.cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	
	Carro(){
		System.out.println("Classe carro foi instanciada!");
		numPassageiros = 4;
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do Carro �: " + capCombustivel * consumoCombustivel + " KM.");
	}

	double obterAutonomia() {

		System.out.println("M�todo obterAutonomia foi chamado!");

		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}

}
