package aulas_UNINTER;

public class Euro extends Moeda
{
	double valorHoje;
	
	/* Criando o construtore */
	public Euro(double moeda, double valorHoje)
	{
		super(moeda);
		this.valorHoje = valorHoje;
	}

	
	@Override
	public void info()
	{
		System.out.println("Temos um total de: " + moeda + "Euro");
	}

	
	@Override
	public double converter()
	{
		return valorHoje * moeda;
	}

}
