public class Main {
    public static void main(String[] args) {
        // construindo balões
        Balão b1 = new Balão();

        Balão b2 = new Balão(10, "amarelo", "grande", 1.43, 23.65, "grande", 4 );
        Balão b3 = new Balão(12, "verde", "pequeno", 1.21, 78.92, "medio", 12);

        // construindo pessoa
        Pessoa p1 = new Pessoa("Leonardo", "7438328", 795345, 55119433, 551193432, "rua. arco-iris");
        Pessoa p2 = new Pessoa("Ana", "7653456", 439023, 55110349, 551190549, "rua. gramado");

        // construindo piloto
        Piloto pi1 = new Piloto("Diego", "743829", 842394);

    }
}