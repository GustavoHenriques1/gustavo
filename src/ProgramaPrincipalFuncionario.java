import java.util.Scanner;

/**
 * Created by guguh on 08/03/2017.
 */
public class ProgramaPrincipalFuncionario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        int x;
        int quantidadeDeSalariosInseridos=0;
        do {
            quantidadeDeSalariosInseridos++;
            System.out.println("============================================");
            System.out.println("JOGO DO SALARIO INICIADO :D");
            System.out.println("============================================");
            System.out.println("Digite o salário do funcionario: ");
            double salario = leitor.nextDouble();

            funcionario.calculoSalario(salario);

            System.out.println("Deseja inserir mais um salário? (1-SIM / 2-NÃO)");
            x = leitor.nextInt();
        } while (x == 1);

        System.out.println("O Maior salário é: " + funcionario.maiorSalario);
        System.out.println("O Menor salário é: " + funcionario.menorSalario);
        System.out.println("O Media de todos os salários é: " + funcionario.mediaSalarios/quantidadeDeSalariosInseridos);
        System.out.println("A porcentagem de salários acima de 1000 é: " + funcionario.acima1000/100);
        System.out.println("A porcentagem de salários abaixo de 1000 é: " + funcionario.abaixo1000/100);
    }

}
