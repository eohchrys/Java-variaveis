package br.senai.sp.jandira;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		
	
		double juros, capital, taxa, tempo;
		Scanner leitor; 
		
		leitor = new Scanner (System.in);
		
		System.out.print("Qual o Capital:");
	    
		capital = leitor.nextDouble();
	
		
		System.out.print("Qual a taxa :");
	    
		taxa = leitor.nextDouble();
		
		
		System.out.print("Qual o tempo :");
	    
		tempo = leitor.nextDouble();
	

		juros = capital*taxa / 100*tempo; 
			
		System.out.printf("o valor do juros é %s %n", juros);
		System.out.printf("ao final do período você terá R$%s:", juros + capital);

}
}