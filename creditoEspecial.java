import java.util.Scanner;
public class creditoEspecial {
    public static void main(String[] args) {
        Scanner credito = new Scanner(System.in);

        System.out.print("Digite o seu salário médio: ");
        int salMedio = credito.nextInt();

        if (salMedio <= 200) {
            System.out.print("Você não possui nenhum crédito");

        } else if (salMedio >=201 && salMedio <=400) {
            System.out.println("O seu salário médio é de: " + ((salMedio * 0.20) + salMedio));
            System.out.print("O valor do crédito é de: " + salMedio * 0.20);

        } else if (salMedio >400) {
            System.out.println("O seu salário médio é de: " + ((salMedio * 0.40) + salMedio));
            System.out.print("O valor do crédito é de: " + salMedio * 0.40);

            credito.close();

        }

    }
}