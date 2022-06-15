public class compositores {
    String nome;
    String nacionalidade;

    public compositores(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        return "Nome " + nome + "\nNacionalidade " + nacionalidade;
    }
}
