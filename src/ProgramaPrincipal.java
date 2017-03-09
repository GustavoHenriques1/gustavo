import java.util.Scanner;

/**
 * Created by guguh on 08/03/2017.
 */
public class ProgramaPrincipal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ClassificadorPessoas classificadorPessoas = new ClassificadorPessoas();
        //é aqui que vc tem que por o 2, i < 2, pra fazer testes, mas o exercicio pede 10 :D
        for(int i = 0; i < 10; i++){
            System.out.println("Pessoa " + i);

            System.out.println("Digite a idade dessa pessoa: ");
            int idade = leitor.nextInt();

            System.out.println("Digite o peso dessa pessoa: ");
            double peso = leitor.nextDouble();

            System.out.println("Digite a altura pessoa: ");
            double altura = leitor.nextDouble();
            //A cada chamada desse método, todas as propriedades serão setadas dentro da classe ClassificadorPessoas
            classificadorPessoas.calcular(idade, peso, altura);

            System.out.println("=================================================");
            System.out.println("PROXÍMA REPETIÇÃO");
            System.out.println("=================================================");

        }

        System.out.println("A Quantidade de pessoas baixinhas e gordas é: " + classificadorPessoas.qtdBaixinhosGordos );
        System.out.println("A Média das idades das pessoa é: " + classificadorPessoas.qtdMediaIdades );
        //porque dividido por 100? pq ele quer a porcentagem. eu ja tenho a quantidade de jovens altos, agora só falta dividir por 100 pra saber a porcentagem
        System.out.println("A Porcentagem de pessoas jovens  e altas é: " + classificadorPessoas.porcentagemJovensAltos/100);

    }
}
