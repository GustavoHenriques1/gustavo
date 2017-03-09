/**
 * Created by guguh on 08/03/2017.
 */
public class Funcionario {
    //inicializando todas as propriedades
    double acima1000  = 0;
    double abaixo1000 = 0;
    double maiorSalario = 0;
    double menorSalario = 0;
    double mediaSalarios = 0;

     void calculoSalario(double salario){
         //Vamos para a lógica: na primeira repetição da estrutura, lá no programa principal
         //ele verá nesse if que as propriedades maior e menor salarios SÃO nulas, então ele entra no if
         if(maiorSalario==0 && menorSalario==0){
             //nesse primeiro momento, maior salario é o primeiro que vc inseriu concorda?
             //e ao mesmo tempo o menor salário, logo ambas propriedades recebem o mesmo salario recebido
             maiorSalario = salario;
             menorSalario = salario;
         }
         //beleza, na proxima repetição do laço, ele verá que maior e menos não estão nulas, então não entra no if
         //aqui ele ve se o maior salario é maior que o menor, se for, maior salario recebe o salario que vc inseriu
         //senão, o contrário ocorre
        if(maiorSalario > menorSalario){
            maiorSalario= salario;
        }else{
            menorSalario = salario;
        }
        //aqui eu vejo se o salario digitado é maior que 1000, se n for, a prop abaixo1000 recebe esse salario
        if(salario > 1000){
            acima1000++;
        }else{
            abaixo1000++;
        }
        //isso é a mesma coisa que mediaSalarios = mediaSalarios + salario
        //Aqui eu estou apenas somando os salarios a cada vez que vc insere um, vai somando ate vc sair do laço
         // e lá no programa principal que eu faço a media, tendeu?
        mediaSalarios += salario;

    }
}
