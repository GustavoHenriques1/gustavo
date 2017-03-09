/**
 * Created by guguh on 08/03/2017.
 */
public class ClassificadorPessoas {

    double somaIdades = 0;
    double qtdMediaIdades = 0;
    double qtdBaixinhosGordos = 0;
    double porcentagemJovensAltos = 0;



    public void calcular(int idade, double peso, double altura){
        somaIdades = somaIdades + idade;

        qtdMediaIdades = somaIdades/10;

        if(peso > 90 & altura < 1.5){
            qtdBaixinhosGordos++;
        }

        if(idade >= 10 & idade <= 30 & altura > 1.9){
            porcentagemJovensAltos++;

        }
    }
}
