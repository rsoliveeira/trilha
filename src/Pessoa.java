public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Universidade universidade;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void associarUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public String getInformacoes() {
        if (universidade != null) {
            return nome + ", nascido em " + dataNascimento + ", trabalha na universidade " + universidade.getNome() + ".";
        } else {
            return nome + ", nascido em " + dataNascimento + ", não está associado a nenhuma universidade.";
        }
    }
}