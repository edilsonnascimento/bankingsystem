public abstract class ClienteBanco implements Verifica{

    private int numeroConta;
    private String nome;
    private Endereco endereco;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) throws NumeroException {
        if(numeroConta >= 0){
            this.numeroConta = numeroConta;
        }else {
            throw new NumeroException();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public abstract void verificaDocumento();
}
