package empresa;
import java.util.ArrayList;

public class PrincipalAulaPratica {

	public static void main(String[] args) {
		
		Desktop_Aula_Pratica compA = new Desktop_Aula_Pratica(8,4,600);
		Notebook_Aula_Pratica compB = new Notebook_Aula_Pratica(8,4,15);
		
		Computador_Aula_Pratica comp;
		
		comp = compA;
		System.out.println("Valor: " + comp.calculaValor());
		comp = compB;
		System.out.println("Valor: " + comp.calculaValor());
		
		ArrayList<Computador_Aula_Pratica> listaComputadores = new ArrayList();
		
		listaComputadores.add(compA);
		listaComputadores.add(compB);
		listaComputadores.add(new Desktop_Aula_Pratica(16,8,1200));
		listaComputadores.add(new Notebook_Aula_Pratica(16,8,18));
		
		var total = 0;
		
		for(Computador_Aula_Pratica c : listaComputadores)
        {
			total += c.calculaValor();
		}
		
		System.out.println("Total do valor: " + total);
	}
}
