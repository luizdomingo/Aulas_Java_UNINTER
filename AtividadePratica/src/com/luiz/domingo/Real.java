package com.luiz.domingo;

public class Real extends Moeda
{
	public Real(double valor)
	{
		super(valor);
		this.valor = valor;
	}
	
	@Override
	public void info()
	{
		System.out.println("Real - " + valor);
	}
	
	@Override
	public double converte()
	{
		return this.valor;
	}
	
	@Override
	public boolean equals(Object objeto)
	{
		if(this.getClass() != objeto.getClass())
		{
			return false; // As Class Dos Objetos São Diferentes
		}
		
		Real objetoVerdadeiro = (Real) objeto;
		
		if(this.valor != objetoVerdadeiro.valor) 
		{
			return false; // Os Valores dos Atributos São Diferentes
		}
		
		return true; // A condição Foi Verdadeira
	}
}
