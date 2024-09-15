
public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Aluno(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public boolean isMenorDeIdade() {
        return idade < 18;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome +
               ", Idade: " + idade +
               ", Peso: " + peso +
               ", Altura: " + altura +
               ", IMC: " + String.format("%.2f", calcularIMC()) +
               ", Menor de idade: " + (isMenorDeIdade() ? "Sim" : "Não");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Silva", 16, 60.0, 1.75);
        Aluno aluno2 = new Aluno("Maria Souza", 20, 65.0, 1.65);

        System.out.println(aluno1);
        System.out.println(aluno2);
    }
}


