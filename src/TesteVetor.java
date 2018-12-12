import java.util.Scanner;

public class TesteVetor {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[5];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Digite um inteiro qualquer positivo");
			vetor[i] = scan.nextInt();
			if(vetor[i]%2 != 0) {
				System.out.println("Encontrado um ímpar, saíndo do loop...");
				break;
			}
		}
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("[" + vetor[i] + "]");
		}
	}
}
