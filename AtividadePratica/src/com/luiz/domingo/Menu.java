package com.luiz.domingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu
{
	/*
	 * Vamos Decalrar uma Variavel Private Para Nosso Leitor de Teclado E Outra Para
	 * Representar o Nosso Cofrinho
	 */

	private Scanner sc;
	private Cofrinho cofre;

	public Menu()
	{
		cofre = new Cofrinho();
		sc = new Scanner(System.in);
	}

	/* Metodo Para Apresentar o Menu de Opções */
	public void opcoesMenu()
	{
		/* Matriz Para Armezenar os Valores de Opçoes */
		String[] opcoes =
		{
			"1 - Adcionar Moedas",
			"2 - Remover Moedas",
			"3 - Listar Moedas",
			"4 - Converter Moedas para Real",
			"0 - Sair"
		};

		System.out.println("Escolha uma das opcoes aseguir...");

		for (String op : opcoes)
		{ /* Laço Para Percorrer os Valores da Matriz de Opção */
			System.out.println(op); /* Exibi os Elementos da Matriz */
		}

		/* Vamos Usar a Estrutura switch Para Criar Nosso Controle de Opçoes */
		try 
		{
			int opc = sc.nextInt(); /* Variavél de Opçoes */

			switch (opc)
			{
				case 1: // Chamar o Metodo de Opcoes de Moedas - Sendo Possivel Escolher qual Moeda
					// Adcionoar
					opcoesMoedas();
					break;

				case 2: // Chamar o Metodo de Opcoes de Remover Moedas - Sendo Possivel Escolher qual
						// Moeda Sera Removida
					removerMoedasDoCofrinho();
					break;

				case 3: // Chamar o Metodo de Opcoes de Listar as Moedas - Sendo Possivel Visualizar
						// Todas as Moedas do Cofre
					cofre.listagemMoedas();
					System.out.println("---------------------------------------\n");
					opcoesMenu();
					break;

				case 4: // Chamar o Metodo de Converter Todas as Moedas Para Real
					System.out.println("Temos um Total de: R$" + cofre.totalConvertido());
					System.out.println("---------------------------------------\n");
					opcoesMenu();
					break;

				case 0: // Caso o Usuario Escolha Opção 0, Encerra o Sistema
					System.out.println("Encerrando o Systema, Ate Breve...");
					return;

				default:
					System.out.println("Opcao Invalida!...");
					opcoesMenu(); // Caso o Usuario Digite um Valor Invalido Chamamos o Menu Novamente
					break;
			}
		} 
		catch (Exception e)
		{
			System.out.println("Erro ao Digitar a Opcao, Tente Novamente...");
			return;
		}
	}

	public void opcoesMoedas() 
	{
		List<String> moedas = new ArrayList<>();

		moedas.add("Selecione uma moeda...");
		moedas.add("1 - Real");
		moedas.add("2 - Dolar");
		moedas.add("3 - Euro");
		moedas.add("0 - Menu Principal");

		/* Expressão Lambda para Listar os Valores da Lista de Moedas */
		moedas.forEach(moeda -> System.out.println(moeda));

		System.out.println("---------------------------------------\n");
		Moeda novaMoeda;

		try
		{
			int opc = sc.nextInt();
			switch (opc)
			{
				case 1:// Adcionar a Moeda de Real no Cofre
					System.out.println("Adcione o valor da moeda...");
					double valorReal = sc.nextDouble();
					novaMoeda = new Real(valorReal); // Aqui ja Comessamos a Usar o Conceito de Polimorfismo.
					cofre.adcionar(novaMoeda);
					System.out.println("Moeda Real Adcionada Com Sucesso...");
					System.out.println("---------------------------------------\n");
					continuarOuNao();
					opcoesMoedas();
					break;

				case 2:// Adcionar a Moeda de Dolar no Cofre
					System.out.println("Adcione o valor da moeda...");
					double valorDolar = sc.nextDouble();
					novaMoeda = new Dolar(valorDolar);
					cofre.adcionar(novaMoeda);
					System.out.println("Moeda Dolar Adcionada Com Sucesso...");
					System.out.println("---------------------------------------\n");
					continuarOuNao();
					opcoesMoedas();
					break;
	
				case 3: // Adcionar a Moeda de Euro no Cofre
					System.out.println("Adcione o valor da moeda...");
					double valorEuro = sc.nextDouble();
					novaMoeda = new Euro(valorEuro);
					cofre.adcionar(novaMoeda);
					System.out.println("Moeda Euro Adcionada Com Sucesso...");
					System.out.println("---------------------------------------\n");
					continuarOuNao();
					opcoesMoedas();
					break;
	
				case 0:
					opcoesMenu(); // Caso o Usuario Digite o Valor 0 , Retornamos Para o Menu Principal
					return; // ou Seja Encerramos a Cessao de Adiconar Moedas no Cofre
	
				default:
					System.out.println("opcao invalida...");
					opcoesMoedas(); // Caso o Usuario Digite o Valor Fora da Lista , Retornamos Para o Menu Moedas
					break;
			}
		} 
		catch (Exception e)
		{
			// Se o Usuario Digitar um Valor que Pode Causar Algum Bug em Nosso Sistema
			// Iremos Retornar Para o Menu Principal
			System.out.println("Erro ao digitar o valor " + e.getMessage());
			opcoesMenu();
		}
	}

	public void continuarOuNao()
	{

		try
		{
			System.out.println("Deseja Continuar ? ");
			System.out.println("1 - Para Continuar");
			System.out.println("2 - Para Sair");

			int opc = sc.nextInt();

			if (opc == 1)
			{
				opcoesMoedas();
				return;
			}
			else if(opc == 2)
			{
				opcoesMenu();
			}
		
		}
		catch (Exception e)
		{
			System.out.println("Erro ao Escolhe a Opcao..." + e.getMessage());
			continuarOuNao();
		}
	}

	public void removerMoedasDoCofrinho() 
	{
		List<String> moedas = new ArrayList<>();
		
		moedas.add("1 - Remover Real");
		moedas.add("2 - Remover Euro");
		moedas.add("3 - Remover Dolar");
		moedas.add("0 - Menu Principal");
		
		double valorMoeda = 0;
		Moeda novaMoeda = null;
		
		try
		{
			System.out.println("Selecione Qual Moeda Deseja Remover");
			moedas.forEach(moeda -> System.out.println(moeda));// Lista as Opções de Moedas
			
			int opc = sc.nextInt();
			
			switch (opc)
			{
				case 1:
					System.out.println("Digite o Valor Que Deseja Remover");
					valorMoeda = sc.nextDouble();
					novaMoeda = new Real(valorMoeda);
					boolean moedaRemovidaReal = cofre.removerMoedas(novaMoeda);
					if (moedaRemovidaReal)
					{
						System.out.println("Valor Removido com Sucesso!...");
					}
					else
					{
						System.out.println("Moeda Não Encontrada...");	
					}
					opcoesMenu();
					break;
				
				case 2:
					System.out.println("Digite o Valor Que Deseja Remover");
					valorMoeda = sc.nextDouble();
					novaMoeda = new Euro(valorMoeda);
					boolean moedaRemovidaEuro = cofre.removerMoedas(novaMoeda);
					if (moedaRemovidaEuro)
					{
						System.out.println("Valor Removido com Sucesso!...");
					}
					else
					{
						System.out.println("Moeda Não Encontrada...");	
					}
					opcoesMenu();
					break;
				
				case 3:
					System.out.println("Digite o Valor Que Deseja Remover");
					valorMoeda = sc.nextDouble();
					novaMoeda = new Dolar(valorMoeda);
					boolean moedaRemovidaDolar = cofre.removerMoedas(novaMoeda);
					if (moedaRemovidaDolar)
					{
						System.out.println("Valor Removido com Sucesso!...");
					}
					else
					{
						System.out.println("Moeda Não Encontrada...");	
					}
					opcoesMenu();
					break;
				
				case 0:
					opcoesMenu();
					return;
				
				default:
					System.out.println("Valor Invalido...");
					removerMoedasDoCofrinho();
			}
		}
		catch (Exception e)
		{
			System.out.println("Erro ao Remover a Moeda..." + e.getMessage());
			removerMoedasDoCofrinho();
		}
	}
}
//Fim da Class