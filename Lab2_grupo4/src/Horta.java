
public class Horta {
	Private String nome;
	Private String loc;
	
	public horta(String nome; String loc) {
		this.nome = nome;
		this.loc = loc;
		private List<Talhao> talhoes;
		}
	
	public String getNome() {
		return nome;
	}
	
	public String getLoc() {
		return loc;
	}
	
	public List<Talhao> getTalhoes() {
        return talhoes;
    }
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setLoco(String loc) {
		this.loc = loc;
	}
	
	public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
	
	public boolean adicionarTalhao(Talhao novoTalhao) {
		
		for (Talhao t : talhoes) {
			if (t.getID( == novoTalhao.getID())) {
				System.out.println("O Talhão com ID: " + novoTalhao.getID() + " já existe");
				return false;
			}
			talhoes.add(novoTalhao);
			System.out.println("O Talhão com ID: " + novoTalhao.getID() + " foi adicionado com sucesso!");
			return true;
		}
	}
	
}
