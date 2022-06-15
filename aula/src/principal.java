public class principal {
    public static void main(String[] args) {
        musicas m1, m2;
        compositores c1, c2;

        c1 = new compositores("Ze Ricardo e Thiago", "Brasileiro");
        c2 = new compositores("Jorge e Matheus", "Brasileiro");


        m1 = new musicas("Medo Bobo", 2012, "Sertanejo", c2);
        m2 = new musicas("Sinal Disfarcado", 2010, "Sertanejo", c1);

        System.out.println("Musica1\n" + m1 + "\nCompositores\n"  + c2);
        System.out.println("\nMusica2\n" + m2 + "\nCompositores\n"  + c1);
    }
    
}
