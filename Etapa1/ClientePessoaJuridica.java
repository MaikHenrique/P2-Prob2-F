package notobserver;

public class ClientePessoaJuridica extends Cliente {

    private String cnpj;
    private String servidorJMS;

    public ClientePessoaJuridica(String nome, String telFixo, String telCelular, String cnpj, String servidorJMS) {
        super(nome, telFixo, telCelular);
        this.cnpj = cnpj;
        this.servidorJMS = servidorJMS;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getServidorJMS() {
        return servidorJMS;
    }

    public void setServidorJMS(String servidorJMS) {
        this.servidorJMS = servidorJMS;
    }

}
