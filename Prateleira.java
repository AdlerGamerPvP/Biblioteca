import java.util.ArrayList;


abstract class Prateleira {
    protected String nome;
    protected String genero;
    protected String autor;
    protected String data;
    protected Integer id;
    protected ArrayList<Livro> storage;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }

    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return data;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id - 1;
    }

}
