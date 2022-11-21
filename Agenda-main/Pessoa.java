public class Pessoa {
    private String nome;
    private int idade;
    private String telefone;
    private String email;
    private String aniversario;
   
    // construtor cheio 
    public Pessoa(String nome, int idade, String telefone, String email, String aniversario) {
      this.nome = nome;
      this.idade = idade;
      this.telefone = telefone;
      this.email = email;
      this.aniversario = aniversario;
    }
   
    // construtor vazio
    public Pessoa() {
    }
     
     
    // método que imprime todos os dados da pessoa
    public void imprimirDados(){
      System.out.println("Nome: " + nome + "\nIdade: " +
        idade + "\nTelefone: " + telefone + "\nEmail: " + email + "\nAniversario: " + aniversario);
    }
    
    //Nome
    public String getNome() {
      return nome;
    }
   
    public void setNome(String nome) {
      this.nome = nome;
    }
   
    //Idade
    public int getIdade() {
      return idade;
    }
   
    public void setIdade(int idade) {
      this.idade = idade;
    }
   
    //Telefone
    public String getTelefone() {
      return telefone;
    }
   
    public void setTelefone(String telefone) {
      this.telefone = telefone;
    }
    
    //Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Aniversario
    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
  }     
  