import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> cursosInscritos = new HashSet<>();
    private Set<Curso> cursosConcluidos = new HashSet<>();
    private double totalXP;

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        cursosInscritos.addAll(bootcamp.getCursos());
    }

    public void concluirCurso(Curso curso) {
        if (cursosInscritos.contains(curso)) {
            cursosConcluidos.add(curso);
            cursosInscritos.remove(curso);
            totalXP += curso.calcularXP();
        } else {
            System.out.println("Curso não está inscrito.");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public Set<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public Set<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public double getTotalXP() {
        return totalXP;
    }
}
