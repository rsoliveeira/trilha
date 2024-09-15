public class Main {
    public static void main(String[] args) {
        Universidade princeton = new Universidade("Princeton (Nova Jersey - Estados Unidos da América)");
        Universidade cambridge = new Universidade("Cambridge (Inglaterra)");

        Pessoa einstein = new Pessoa("Albert Einstein", "14/03/1879");
        Pessoa newton = new Pessoa("Isaac Newton", "04/01/1643");

        einstein.associarUniversidade(princeton);
        newton.associarUniversidade(cambridge);

        System.out.println(einstein.getInformacoes());
        System.out.println(newton.getInformacoes());
    }
}