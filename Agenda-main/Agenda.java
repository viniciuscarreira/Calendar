public class Agenda {
    // vetor que guardará as pessoas
    private Pessoa pessoas[];
   
    // construtor da classe Agenda
    public Agenda(int quantidade){
      pessoas = new Pessoa[quantidade];
    }
   
    public void armazenaPessoa(String nome, int idade, String telefone, String email, String aniversario){
      // ainda temos posições disponíveis na agenda?
      boolean cadastrado = false;
      for(int i = 0; i < pessoas.length; i++){
        if(pessoas[i] == null){
          // encontramos uma posição
          Pessoa p = new Pessoa(nome, idade, telefone, email, aniversario); // criamos uma nova pessoa
          // guardamos ela no vetor
          pessoas[i] = p;
          // e avisamos que o cadastro foi efetuado com sucesso
          cadastrado = true;
          break; // sai do laço
        }
      }
       
      if(cadastrado){
        System.out.println("\nCadastro efetuado com sucesso");
      }
      else{
        System.out.println("\nNão foi possível cadastrar. Agenda cheia");
      }
    }
   
    // método que permite pesquisar e excluir uma pessoa
    public void removePessoa(String nome){
      // vamos verificar se a exclusão foi efetuada com sucesso
      boolean excluido = false;
      for(int i = 0; i < pessoas.length; i++){
        if(pessoas[i] != null){
          // esta é a pessoa que estamos procurando?
          if(pessoas[i].getNome().equals(nome)){
            pessoas[i] = null; // posição disponível novamente
            excluido = true;
            break; // sai do laço
          }
        }
      }
       
      if(excluido){
        System.out.println("\nPessoa removida com sucesso");
      }
      else{
        System.out.println("\nNão foi possível remover. Pessoa não encontrada.");
      }
    }
   
    // informa em que posição da agenda está a pessoa 
    public int buscaPessoa(String nome){
      int resultado = -1;
       
      // vamos verificar se a pessoa existe na agenda
      for(int i = 0; i < pessoas.length; i++){
        if(pessoas[i] != null){
          // esta é a pessoa que estamos procurando?
          if(pessoas[i].getNome().equals(nome)){
            resultado = i;
            break; // sai do laço
          }
        }
      }
       
      return resultado;
    }
   
    // imprime os dados de todas as pessoas da agenda
    public void imprimeAgenda(){
      // vamos percorrer o vetor de pessoas e imprimir cada uma
      for(int i = 0; i < pessoas.length; i++){
        if(pessoas[i] != null){
          Pessoa p = pessoas[i];
          System.out.println("\nNome: " + p.getNome());
          System.out.println("Idade: " + p.getIdade());
          System.out.println("Telefone: " + p.getTelefone());
          System.out.println("Email: " + p.getEmail());
          System.out.println("Aniversario: " + p.getAniversario());
        }
      }
    }
   
    // imprime os dados da pessoa que está na posição "i" da agenda
    public void imprimePessoa(int index){
      // este índice é válido?
      if((index < 0) || (index > (pessoas.length - 1))){
        System.out.println("\nÍndice inválido");
      }
      else{
        Pessoa p = pessoas[index];
        if(p == null){
          System.out.println("\nNão existe pessoa nesse índice ainda.");
        }
        else{
          System.out.println("\nNome: " + p.getNome());
          System.out.println("Idade: " + p.getIdade());
          System.out.println("Telefone: " + p.getTelefone());
          System.out.println("Email: " + p.getEmail());
          System.out.println("Aniversario: " + p.getAniversario());
        }
      }
    }  
  }