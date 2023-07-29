package empresa;

public class Desktop_Aula_Pratica extends Computador_Aula_Pratica{
	double acessorios;
	
	public Desktop_Aula_Pratica(int gbMemoria, int numProcessadores, double acessorios)
    {
		super(gbMemoria, numProcessadores);
		this.acessorios = acessorios;
	}



	@Override
	double calculaValor() {
		double total = 200*gbMemoria + 400*numProcessadores + acessorios;
		return total;
	}

}
