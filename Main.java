import static java.lang.IO.*;


void main(String[] args) {
    Livro livro1 = new Livro("Crime e consequencia", "Romance", "Fiódor Dostoiévski", "1866", 1);
    Livro livro2 = new Livro("Don Quixote de La Mancha", "Romance", "Miguel de Cervantes", "16011605", 2);
    Livro livro3 = new Livro("Moby Dick", "Romance", "Herman Melville", "1851", 3);

    ArrayList<Livro> storage = new ArrayList<>();

    storage.add(livro1);
    storage.add(livro2);
    storage.add(livro3);

    int acao = Integer.parseInt(readln("Escolha o que deseja fazer:" +
            "\n1 - Achar Livro" +
            "\n2 - Adicionar Livro" +
            "\n3 - Remover Livro" +
            "\n4 - Editar Livro" +
            "\n5 - Sair\n"));
    while (acao != 5) {
        switch (acao) {
            case 1:
                Utilidades.acharLivro(storage);
                break;
            case 2:
                Utilidades.adicionarLivro(storage);
                break;
            case 3:
                Utilidades.removerLivro(storage);
                break;
            case 4:
                Utilidades.editarLivro(storage);
                break;
        }
        acao = Integer.parseInt(readln("Escolha o que deseja fazer:" +
                "\n1 - Achar Livro" +
                "\n2 - Adicionar Livro" +
                "\n3 - Remover Livro" +
                "\n4 - Editar Livro" +
                "\n5 - Sair\n"));
    }
    println("Volte sempre!");
}
