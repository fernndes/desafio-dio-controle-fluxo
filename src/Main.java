import controle.Controle;
import controle.ParametrosInvalidosException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int first = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int second = terminal.nextInt();

            int counter = Controle.subtractAndCount(first, second);
            System.out.println("Imprimindo o número " + counter);
            terminal.close();
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
        }
    }
}