
public class Pessoa 
{
    //Atributo protected
    protected String nome;
    protected Integer idade;
    //Método construtor
    public Pessoa(String ctcNome, Integer ctcIdade)
    {
        this.nome = ctcNome;
        this.idade = ctcIdade;
    }
    
    public String getNome() 
    {
        return nome;
    }
    
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    public Integer getIdade()
    {
        return idade;
    }
    
    public void setIdade(Integer idade)
    {
        this.idade = idade;
    }
}
