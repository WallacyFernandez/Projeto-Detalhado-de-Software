public class PessoaPrincipal {
    public static void main(String[] args) {
        Pessoa amiga = new Pessoa();

        amiga.nome = "Fernando";
        amiga.idade = 24;

        System.out.printf("Nome: %s, idade: %d ", amiga.nome, amiga.idade);
    }
}
