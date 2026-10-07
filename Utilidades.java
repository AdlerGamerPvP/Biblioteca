import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.lang.IO.*;

//LEIA O CODIGO INTEIRO, COMENTARIOS INCLUIDO

public class Utilidades {

    public static void acharLivro(ArrayList<Livro> storage){
        String pesquisa = null;
        Integer psq = 0;
        psq = Integer.parseInt(readln("Escolha qual metodo de pesquisa"));   //Voce teria que utilizar um comparator
        switch (psq){
            case 1:
                pesquisa = readln("Escreva o nome do livro");   //Voce teria que utilizar um comparator
                if(storage.get(0).getNome().contains(pesquisa)){//customizado para mostrar alfabeticamente
                    println(storage.get(0).getNome().contains(pesquisa));//já que é uma arraylist customizada
                }
                else{
                    println("Não foi encontrado um livro com este nome, tente novamente.");
                }
                break;
            case 2:
                pesquisa = readln("Escreva a data do livro, você pode pesquisar em ano ou dia, mês, ano: ");// Essas duas opções por causa de poder ler os ultimos digito de uma string
                if (pesquisa.length() == 4 || pesquisa.length() == 8 ) {//Este tambem precisaria de um comparator customizado
                    if (storage.get(1).getData().contains(pesquisa)) {//Mas é muito mais simples que os outros pois são só numeros
                        println(storage.get(1).getData().contains(pesquisa));//https://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property
                    } else { //Na verdade, crie uma nova arraylist, atualize ela com o comparator e utilize ela para printar
                        //CORREÇÃO: pode utilizar algo como storage.indexOf(esc); que eu usei lá em baixo no editarLivro
                        println("Não foi encontrado um livro com esta data de lançamento, tente novamente.");
                    }//Essa porra funcionou de algum jeito, só tem que arrumar a escolha de livros pois ele só procura o primeiro index e eu não sei arrumar essa bosta, deve ser um for loop nessa porra
                }
                else{
                    println("Data invalida, tente novamente");
                }
                break;
            case 3:
                pesquisa = readln("Escreva o nome do autor");//Mesma coisa do case 1 em cima
                if(storage.get(1).getNome().contains(pesquisa)){
                    println(storage.get(1).getNome().contains(pesquisa));
                }
                else{
                    println("Não foi encontrado um livro com este nome, tente novamente.");
                }
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
    public static void exibirLivro(String nome, String genero, String autor, String data){ //Isso aqui dá pra fazer no toString se realmente quiser, aqui tá feio
        println("Nome: " + nome +
              "\nGenero: " + genero +
              "\nAutor: " + autor +
              "\nData de lançamento: " + data);
    }
}
