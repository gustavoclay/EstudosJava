package com.teste.cursojava.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public Carro() {
	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 par�metros.");
	}

	public Carro(String marca, String modelo) {
		this("Fiat", "Ducato", 10);
		System.err.println("Chamando construtor com 2 par�metros.");
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
