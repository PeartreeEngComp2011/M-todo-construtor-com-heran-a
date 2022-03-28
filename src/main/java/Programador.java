
public class Programador extends Pessoa
{

    public String linguagem;
    
    public Programador(String ctcNome, Integer ctcIdade, String ctclinguagem)
    {
        //this.nome = ctcNome;
        super(ctcNome,ctcIdade);
        this.linguagem = ctclinguagem;
    }
    
    public String getLinguagem() 
    {
        return linguagem;
    }

    public void setLinguagem(String linguagem) 
    {
        this.linguagem = linguagem;
    }
    
    public static void main(String[] args)
    {
        Programador dgp = new Programador("Daniel",31,"Java");
        System.out.println("Nome: "+dgp.getNome() +"\n "+ "Idade: "+dgp.getIdade()+"\n"+
                "\n "+ "Linguagem: "+dgp.getLinguagem()+"\n");   
    }
}
