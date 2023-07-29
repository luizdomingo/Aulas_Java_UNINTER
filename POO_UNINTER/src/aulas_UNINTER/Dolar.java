package aulas_UNINTER;

public class Dolar extends Moeda
{
	double valorHoje;
	
	/* Criando o construtor  */
	public Dolar(double moeda, double valorHoje)
	{
		super(moeda);
		this.valorHoje = valorHoje;
	}
	
	
	@Override
	public void info() 
	{
		System.out.println("Temos um total de: " + moeda + " Dolar");
	}

	
	@Override
	public double converter() 
	{
		return valorHoje * moeda;
	}

}
