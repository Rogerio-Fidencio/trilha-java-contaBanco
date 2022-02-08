import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int entry;
		
		Conta sampleAccount = new Conta();
		sampleAccount.setAccountNumber("938395");
		sampleAccount.setAccountHolder("Rogério");
		sampleAccount.setCpf("84739374584");
		sampleAccount.setType(1);
		sampleAccount.setBalance(1000.00);
		
		
		do {
				System.out.println("Dados da conta - 1 / Saque - 2 / Deposito - 3 / Sair - 0");
				entry = input.nextInt();
				
				switch (entry) {
				case 0: 
					break;
				case 1:
					System.out.println(sampleAccount.showAccount());
					break;
				case 2:
					double withdrawalValue = input.nextDouble();
					if (!sampleAccount.withdrawal(withdrawalValue)) {
						System.out.println("Saldo insuficiente!");
					}
					else {
						System.out.println("Saque realizado com sucesso!!");						
					}
					break;
				case 3:
					double depositValue = input.nextDouble();
					sampleAccount.deposit(depositValue);
					break;
				}
				
				
		} while (entry != 0);
		
		input.close();
	}
}
