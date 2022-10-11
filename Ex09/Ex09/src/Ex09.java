import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celcius = 5 * ((fahrenheit-32)/9);
        System.out.println(fahrenheit + " graus Fahrenheit, equivalem à " + celcius + " graus Celcius.");
        }
}
