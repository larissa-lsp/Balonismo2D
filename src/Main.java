public class Main {
    public static void main(String[] args) {
        // Criação do objeto Pessoa
        Pessoa  p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Regina";
        p1.rg = "1234567890";
        p1.cpf = "12345678910";
        p1.telefone = 940028922;
        p1.telefoneContatoFamiliar = 922982004;
        p1.endereco = "Rua Duarte, 19";

        p2.nome = "Leandro";
        p2.rg = "0987654321";
        p2.cpf = "01987654321";
        p2.telefone = 966698909;
        p2.telefoneContatoFamiliar = 909896669;
        p2.endereco = "Rua Duarte, 19";

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

        passeio.adicionarPassageiro(p1);
        passeio.adicionarPassageiro(p2);

        // Iniciando o passeio de balão
        passeio.iniciarPasseio();
    }
}
