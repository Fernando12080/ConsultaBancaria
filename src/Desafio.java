import java.util.Scanner;

public class Desafio {
    public static void main(String[]args) {

        //Declarando os tipos de variáveis,string para textos, double para saldo bancario e int para a opção.//
        String nome = "Miles Morales";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        //Imprimindo * na tela.//
        System.out.println("************************");
        //Concatenando texto com variável String que é o nome do cliente (o \n é para pular linha)//
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n************************");

       //Variável do tipo String nomeada como menu, que recebeu os dados.
        String menu = """
                **Dígite sua opção**
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair         
                """;
 //Criando o Scanner para que o usuario possa escolher as opções de menu (O System.in configura que vai ler dados do teclado//
        Scanner leitura = new Scanner(System.in);


       //Enquanto opção escolhida for diferente de 4, exiba o menu e leia a opção.
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

       //Se a opção for igual a 1, imprima na tela o saldo atualizado é = valor de saldo.
             if(opcao == 1){
                 System.out.println("O saldo atualizado é: " + saldo);
             }  else if(opcao == 2){
                 System.out.println("Qual o valor que deseja transferir?");

           //Variavel double nomeada como valor que irá receber os dados que o usuario escrever no teclado.
                 double valor = leitura.nextDouble();

                //Se o valor transferido for maior que o saldo, imprima a seguinte frase.
                 if(valor > saldo){
                    System.out.println("Não há saldo para realizar a transferência");
                } else {

                   //Else = Se o valor não for maior que saldo, então saldo recebe valor dele mesmo - valor da transferencia.
                    saldo = saldo - valor;

                   //Depois da transferência imprima o texto novo saldo + o valor atual de saldo.
                    System.out.println("Novo saldo" + saldo);
                  }
            }  else if (opcao == 3){
                   //Se opção igual a 3, imprima valor recebido.
                    System.out.println("Valor recebido: ");
                   //Variável do tipo double nomeada como valor recebe leitura.nextDouble para ser lida as informações do teclado.
                    double valor = leitura.nextDouble();
                    saldo = saldo + valor;
                    System.out.println("Novo saldo" + saldo);

                }
                if (opcao > 4){
                    System.out.println("opção inválida");
                }


        }
    }
}




