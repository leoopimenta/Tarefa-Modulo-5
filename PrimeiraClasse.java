package br.com.lpimentaa;

public class PrimeiraClasse {

	public static void main(String[] args) {
		String ambiente = args[0] + " " + args[1];
		if (ambiente.equals("Leo Pimenta")) {
			System.out.print(args[0] + " " + args[1] + "  " + "especialista java");
		} else if (ambiente.equalsIgnoreCase("Leo")){
            System.out.print("especialista backend");
			} 		
			
	}

}