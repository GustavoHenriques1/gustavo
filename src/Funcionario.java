/**
 * Created by guguh on 08/03/2017.
 */
public class Funcionario {

    double acima1000  = 0;
    double abaixo1000 = 0;
    double maiorSalario = 0;
    double menorSalario = 0;
    double mediaSalarios = 0;

     void calculoSalario(double salario){

         if(maiorSalario==0 && menorSalario==0){
             maiorSalario = salario;
             menorSalario = salario;
         }

        if(maiorSalario > menorSalario){
            maiorSalario= salario;
        }else{
            menorSalario = salario;
        }

        if(salario > 1000){
            acima1000++;
        }else{
            abaixo1000++;
        }

        mediaSalarios += salario;

    }
}
