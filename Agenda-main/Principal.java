import java.util.Scanner;
 
public class Principal {
  // para fazer a leitura da entrada do usuário
  static Scanner entrada = new Scanner(System.in);
   
  public static void main(String[] args) {
    // cria uma nova Agenda
    Agenda agenda = new Agenda(10);
    String nome; // nome da pessoa
    int idade; // idade da pessoa
    String telefone; // telefone da pessoa
    String email; // email da pessoa
    String aniversario; // aniversario da pessoa
     
    // cria o menu de opções
    while(true){
      System.out.println("\n1. Nova Pessoa");
      System.out.println("2. Excluir Pessoa");
      System.out.println("3. Buscar Pessoa");
      System.out.println("4. Imprimir Agenda");
      System.out.println("5. Imprimir Pessoa (Índice)");
      System.out.println("6. Sair");
      System.out.print("Sua opção: ");
      int opcao = Integer.parseInt(entrada.nextLine());
       
      switch(opcao){
        case 1:
          System.out.print("\nInforme o nome: ");
          nome = entrada.nextLine();
          System.out.print("Informe a idade: ");
          idade = Integer.parseInt(entrada.nextLine());
          System.out.print("Informe o telefone: ");
          telefone = entrada.nextLine();
          System.out.print("Informe o email: ");
          email = entrada.nextLine();
          System.out.print("Informe o aniversario: ");
          aniversario = entrada.nextLine();
          agenda.armazenaPessoa(nome, idade, telefone, email, aniversario);
          break;
           
        case 2:
          System.out.print("\nInforme o nome a ser removido: ");
          nome = entrada.nextLine();
          agenda.removePessoa(nome);
          break;  
         
        case 3:
          System.out.print("\nInforme o nome a ser pesquisado: ");
          nome = entrada.nextLine();
          int indice = agenda.buscaPessoa(nome);
          if(indice < 0){
            System.out.println("\nA pessoa não foi encontrada");
          }
          else{
            System.out.println("\nA pessoa foi encontrada no índice: "
              + indice);
          }
           
          break;  
         
        case 4:
          agenda.imprimeAgenda();
          break;
         
        case 5:
          System.out.print("\nInforme o índice desejado: ");
          int index = Integer.parseInt(entrada.nextLine());
          agenda.imprimePessoa(index);
          break;  
           
        case 6:
          System.exit(0);
           
        default:
          System.out.println("\nOpção inválida\n");
          break;
      }
    }
  }
}