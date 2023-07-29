package empresa;

public abstract class Computador_Aula_Pratica {

	int gbMemoria;
	int numProcessadores;

	public Computador_Aula_Pratica(int gbMemoria, int numProcessadores)
    {
		super();
		this.gbMemoria = gbMemoria;
		this.numProcessadores = numProcessadores;
	}

	abstract double calculaValor();
}
