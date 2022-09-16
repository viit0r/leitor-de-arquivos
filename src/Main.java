public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor("lista/lista-de-nomes.txt");
        leitor.geraNovoArquivo(leitor.lerArquivo());
    }
}
