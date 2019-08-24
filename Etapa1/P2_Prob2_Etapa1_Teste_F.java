


import P2_Prob2_Etapa1_F.Cliente;
import P2_Prob2_Etapa1_F.ClientePessoaFisica;
import P2_Prob2_Etapa1_F.ClientePessoaJuridica;
import P2_Prob2_Etapa1_F.ContaCorrente;
import P2_Prob2_Etapa1_F.Operacao;
import P2_Prob2_Etapa1_F.OperacaoTranferencia;
import P2_Prob2_Etapa1_F.TipoOperacao;
import org.junit.Test;
import static org.junit.Assert.*;

public class P2_Prob2_Etapa1_Teste_F {
    
    private ContaCorrente contaCorrente1;
    private ContaCorrente contaCorrente2;

    //@Before
    public void setUp() {
        ClientePessoaFisica cPF = new ClientePessoaFisica("Teste Testando da Silva Sauro", "334", "777", "999");
        contaCorrente1 = new ContaCorrente(100, 7, cPF);
        //contaCorrente1 = new ContaCorrente(clientePessoaFisica, 3331, 22578, true, true, true, true, true, false, true, true);
        contaCorrente1.depositar(500);
        
        ClientePessoaFisica cPJ = new ClientePessoaFisica("João", "123456789", "987654321", "123.123.123");
        contaCorrente2 = new ContaCorrente(100, 7, cPJ);
        //contaCorrente1 = new ContaCorrente(clientePessoaFisica, 3331, 22578, true, true, true, true, true, false, true, true);
        contaCorrente1.depositar(500); 
    }

    @Test
    public void saque() {
        contaCorrente1.sacar(50);
        contaCorrente2.sacar(75);
    }

    @Test
    public void deposito() {
        contaCorrente1.depositar(450);
        contaCorrente2.depositar(850);
    }

    @Test
    public void transferencia() {
        contaCorrente1.transferir(500, contaCorrente2);
        contaCorrente2.transferir(500, contaCorrente1);
    }    
}
