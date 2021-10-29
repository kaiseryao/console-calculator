import java.util.Scanner;

public class Operators {
    private double num1;
    private double num2;
    private char operator;
    private double result;
    private String output;

    Scanner keyboard = new Scanner(System.in);

    public Operators() {
        this.num1 = 0;
        this.num2 = 0;
    }

    // einlesen EVA Prinzip
    public void readIn() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Bitte gebe deine erste Nummer ein: ");
        num1 = keyboard.nextDouble();

        System.out.print("Bitte gebe ein Operationszeichen (+, -, *, /) ein: ");
        operator = keyboard.next().charAt(0); // Liest ein Zeichen ein

        System.out.print("Bitte gebe deine zweite Nummer ein: ");
        num2 = keyboard.nextDouble();
    }

    // rechnen
    public void calculate() {
        if (operator == '+'){
            result = num1 + num2;
        }
        else if (operator == '-'){
            result = num1 - num2;
        }
        else if (operator == '/'){
            result = num1 / num2;
        }
        else if (operator == '*'){
            result = num1 * num2;
        }
        else{
            System.out.println("Ungültiges Operationszeichen");
        }
    }

    //ausgabe
    public String toString() {
        return output = num1 + " " + operator + " " + num2 + " = " + result;
    }
}
