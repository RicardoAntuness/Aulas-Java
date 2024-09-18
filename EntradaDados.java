import java.util.Scanner;
public class EntradaDados {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite Seu Nome: ");

        String nome = lerTeclado.nextLine( );
        System.out.println("Digite a sua Idade: ");
        int idade = lerTeclado.nextInt( );
        lerTeclado.nextInt( );
        System.out.println("Nome: " + nome + " - Idade: " + idade);
        lerTeclado.close( );
    }
}