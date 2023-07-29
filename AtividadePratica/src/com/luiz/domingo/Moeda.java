package com.luiz.domingo;

public abstract class Moeda 
{
	protected double valor;
	
	/* Construtor padrão */
	public Moeda(double valor)
	{
		super();
		this.valor = valor;
	}
	
	/* Metodos abstratos */
	public abstract void info();
	public abstract double converte();
	
}
