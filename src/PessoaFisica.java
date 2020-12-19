/**
 * @autor: Edilson do Nascimento
 */
public final class PessoaFisica extends ClienteBanco{

    private int cpf = 0;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void verificaDocumento() {
        if( (this.getCpf() >= 10) && (this.getCpf() <= 20)) {
            System.out.println("CPF VÁLIDO!");
        }else{
            System.out.println("CPF INVALIDO!");
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
