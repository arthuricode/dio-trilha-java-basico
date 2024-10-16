import java.time.LocalDate;

public class Mentoria extends Curso {
    private LocalDate data;

    public Mentoria(String titulo, String descricao, int cargaHoraria, LocalDate data) {
        super(titulo, descricao, cargaHoraria);
        this.data = data;
    }

    // Método sobrescrito para calcular XP com bônus para mentorias
    @Override
    public double calcularXP() {
        return super.calcularXP() + 20;
    }

    public LocalDate getData() {
        return data;
    }
}
