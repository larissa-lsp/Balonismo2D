public class Main {
    public static void main(String[] args) {
        // Criação do objeto Pessoa
        Pessoa  pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Regina";
        pessoa1.rg = "1234567890";
        pessoa1.cpf = "12345678910";
        pessoa1.telefone = "940028922";
        pessoa1.telefoneContatoFamiliar = "922982004";
        pessoa1.endereco = "Rua Duarte, 19";

        pessoa2.nome = "Leandro";
        pessoa2.rg = "0987654321";
        pessoa2.cpf = "01987654321";
        pessoa2.telefone = "966698909";
        pessoa2.telefoneContatoFamiliar = "909896669";
        pessoa2.endereco = "Rua Duarte, 19";

        // Criação do objeto Piloto
        Piloto piloto = new Piloto();

        piloto.nome = "André";
        piloto.cpf ="2371113151";
        piloto.numRegistroANAC = "98765";

        // Criação do objeto Balão
        Balao balao = new Balao();

        balao.numeroIdentificacao = "B002";
        balao.registroRegularidade= "ABC123";

        // Criação do objeto TermoCienciaRiscos
        TermoCiencia termoCiencia = new TermoCiencia();

        // Criação do obejto PasseioDeBalão
        PasseioDeBalao passeio = new PasseioDeBalao();
        passeio.piloto = piloto;
        passeio.balao = balao;
        passeio.TermoCiencia = termoCiencia;

        passeio.adicionarPassageiro(pessoa1);
        passeio.adicionarPassageiro(pessoa2);

        // Iniciando o passeio de balão
        passeio.iniciarPasseio();
    }
}
