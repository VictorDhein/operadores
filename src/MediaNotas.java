import java.util.Scanner;
/*
@autor victor dhein
 */

public class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarando as variáveis para as notas
        double nota1, nota2, nota3, nota4;

        // Leitura das 4 notas
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Impressão do resultado final
        System.out.println("A média final é: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
