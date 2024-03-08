package org.slide.atividades;
	import java.util.Scanner;
public class Projeto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, digite a operação desejada");
		System.out.println("digite (imc) para calcular o imcc");
		System.out.println("digite (basal) para acessar o Cálculo metabolismo basal");
		String opcao = sc.next();
		
		switch(opcao) {
		case "imc":
			
			System.out.println("Olá, qual o seu nome?");
			String nome = sc.next();
			
			System.out.println("Informe seu peso: (em Kg)");
			float peso = sc.nextFloat();
			
			System.out.println("Informe sua altura: (em Metros)");
			float altura = sc.nextFloat();
			
			float imc = peso / (altura * altura);
			
			System.out.println(nome + ", seu IMC é" + imc);
			
			if(imc <= 19) {
				System.out.println("Você está abaixo do peso");
			} else if(imc <= 19 && imc < 25) {
				System.out.println("Você está com o peso normal");
			} else if(imc >= 25 && imc < 30) {
				System.out.println("Você está com sobrepeso");
			} else if(imc >= 30 && imc < 40) {
				System.out.println("Você está com Obesidade tipo I");
			} else if(imc >= 40) {
				System.out.println("Você está com Obesidadi Mórbida");
			}
			
			
			break;
		case "basal":
			System.out.println("Diga seu nome:");
			String nomeBas = sc.next();
			
			System.out.println("digite sua idade:");
			byte idadeBas = sc.nextByte();
			
			System.out.println("Digite seu peso: (em kg");
			float pesoBas = sc.nextFloat();
			
			System.out.println("Você é homem? (1 para sim e 0 para não");
			boolean sexoBas = sc.hasNext();
			
			float metaBas;
			
			if(idadeBas >= 18 && idadeBas < 30 && sexoBas == true) {
			
				metaBas = 15.057f * pesoBas + 679;
				System.out.println(nomeBas + " Seu metabolismo Basal é" + metaBas);
			} else if (idadeBas >= 30 && idadeBas < 60 && sexoBas == true) {
				
				metaBas = 11.6f * pesoBas + 870;
				System.out.println(nomeBas + " Seu metabolismo Basal é" + metaBas);
			} else if( idadeBas >= 60 && sexoBas == true) {
				
				metaBas = 13.5f * pesoBas + 487;
				System.out.println(nomeBas + " Seu metabolismo Basal é" + metaBas);
			} else if(idadeBas >= 18 && idadeBas < 30 && sexoBas == false) {
		
				metaBas = 14.7f * pesoBas + 486.6f;
				System.out.println(nomeBas + " Seu metabolismo Basal é" + metaBas);
			} else if (idadeBas >= 30 && idadeBas < 60 && sexoBas == false) {
			
				metaBas = 8.7f * pesoBas + 829;
				System.out.println(nomeBas + " Seu metabolismo Basal é" + metaBas);
			} else if( idadeBas >= 60 && sexoBas == false) {
			
				metaBas = 10.5f * pesoBas + 596;
				System.out.println(nomeBas + " Seu metabolismo Basal é" + metaBas);		
			}
			
			default:
				break;
		}
	}
}
