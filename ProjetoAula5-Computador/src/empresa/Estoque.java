package empresa;

import java.util.ArrayList;

public class Estoque
{
	ArrayList<Computador_Aula_Pratica> listaComputador = new ArrayList<Computador_Aula_Pratica>();
	
	public void adicionar(Computador_Aula_Pratica c)
    {
		listaComputador.add(c);
	}
	
	public void remover(Computador_Aula_Pratica c)
    {
		listaComputador.remove(c);
	}
	
	public void listar()
    {
		// Computador_Aula_Pratica.forEach(compuatdor -> System.out.println());
		
        listaComputador.forEach(compuatdor -> System.out.println(compuatdor));
        
//		for (Computador_Aula_Pratica c : listaComputador)
//        {
//			System.out.println(c);
//		}
	}
	

}
