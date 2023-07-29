package empresa;

public class Notebook_Aula_Pratica extends Computador_Aula_Pratica{
	double polegadasTela;
	
	public Notebook_Aula_Pratica(int gbMemoria, int numProcessadores, double polegadasTela)
    {
		super(gbMemoria, numProcessadores);
		this.polegadasTela = polegadasTela;
	}

	@Override
	double calculaValor()
    {
		double total = 250*gbMemoria + 500*numProcessadores + 100*polegadasTela;
		return total;
	}

}
