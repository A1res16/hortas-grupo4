
public class Horta {
	Private String nome;
	Private String localizacao;
	
	public horta(String nome; String localizacao) {
		this.nome = nome;
		this.localizacao = localizacao;
		private List<Talhao> talhoes;
		}
	
	
	public String getNome() {
		return nome;
	}
	
	public String getLocalizacao() {
		return localizacao;
	}
	
	public List<Talhao> getTalhoes() {
        return talhoes;
    }
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setLoco(String localizacao) {
		this.loc = loc;
	}
	
	public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
	
	
	
	public boolean adicionarTalhao(Talhao novoTalhao) {
		
		for (Talhao t : talhoes) {
			if (t.getNumero() == novoTalhao.getNumero())) {
				System.out.println("O Talhão núemero: " + novoTalhao.getNumero() + " já existe");
				return false;
			}
			talhoes.add(novoTalhao);
			System.out.println("O Talhão número: " + novoTalhao.getNumero() + " foi adicionado com sucesso!");
			return true;
		}
		
		
		
		public Talhao procurarTalhaPorNumero(int numero) {
			for (Talhao t : talhoes ) {
				if (t.getNumero == numero) {
					return t;
				}
				return null;
			}
		}
		
		
		
		public double areaTotal() {
			double soma == 0.0;
			
		for (Talhao t : talhoes) {
			soma += t.getAreaM2();
		}
		return soma;
		}
		
		
		
		public boolean temCultura(String cultura) {
			if (cultura == null) {
				return false;
			}
			
			for(Talhao t : talhoes) {
				for (Plantacao p : t.getPlantacoes()) {
					if (cultura.equalsIgnoreCase(p.getCultura())) {
						return true;
					}
				}
			}
			return true
		}
		
		 
		
		@Override
		    public String toString() {
		        return "Horta{" +
		                "nome='" + nome + '\'' +
		                ", localizacao='" + localizacao + '\'' +
		                ", talhoes=" + talhoes.size() +
		                ", areaTotal=" + areaTotal() + " m2}";
		    }
	}
	
}
