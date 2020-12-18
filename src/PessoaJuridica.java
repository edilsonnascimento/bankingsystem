public class PessoaJuridica extends ClienteBanco{

    private int cnpj;
    private PessoaFisica responsavel;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public void verifiaDocumento() {

    }

    @Override
    public void validar() {

    }
}
