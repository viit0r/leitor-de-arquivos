import java.io.*;
import java.util.ArrayList;

public class Leitor {
    private String path;

    public Leitor(String path) {
        this.path = path;
    }

    public ArrayList<String> lerArquivo(){
        ArrayList<String> nomes = new ArrayList<>();
        try {
            FileReader reader = new FileReader(path);
            BufferedReader arquivo = new BufferedReader(reader);
            String aux = arquivo.readLine();

            for (int i = 0; aux != null; i++){
                nomes.add(aux);
                aux = arquivo.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.print("Erro na abertura do arquivo: " + e.getMessage());
        }
        return nomes;
    }
    public void geraNovoArquivo(ArrayList<String> data){
        try {
            FileWriter writer = new FileWriter("lista/nova-lista.txt");
            PrintWriter novoArquivo = new PrintWriter(writer);

            novoArquivo.println("Nomes que foram lidos: \n");
            for (int i = 0; i < data.size() ; i++){
                novoArquivo.println(data.get(i));
            }
            data.clear();
            writer.close();
        } catch (IOException e){
            System.err.println("Erro na criação do arquivo: " + e.getMessage());
        }
    }
}
