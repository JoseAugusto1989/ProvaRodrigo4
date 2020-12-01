package Prova;

import java.util.Scanner;

public class StartApp {
	
	static int num = 100;
	static Cadastro cad = new Cadastro();
	static Scanner reading = new Scanner(System.in);
	static int total = 0, saldo = 0;
	static Cadastro[] cad1 = new Cadastro[num];
	
	public static void main(String[]args) {
		
		do {
			menu();
			    
			    if (cad.Menu == 1) {
			    	cadastroConta();
			    	
			    } else if (cad.Menu == 2) {
			    	System.out.println("O saldo em conta é:");
			    	verSaldo();
			    	
			    } else if (cad.Menu == 3) {
			    	System.out.println("Fim");
			    	break;
			    	
			    } else {
			    	System.out.println("Opção inválida, digite novamente!");
			    }
			    
			    
		} while(true);
		
		reading.close();
	}
	public static void menu() {
		
		System.out.println("   Bem vindo ao menu");
		System.out.println();
		System.out.println("1. Cadastro de Conta");
		System.out.println("2. Ver saldo");
		System.out.println("3. Sair");
		System.out.println();
		
		System.out.println("Digite a opção desejada:");
            cad.Menu = reading.nextInt();    reading.nextLine();
		
	}
	public static void cadastroConta() {
		
		for (int i = 0; i < num; i++) {
		
			System.out.println();
			System.out.print("Digite se a conta é 1 para 'despesa' (saída) ou 2 para 'receita' (entrada) ");
			System.out.println("ou 3 para retornar ao menu anterior:");
			    cad.TipoConta = reading.nextInt();   reading.nextLine();
			    
			    if (cad.TipoConta == 1) {
			    	System.out.println("Saída");
			    	despesaReceita();
			    	total -= cad.Valor;
			    	
			    } else if (cad.TipoConta == 2) {
			    	System.out.println("Entrada");
			    	despesaReceita();
			    	saldo += cad.Valor;
			    	
			    } else if (cad.TipoConta == 3) {
			    	menu();
			    	
			    } else {
			    	
			    	System.out.println("Opção inválida, digite novamente!");
			    }
			    
			    cad1[i] = cad;
		}
			    
	}
	
	
    public static void despesaReceita() {
    	
    	for (int i = 0; i < num; i++) {
	    	System.out.println();
	    	System.out.println("Digite a descrição:");
	    	    cad.Descricao = reading.nextLine();
	    	System.out.println("Digite o valor da conta:");
	    	    cad.Valor = reading.nextFloat();    reading.nextLine();
	    	System.out.println("Digite a data de vencimento:");
	    	    cad.DataVencimento = reading.nextLine();
	    	    
	    	    cad1[i] = cad;
    	}
    	
    }
    public static int verSaldo() {
    	
    	return total-saldo;
    	
    }
    
}
