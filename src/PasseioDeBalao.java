import java.util.ArrayList; //aprendendo em LIP1, resolvi testar
import java.util.List;
public class PasseioDeBalao {
        Piloto piloto;
        Balao balao;
        TermoCienciaRisco termoCienciaRisco;
        List<Pessoa> passageiros;

    public void iniciarPasseio() {
        System.out.println("O passeio de balão está iniciando...");
        System.out.println("Piloto: " + piloto.nome);
        System.out.println("Balão: " + balao.numeroIdentificacao);
        System.out.println("Passageiros:");
    }

    public void adicionarPassageiro(Pessoa p1) {
        System.out.println("A bordo");
    }
}
