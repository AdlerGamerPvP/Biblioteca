import static java.lang.IO.*;


void main() {
    Livro pignas = new Livro("Crime e consequencia","Romance"," Fiódor Dostoiévski", "1866", 1);
    ArrayList<Livro> storage = new ArrayList<>();

    storage.add(pignas);
    println(storage);
    Utilidades.acharLivro(storage);










}
