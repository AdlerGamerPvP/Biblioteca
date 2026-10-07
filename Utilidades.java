import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.lang.IO.*;

//LEIA O CODIGO INTEIRO, COMENTARIOS INCLUIDO

public class Utilidades {

    public static void acharLivro(ArrayList<Livro> storage){
        String pesquisa = null;
        Integer psq = 0;
        boolean verify = false;
        psq = Integer.parseInt(readln("Escolha qual metodo de pesquisa: "));   //Voce teria que utilizar um comparator para pesquisar e mostrar em ordem alfabetica
        switch (psq){
            case 1:
                pesquisa = readln("Escreva o nome do livro: ");
                verify = false;
                for (int x = 0; x != storage.size(); x++) {//Voce teria que utilizar um comparator
                    if (storage.get(x).getNome().contains(pesquisa)) {//customizado para mostrar alfabeticamente
                        println(storage.get(x));//já que é uma arraylist customizada
                        x = storage.size() - 1;
                        verify = true;
                    }
                }
                if(!verify){
                    println("Nenhum livro encontrado.");
                }
                break;
            case 2:
                pesquisa = readln("Escreva a data do livro, você pode pesquisar em ano ou dia, mês, ano: ");// Essas duas opções por causa de poder ler os ultimos digito de uma string
                verify = false;
                if (pesquisa.length() == 4 || pesquisa.length() == 8 ) {//Este tambem precisaria de um comparator customizado
                    for (int x = 0; x != storage.size(); x++) {
                        if (storage.get(x).getData().contains(pesquisa)) {//Mas é muito mais simples que os outros pois são só numeros
                            println(storage.get(x));//https://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property
                            x = storage.size() - 1;
                            verify = true;
                        }
                    }
                    if (!verify) {
                        println("Nenhum livro encontrado.");
                    }
                }
                break;
            case 3:
                pesquisa = readln("Escreva o nome do autor: ");//Este tambem precisaria de um comparator customizado
                    for (int x = 0; x != storage.size(); x++) {
                        if (storage.get(x).getAutor().contains(pesquisa)) {//Mas é muito mais simples que os outros pois são só numeros
                            println(storage.get(x));//https://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property
                            x = storage.size() - 1;
                            verify = true;
                        }
                    }
                    if (!verify) {
                        println("Nenhum livro encontrado.");
                    }
                break;
            case 4:
                println(storage); // tem que ter um comparador se quiser mostrar por ordem alfabetica, já que isso mostra por data de entrada
                break;
        }

    }
    public static void editarLivro(ArrayList<Livro> storage){
        int esc = Integer.parseInt(readln("Digite o id do livro"));
        int x = storage.indexOf(esc);
        String novo = null;
        int modesc = Integer.parseInt(readln("Qual atributo do livro deseja modificar? 1- Nome\n 2- Genero\n 3- Autor\n 4- Data\n"));
        switch (modesc){
            case 1:
                novo = readln("Digite o novo nome do livro");
                storage.get(x).setNome(novo);
                break;
            case 2:
                novo = readln("Digite o novo genero do livro");
                storage.get(x).setGenero(novo);
                break;
            case 3:
                novo = readln("Digite o novo autor do livro");
                storage.get(x).setAutor(novo);
                break;
            case 4:
                novo = readln("Digite a nova data do livro");
                storage.get(x).setData(novo);
                break;
        }
    }
    public static void removerLivro(ArrayList<Livro> storage){
        int esc = Integer.parseInt(readln("Digite o id do livro"));//Coloca algo sobre confirmação, eu esqueci o nome quem liga fodase
        int x = storage.indexOf(esc - 1);
        storage.remove(x);
    }
}
