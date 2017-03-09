import java.util.Scanner;

/**
 * Created by guguh on 08/03/2017.
 */
public class ProgramaPrincipalNumerosParesImpares {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        NumerosParesEImpares numerosParesEImpares = new NumerosParesEImpares();
        int x;
        do{
            System.out.println("=========================");
            System.out.println("VAMOS CONTAR NUMEROS PARES E IMPARES :)");
            System.out.println("=========================");
            System.out.println("Vamos lá, digite um número: ");
            int numero = leitor.nextInt();

            numerosParesEImpares.classificarNumero(numero);
            System.out.println("Quer inserir mais números amigo? (1-SIM EU QUERO :D/ 2-NÃO VALEU)");
            x = leitor.nextInt();
        }while(x==1);

        System.out.println("Quantidade de numeros pares que você digitou: " + numerosParesEImpares.qtdNumerosPares);
        System.out.println("Quantidade de numeros Impares que você digitou: " + numerosParesEImpares.qtdNumerosImpares);
    }
}
