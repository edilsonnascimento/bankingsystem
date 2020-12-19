public final class PessoaJuridica extends ClienteBanco{

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
    public void verificaDocumento() {
        if(getResponsavel().getNome().length() > 30){
            System.out.println("Nome inválido para Responsável!");
        }else {
            System.out.println("Nome válido para Responsável!");
        }
    }

    private boolean isPar(int numeroConta){
        return (numeroConta % 2) == 0;
    }

    @Override
    public void validar(){
        if(isPar(super.getNumeroConta())){
            System.out.println("Essa conta é PAR");
        }else{
            System.out.println("Essa conta é IMPAR");
        }
    }
}
