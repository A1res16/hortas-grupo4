import java.util.Scanner;

public class Teste {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		GereHorta gh = new GereHorta();
		
		int x = menu(ler);
		
		while (x < 1 || x > 7) 
		{
			x = menu(ler);
		}
		
		opcoes(x, ler, gh);		
		
		
		
	}
	
	public static int menu(Scanner ler)
	{
		System.out.println("1 • Registar hortas\r\n"
				+ "2 • Registar os talhões de uma horta\r\n"
				+ "3 • Registar as plantações de um talhão numa dada horta\r\n"
				+ "4 • Imprimir os detalhes das plantações de uma dada horta.\r\n"
				+ "5 • Imprimir a área total de uma horta em metros quadrados.\r\n"
				+ "6 • Imprimir o nome e a área da horta com maior área.\r\n"
				+ "7 • Imprimir o nome das hortas que têm plantadas nos seus talhões um dado tipo de cultura.");
		
		return ler.nextInt();
	}
	
	
	public static void opcoes(int x, Scanner ler, GereHorta gh)
	{
		if( x == 1)
		{
			System.out.println("nome da horta: ");
			String nomeHorta = ler.next();
			System.out.println("localização da horta: ");
			String localizacaoHorta = ler.next();
			gh.registarHorta(nomeHorta, localizacaoHorta);
	
		}
		
		if( x == 2)
		{
			System.out.println("nome da horta: ");
			String nomeHorta = ler.next();
			System.out.println("nome do talhão:  ");
			String nomeTalhao = ler.next();
			System.out.println("numero do talhão:  ");
			int numeroTalhao = ler.nextInt();
			gh.registarTalhao(nomeHorta, nomeTalhao, numeroTalhao);
	
		}
		
		if( x == 3)
		{
			System.out.println("numero do talhão:  ");
			int numeroTalhao = ler.nextInt();
			System.out.println("nome da plantação:  ");
			String nomePlantacao = ler.next();
			System.out.println("tipo da plantação:  ");
			String nomeTipo = ler.next();
			gh.registarPlantacao(numeroTalhao, nomePlantacao, nomeTipo);
			
		}
		
		if( x == 4)
		{
			System.out.println("nome da horta: ");
			String nomeHorta = ler.next();
			gh.imprimirPlantacoes(nomeHorta);
			
		}
		
		if( x == 5)
		{
			System.out.println("nome da horta: ");
			String nomeHorta = ler.next();
			gh.imprimirAreaTotal(nomeHorta);
			
		}
		
		if( x == 6)
		{
			gh.imprimirHortaComMaiorArea();
		}
		
		if( x == 7)
		{
			System.out.println("nome da cultura: ");
			String nomeCultura = ler.next();
			gh.imprimirHortasComCultura(nomeCultura);
		}
		
		x = menu(ler);
		
		while (x < 1 || x > 7) 
		{
			x = menu(ler);
		}
	}

}

