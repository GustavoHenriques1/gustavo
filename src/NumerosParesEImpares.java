/**
 * Created by guguh on 08/03/2017.
 */
public class NumerosParesEImpares {
    int qtdNumerosPares;
    int qtdNumerosImpares;

    void classificarNumero(int numero){
        //verifico se é par, se for, incremento, senão, incremento os impares.
        if(numero % 2 == 0){
            qtdNumerosPares++;
        }else{
            qtdNumerosImpares++;
        }
    }
}
