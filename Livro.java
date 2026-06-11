public import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private Autor autor;
    private List<Capitulo> capitulos = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void adicionarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }
} 
