package empresa;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        Locale.setDefault(Locale.US);
                    
		Cofrinho c = new Cofrinho();
		
        System.out.println("Digite os valores Aseguir");
        System.out.print("Digite o nome da moeda: ");
        String nomeMoeda = sc.next();
        
        System.out.print("Digite o valor da moeda: ");
		double value = sc.nextDouble();
        
        c.add(new Moeda(nomeMoeda, value));
		
		System.out.printf("O total do cofrinho : %.2f\n", c.calcularTotal());


	}
}
