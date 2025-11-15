import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private List<Double> notas = new ArrayList<>();
    private String nome;

    public Aluno(String nome) {
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("O nome não pode ser vazio!!");
        nome = nome.trim();
        if (!nome.matches("^\\p{Lu}\\p{Ll}*\\s(\\p{Lu}\\p{Ll}*)(\\s\\p{Lu}\\p{Ll}*)?$"))
            throw new IllegalArgumentException("O nome precisa começar com letra maiuscula seguido do sobrenome!!!");

        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public double media() {
        double media = notas.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        return media;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Aluno: ")
                .append(getNome())
                .append(" - ")
                .append("Média: ")
                .append(String.format("%.2f", media()))
                .append(System.lineSeparator());

        return stringBuilder.toString();
    }
    public  void addNota(Double notas){
       this.notas.add(notas);
    }
}
