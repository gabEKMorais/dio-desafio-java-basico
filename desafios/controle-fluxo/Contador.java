package ControleFluxo;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();		
		try {
            int produto = contar(parametroUm, parametroDois);
			for (int i = 1; i <= produto; i++) {
				System.out.println("Imprimindo o número " + i);	
			}
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}		
	}
	static int contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo.");
        }
		return (parametroDois - parametroUm);
	}
}