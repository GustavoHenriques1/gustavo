import java.util.Scanner;

/**
 * Created by guguh on 08/03/2017.
 */
public class ProgramaPrincipalFuncionario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        //esse x foi declarado fora do escopo do do-while e será usado para verificar se a estrutura dentro do "do"
        //irá se repetir, se x for igual a 1, repete, diferente disso ele para de repetir.
        int x;
        //variavel declarada fora do escopo do do-while também.
        //ela serve pra ver quantas vezes foi repetido, assim vc sabe a quatidade de salários inseridos
        //e será usado para fazer a media dos salários com mais facilidade
        int quantidadeDeSalariosInseridos=0;
        do {
            //incrementando a cada repetição, isso é a mesma coisa que quantidadeDeSalariosInseridos = quantidadeDeSalariosInseridos + 1;
            quantidadeDeSalariosInseridos++;
            System.out.println("============================================");
            System.out.println("JOGO DO SALARIO INICIADO :D");
            System.out.println("============================================");
            System.out.println("Digite o salário do funcionario: ");
            double salario = leitor.nextDouble();
            //cada vez que esse método é chamado ele seta as propriedades da classe funcionario
            //entra na classe funcionario... tudo o que está no método calculoSalario será repetido a cada chamada desse método
            //que é o que eu estou fazendo na linha abaixo
            funcionario.calculoSalario(salario);

            System.out.println("Deseja inserir mais um salário? (1-SIM / 2-NÃO)");
            //vai ver se o x é 1, se for 1, repete, senão, o laço acaba.
            x = leitor.nextInt();
        } while (x == 1);

        System.out.println("O Maior salário é: " + funcionario.maiorSalario);
        System.out.println("O Menor salário é: " + funcionario.menorSalario);
        //ta vendo o quantidadeDeSalariosInseridos? media de salario é a soma dos salários dividido pela quantidade de salarios inseridos :D
        System.out.println("O Media de todos os salários é: " + funcionario.mediaSalarios/quantidadeDeSalariosInseridos);
        //porque dividido por 100? pois ele quer a porcentagem
        System.out.println("A porcentagem de salários acima de 1000 é: " + funcionario.acima1000/100);
        //mesma coisa aqui
        System.out.println("A porcentagem de salários abaixo de 1000 é: " + funcionario.abaixo1000/100);
    }

}
