package aulas_UNINTER;

public abstract class Moeda
{
	/*Atributo da class*/
	public double moeda;
	
	public double getMoeda() {
		return moeda;
	}

	//public void setMoeda(double moeda) {
	//	this.moeda = moeda;
	//}
	
	/* Construtor padrão */
	public Moeda() {}
	
	/* Construtor da class */
	public Moeda(double moeda)
	{
		super();
		this.moeda = moeda;
	};
	
	
	
	/* Metodos abstrato para exibir as informações e converter os valores da moedas */
	abstract void info(); 
	abstract double converter();

	
		
	
}
