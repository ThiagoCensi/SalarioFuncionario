package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Empregado;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Empregado emp = new Empregado();
		
		System.out.println("Programa para ler dados do funcion�rio com classe");
		System.out.println("Dados do funcion�rio: ");
		
		System.out.print("Nome: ");
		emp.nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		emp.SalarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + emp);
		
		System.out.println("Qual a porcentagem de aumento deseja atribuir ao funcion�rio? ");
		double porcentagem = sc.nextDouble();
		emp.acrescimo(porcentagem);
		
		System.out.println();
		System.out.println("Atualiza��o de funcion�rio: " + emp);
		
		sc.close();

	}

}
