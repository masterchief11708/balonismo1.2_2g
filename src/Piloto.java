public class Piloto {


    //Atributos
    String nome;
    String CPF;
    int num_ANAC;

    public Piloto(String nome, String CPF, int num_ANAC) {
        this.nome = nome;
        this.CPF = CPF;
        this.num_ANAC = num_ANAC;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getNum_ANAC() {
        return num_ANAC;
    }

    public void setNum_ANAC(int num_ANAC) {
        this.num_ANAC = num_ANAC;
    }

    //Métodos
    public void pilotar() {System.out.println("Voar");}
}
