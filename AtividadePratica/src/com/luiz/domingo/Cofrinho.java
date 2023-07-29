package com.luiz.domingo;

import java.util.ArrayList;

public class Cofrinho
{
	private ArrayList<Moeda> moedas;
	
	/* Construtor */
	public Cofrinho() 
	{
		this.moedas = new ArrayList<>();
	}
	
	
	/*Metodo adcionar moedas*/
	public void adcionar(Moeda moeda)
	{
		this.moedas.add(moeda);
	}
	
	
	/*Metodo para listar as moedas*/
	public void listagemMoedas()
	{
		/* Primeiro vamos verificar se nossa lista comtém moedas */
		if(this.moedas.isEmpty())
		{
			System.out.println("Lista vazia...");
			return;
		}
			
		for(Moeda moeda : this.moedas) 
		{
			moeda.info();
		}	
	}
	
	//Metodo Para Converter as Moedas Para o Valor em Real
	public double totalConvertido()
	{
		double valorConvertido = 0;
		
		if(this.moedas.isEmpty())
		{
			return 0;
		}
		
		for(Moeda moeda : this.moedas)
		{
			valorConvertido += moeda.converte();
		}
		
		return valorConvertido;
	}
	
	
	//Metodo Para Remover Uma Moeda Espessifica do Cofrinho
	public boolean removerMoedas(Moeda moeda) 
	{
		return this.moedas.remove(moeda);
	}
}
