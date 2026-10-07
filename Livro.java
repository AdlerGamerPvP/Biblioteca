import static java.lang.IO.println;

public class Livro extends Prateleira{


    public Livro(String nome, String genero, String autor, String data, int id){
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        this.data = data;
        this.id = id;
    }

    @Override
    public String toString() {
        return ("\nNome: " + nome +
                "\nGenero: " + genero +
                "\nAutor: " + autor +
                "\nData de lançamento: " + data +
                "\nID: " + id + "\n");
    }
}
