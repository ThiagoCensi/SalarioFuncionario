package Entidades;

public class Empregado {

		public String nome;
		public double SalarioBruto;
		public double imposto;
		
		public double SalarioLiquid() {
			return SalarioBruto - imposto;
		}
		
		public double acrescimo(double porcentagem) {
			
			return SalarioBruto += SalarioBruto * porcentagem /100;
		}
		
		public String toString() {
			return nome + ", $ " + String.format("%.2f", SalarioLiquid());
		}
		

}
