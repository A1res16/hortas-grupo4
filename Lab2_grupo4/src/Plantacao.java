import java.time.LocalDate;

public class Plantacao 
{

	private String tipo;
	private LocalDate data;
	
	
	public Plantacao(String tipo, LocalDate data) 
	{
		this.tipo = tipo;
		this.data = data;
	}


	public String getTipo() {
		return tipo;
	}

	public void imprimir()
	{
		System.out.println("tipo: " +tipo);
		System.out.println("data: " +data);
	}
	
	
	
}
