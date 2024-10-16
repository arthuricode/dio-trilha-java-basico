import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private List<Curso> cursos = new ArrayList<>();
    private List<Mentoria> mentorias = new ArrayList<>();
    private List<Dev> devsInscritos = new ArrayList<>();
    private LocalDate dataInicio = LocalDate.now();
    private LocalDate dataFim = dataInicio.plusDays(45);

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Métodos para adicionar cursos e mentorias
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void inscreverDev(Dev dev) {
        devsInscritos.add(dev);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public List<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }
}
