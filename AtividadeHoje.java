import java.util.Scanner;

public class AtividadeHoje {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome?");
        String nome = lerTeclado.nextLine();
        
        System.out.println("Qual seu gênero? (M)Masculino, (F)Feminino, (N)Não desejo informar");
        char genero = lerTeclado.nextLine().charAt(0);
        
        System.out.println("Qual o seu peso? (kg)");
        double peso = lerTeclado.nextDouble();
        lerTeclado.nextLine(); 
        
        System.out.println("Qual a sua altura? (m)");
        double altura = lerTeclado.nextDouble();
        lerTeclado.nextLine(); 
        
        double imc = peso / Math.pow(altura, 2);
        
        System.out.printf("Seu IMC é: %.2f\n", imc);
        
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso.");
        } else {
            System.out.println("Classificação: Obesidade.");
        }
    }
}
