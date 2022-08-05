package defaultPackage;

public class Desafio1 {
	public static void main(String[] args) {
		
		// ENTRADA
		double C = 2.43; 
		double K = C + 273.15;
		double Re = C * 0.8;
		double Ra = C * 1.8 + 32 + 459.67;
		double F = C * 1.8 + 32; 
		
		// SAIDA
		System.out.println("O valor de "+C+" convertido em Kelvin é: "+K);
		System.out.printf("O valor de "+C+" convertido em Réaumur é: %.2f\n",Re);
		System.out.printf("O valor de "+C+" convertido em Rankine é: %.2f\n",Ra);
		System.out.printf("O valor de "+C+" convertido em Fahrenheit é: %.2f\n",F);
		
	}
}
