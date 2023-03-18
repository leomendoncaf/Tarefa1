import java.util.Scanner;

public class Tarefa2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        String num1Str = input.nextLine();

        System.out.print("Digite o segundo número: ");
        String num2Str = input.nextLine();

        System.out.print("Digite a operação (+, -, *, / ou ^): ");
        String op = input.nextLine();

        // Validando os tipos de variáveis
        double num1, num2;
        try {
            num1 = Double.parseDouble(num1Str);
            num2 = Double.parseDouble(num2Str);
        } catch (NumberFormatException e) {
            System.out.println("Erro: valores inválidos.");
            return;
        }

        // Realizando as operações
        double result;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero.");
                    return;
                }
                result = num1 / num2;
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Erro: operação inválida.");
                return;
        }
        System.out.println("O resultado é: " + result);
    }
}
