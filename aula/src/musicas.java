public class musicas {
    String nome;
    int ano;
    String tipo;
    compositores autor;

    public musicas(String nome, int ano, String tipo, compositores autor) {
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.autor = autor;
    }

    public String toString() {
        return "Nome " + nome + "\nano " + ano + "\ntipo " + tipo;
    }
    
}
