import static java.lang.IO.*;


void main() {
    Livro livro1 = new Livro("Crime e consequencia","Romance","Fiódor Dostoiévski", "1866", 1);
    Livro livro2 = new Livro("Don Quixote de La Mancha","Romance","Miguel de Cervantes", "16011605", 2);
    Livro livro3 = new Livro("Moby Dick","Romance","Herman Melville", "1851", 3);

    ArrayList<Livro> storage = new ArrayList<>();

    storage.add(livro1);
    storage.add(livro2);
    storage.add(livro3);

    println(storage);
    Utilidades.acharLivro(storage);










}
