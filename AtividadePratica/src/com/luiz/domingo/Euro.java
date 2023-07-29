package com.luiz.domingo;

public class Euro extends Moeda 
{
	public Euro(double valor)
	{
		super(valor);
		this.valor = valor;
	}

	@Override
	public void info()
	{
		System.out.println("Euro - " + valor);		
	}

	@Override
	public double converte() 
	{
		return this.valor * 5.8;
		
	}
	
	@Override
	public boolean equals(Object objeto)
	{
		if(this.getClass() != objeto.getClass())
		{
			return false; // As Class Dos Objetos São Diferentes
		}
		
		Euro objetoVerdadeiro = (Euro) objeto;
		
		if(this.valor != objetoVerdadeiro.valor) 
		{
			return false; // Os Valores dos Atributos São Diferentes
		}
		
		return true; // A condição Foi Verdadeira
	}
	
	
}
