public class Main {
    public static void main(String[] args) {
        // Criando objetos do passeio
        Pessoa p1;
        Pessoa p2;
        Piloto piloto;
        Balao balao;

        // Criação do objeto Pessoa
        p1 = new Pessoa();
        p2 = new Pessoa();

        // Atributos p1
        p1.nome = "Regina";
        p1.rg = "1234567890";
        p1.cpf = "12345678910";
        p1.telefone = 940028922;
        p1.telefoneContatoFamiliar = 922982004;
        p1.termoCienciaRisco = true;
        // Endereço p1
        p1.rua = "Rua Duarte";
        p1.numero = "19";
        p1.bairro = "Madalena";
        p1.cidade = "Piparopa";
        p1.estado = "São Paulo";

        // Atributos p2
        p2.nome = "Leandro";
        p2.rg = "0987654321";
        p2.cpf = "01987654321";
        p2.telefone = 966698909;
        p2.telefoneContatoFamiliar = 909896669;
        p2.termoCienciaRisco = true;
        // Endereço p2
        p2.rua = "Rua Chico Boi";
        p2.numero = "22";
        p2.bairro = "Vila Cruz";
        p2.cidade = "Barueri";
        p2.estado = "São Paulo";



        // Criação do objeto Piloto
        piloto = new Piloto();

        piloto.nome = "André Josefino";
        piloto.cpf ="2371113151";
        piloto.numRegistroANAC = "98765";

        // Criação do objeto Balão
        balao = new Balao();

        balao.numeroIdentificacao = "B002";
        balao.registroRegularidade = true;


        // Criação do objeto PasseioDeBalão
        PasseioDeBalao passeio = new PasseioDeBalao();
        passeio.piloto = piloto;
        passeio.balao = balao;

        passeio.adicionarPassageiro(p1);
        passeio.adicionarPassageiro(p2);

        // Iniciando o passeio de balão
        passeio.iniciarPasseio();
    }
}
