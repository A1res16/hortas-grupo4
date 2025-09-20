/**@author aires
 * @version 18/09/2025
 */

import java.util.ArrayList;

public class GereHorta 
{
   private ArrayList<Horta> hortas;

   public GereHorta() 
   {
	   this.hortas = new ArrayList<>();
   }
   
   //metodo para registar uma horta com nome, localizacao
   public void registarHorta(String nome, String localizacao, Horta horta)
   {
       hortas.add(horta);
       System.out.println("Horta registada: " + nome + " (" + localizacao + ")");
   }
   
   //metodo para registar um talhao numa horta
   public void registarTalhao(String nomeHorta, Talhao talhao)
   {
	   for (Horta h : hortas)
	   {
		   if (h.getNome().equalsIgnoreCase(nomeHorta))
		   {
			   h.adicionarTalhao(talhao);
			   System.out.println("Talhao registado na horta" + nomeHorta);
			   return;
		   }
	   }
	   System.out.println("Horta nao encontrada.");
   }
   
   //metodo para registar uma plantacao de um talhao numa horta
   public void registarPlantacao(String nomeHorta, int numeroTalhao, Plantacao plantacao)
   {
	   for (Horta h : hortas)
	   {
		   if (h.getNome().equalsIgnoreCase(nomeHorta))
		   {
			   	Talhao t = h.procurarTalhaoPorNumero(numeroTalhao);
			   	if (t != null)
			   	{
			   		t.adicionarPlantacao(plantacao);
			   		System.out.println("Plantacao registada no talhao " + numeroTalhao);
			   	}
			   	else 
			   	{
			   		System.out.println("Talhao nao encontrado.");
			   	}
			   	return;
		   }
	   }
	   System.out.println("Horta nao encontrada.");
   }
   
   //imprimir os detalhes das plantacoes de uma horta
   public void imprimirPlantacoes(String nomeHorta)
   {
	   for (Horta h : hortas)
	   {
		   if (h.getNome().equalsIgnoreCase(nomeHorta))
		   {
			   System.out.println("Plantacoes da horta " + h.getNome() + ": ");
			   for (Talho t : h.getTalhoes())
			   {
				   System.out.println(" Talhao " + t.getNumero() + " (" + t.getAreaM2() + " m2)");
				   for (Plantacao p : t.getPlantacoes())
				   {
					   System.out.println("   - " + p.getCultura() + " | " + p.getDataSementeira());
				   }
			   }
			   return;
		   }
	   }
	   System.out.println("Horta nao encontrada.");
   }
   
   //imprimir a area total de uma horta em metros2
   public void imprimirAreaTotal(String nomeHorta)
   {
	   for (Horta h : hortas)
	   {
		   if (h.getNome().equalsIgnoreCase(nomeHorta))
		   {
			   double soma = 0;
			   for (Talho t : h.getTalhoes())
			   {
				   soma = soma + t.getAreaM2();
			   }
			   System.out.println("Area total da horta " + h.getNome() + ": " + soma + " m2");
			   return;
		   }
	   }
	   System.out.println("Horta nao encontrada.");
   }
   
   //imprimir o nome e a area da horta com maior area
   public void imprimirHortaComMaiorArea()
   {
	   Horta maior = hortas.get(0);
	   double maiorArea = maior.areaTotal();
	   
	   for (Horta h : hortas)
	   {
		   double area = h.areaTotal();
		   if (area > maiorArea)
		   {
			   maior = h;
			   maiorArea = area;
		   }
	   }
	   System.out.println("Horta com maior area: " + maior.getNome() + " (" + maiorArea + " m2)");
   }
   
   //imprimir os nomes das hortas que tem um tipo de cultura
   public void imprimirHortasComCultura(String cultura)
   {
	   boolean encontrou = false;
	   System.out.println("Hortas que tem a cultura " + cultura + ": ");
	   
	   for (Horta h : hortas)
	   {
		   if (h.temCultura(cultura))
		   {
			   System.out.println("- " + h.getNome());
			   encontrou = true;
		   }
	   }
	   
	   if (!encontrou)
	   {
		   System.out.println("Nenhuma horta encontrada com essa cultura)");
	   }
   }
}
