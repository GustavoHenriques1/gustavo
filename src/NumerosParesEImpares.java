/**
 * Created by guguh on 08/03/2017.
 */
public class NumerosParesEImpares {
    int qtdNumerosPares;
    int qtdNumerosImpares;

    void classificarNumero(int numero){
        if(numero % 2 == 0){
            qtdNumerosPares++;
        }else{
            qtdNumerosImpares++;
        }
    }
}
