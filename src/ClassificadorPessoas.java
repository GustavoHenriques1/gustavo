/**
 * Created by guguh on 08/03/2017.
 */
public class ClassificadorPessoas {
    //somaIdades criei para me ajudar melhor
    double somaIdades = 0;
    double qtdMediaIdades = 0;
    double qtdBaixinhosGordos = 0;
    double porcentagemJovensAltos = 0;



    public void calcular(int idade, double peso, double altura){
        //aqui eu somo todas as idades inseridas a cada repetição
        somaIdades = somaIdades + idade;
        //aqui eu faço a media, coloquei 10 pq é a quantidade de vezes que o laço repete, se quiser diminuir pra testar
        // coloca 2 por exemplo, e lá no programa principal vc coloca 2 também, eu mostro onde mudar, relaxa
        qtdMediaIdades = somaIdades/10;
        //se isso for vdd, eu incremento a quantidade de gordos baixos
        if(peso > 90 & altura < 1.5){
            qtdBaixinhosGordos++;
        }
        //se isso for vdd eu incremento a qtd de jovens altos
        if(idade >= 10 & idade <= 30 & altura > 1.9){
            porcentagemJovensAltos++;

        }
    }
}
