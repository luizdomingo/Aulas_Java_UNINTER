package com.luiz.domingo;

public class Dolar extends Moeda
{
	public Dolar(double valor)
	{
		super(valor);
		this.valor =valor;
	}

	@Override
	public void info()
	{
		System.out.println("Dolar - " + valor);		
	}

	@Override
	public double converte()
	{
		return this.valor * 4.9;
		
	}

	@Override
	public boolean equals(Object objeto)
	{
		if(this.getClass() != objeto.getClass())
		{
			return false; // As Class Dos Objetos São Diferentes
		}
		
		Dolar objetoVerdadeiro = (Dolar) objeto;
		
		if(this.valor != objetoVerdadeiro.valor) 
		{
			return false; // Os Valores dos Atributos São Diferentes
		}
		
		return true; // A condição Foi Verdadeira
	}
}
