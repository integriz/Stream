import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pessoa {
	String id;
	String nome;
	String nacionalidade;
    int idade;  
     
    public Pessoa(){}   
     
    public Pessoa (String id, String nome, String nacionalidade, int idade){
    	this.id = id;
        this.nome = nome;  
        this.nacionalidade = nacionalidade; 
        this.idade=idade;
    }  
        
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Pessoa> populaPessoas(){
    	Pessoa pessoa1 = new Pessoa("p1" , "Matheus Henrique", "Brasil", 18);
    	Pessoa pessoa2 = new Pessoa("p2" , "Hernandez Roja", "Mexico", 21);
    	Pessoa pessoa3 = new Pessoa("p3" , "Mario Fernandes","Canada", 22);
    	Pessoa pessoa4 = new Pessoa("p4" , "Neymar Junior", "Brasil", 22);
    	List<Pessoa> list = new ArrayList<Pessoa>();  
    	list.add(pessoa1);
    	list.add(pessoa2); 
    	list.add(pessoa3);
    	list.add(pessoa4); 
    	return list; 
    }
      
    @Override  public String toString() { return this.nome; } 
    
    
    public static void main (String [] args) {
    	List<Pessoa> pessoas = new Pessoa().populaPessoas();
    	List<String> z = new ArrayList<String>();   	
    	
    	pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")).limit(1).forEach(x -> z.add(x.getNome()));
    	
    	System.out.println(z);
    	
    	IntStream stream = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")).mapToInt(Pessoa::getIdade);
    	
    	System.out.println(stream.count());
    	
    	double media = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")).mapToInt(pessoa -> pessoa.getIdade()).average().getAsDouble();
    	
    	System.out.println(media);
    	
    	
    	
    	List<Pessoa> pessoasComM = pessoas.stream().filter(pessoa -> pessoa.getNome().startsWith("M")).collect(Collectors.toList());
    	
    	System.out.println(pessoasComM);
    	
    	boolean todosMexicanos = pessoas.stream().allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));
    	
    	System.out.println(todosMexicanos);
    	
    	boolean maior17 = pessoas.stream().allMatch(pessoa -> pessoa.getIdade()>17);
    	
    	System.out.println(maior17);
    	
    	boolean maior18 = pessoas.stream().allMatch(pessoa -> pessoa.getIdade()>18);
    	
    	System.out.println(maior18);
    }
}