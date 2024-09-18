import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        try
            (Scanner lerTeclado = new Scanner(System.in)) {
            System.out.println("Cateto A: ");
            double catetoA = lerTeclado.nextDouble();
            lerTeclado.nextLine();
            System.out.println("Cateto B: ");
            double catetoB = lerTeclado.nextDouble();
            lerTeclado.nextLine();
            catetoA = catetoA * catetoA;
            catetoB = Math.pow(catetoB, 2);
            double hipotenusa = Math.sqrt(catetoA + catetoB);
            System.out.println("Hipotenusa: " + hipotenusa);
        }
    }
}
