package empresa;

import java.util.ArrayList;
import java.util.Collections;

public class Principal
{

	
	public static int[] instanciaArray(int n)
    {
		return new int[n];
	}
	
	public static void main(String[] args)
    {
		
//		int tam=10;
//		
//		int arr[];
		
        //Podemos declarar com tamanho fixo
        String[] names = new String[10];
        
        //Podemos instanciar Array com declaração direta de valores
        String[] persons = new String[]{"Pica", "Madeira", "Pau", "Meu Piru"};
        
		try
        {
			for (String p : persons)
            {
                System.out.println("os names dentro do array sao:-->> " + p);
            }

		}
		catch(NegativeArraySizeException e)
        {
			System.out.println("Valor invalido, digite outro");
			System.out.println(e);
		}
		catch(ArithmeticException e)
        {
			System.out.println("Impossivel dividir por zero");
		}
	}
}
