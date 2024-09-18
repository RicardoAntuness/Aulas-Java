import java.util.Scanner;

public class ExemploIf {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite a nota G1: ");
        double notaG1 = lerTeclado.nextDouble();
        lerTeclado.nextLine(); //Limpar Buffer;
        System.out.println("Digite a nota G2: ");
        double notaG2 = lerTeclado.nextDouble();
        lerTeclado.nextLine(); //Limpar Buffer;
        double media = (notaG1 + notaG2) / 2;
        System.out.printf("Sua média final é: %.2f \n", media);
        // \n é quebra de linha;
        if (media >= 7) 
            System.out.println("Parabéns você está APROVADO! ");
        
        else if (media >= 3)
            System.out.println("Você está em exame! ");
            else
            System.out.println("Infelizmente não foi dessa vez! ");
    }
}
