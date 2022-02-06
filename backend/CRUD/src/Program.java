import java.util.Scanner;

import services.ConsultClients;

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Boolean repetir = true;
		do {
			
		System.out.println("Digite uma das opções a abaixo:");
		System.out.println("0 - Sair");
		System.out.println("1 - Adicionar Cliente");
		System.out.println("2 - Atualizar Cliente");
		System.out.println("3 - Deletar Cliente");
		System.out.println("4 - Buscar Dados");
		int opcao = sc.nextInt();
		ConsultClients cliente = new ConsultClients();
			switch(opcao) {
				case 0:
					repetir = false;
					break;
				case 1:
					cliente.save();
					break;
				case 2:
					cliente.update();
					break;
				case 3:
					cliente.delete();
					break;
				case 4:
					cliente.read();
					break;
				default:
					System.out.println("Opção Invalida:");
					break;
			}
		}while(repetir);
		sc.close();
	}
	
}