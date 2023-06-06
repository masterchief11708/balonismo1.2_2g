public class Balão {

    // atributos

    int id;
    String registro;
    String cor;
    String tipo;
    double altura;
    double peso;
    String porte;
    int capacidade;


    // métodos

    public String voar(Combustivel gasPropano){
        return "voando com" + gasPropano;

    }
}
