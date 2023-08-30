import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double firstNumber = sc.nextDouble();
        sc.nextLine();
        System.out.println("Insira um operador, como +, -, *, / ou %:");
        String operator = sc.nextLine();
        System.out.println("Insira o segundo número:");
        double secondNumber = sc.nextDouble();

        double result = switch (operator) {
            case "+", default -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            case "%" -> firstNumber % secondNumber;
        };

        System.out.println("Resultado: " + result);
    }
}
