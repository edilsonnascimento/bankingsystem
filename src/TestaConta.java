/**
* @autor: Edilson do Nascimento
 */
public class TestaConta {

    public static void main(String[] args) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        //Entrada de Dados
        try {
            pessoaJuridica.setNumeroConta(0);
        } catch (NumeroException exception) {
            exception.imprimeMensagem();
        }
        pessoaJuridica.setCnpj(352540014);
        pessoaJuridica.getEndereco().setRua("Avenida Alberto Carazzai");
        pessoaJuridica.getResponsavel().setCpf(10);
        pessoaJuridica.getResponsavel().setNome("Márcio");

        //Saída de Dados
        System.out.println("Pessoa Jurídica:");
        System.out.println("Número da Conta: " + pessoaJuridica.getNumeroConta());
        pessoaJuridica.validar();
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
        System.out.println("Rua: " + pessoaJuridica.getEndereco().getRua() + "\n");
        System.out.println("Pessoa Física - Responsável pela Conta:");
        System.out.println("CPF: " + pessoaJuridica.getResponsavel().getCpf());
        pessoaJuridica.getResponsavel().verificaDocumento();
        System.out.println("Nome: " + pessoaJuridica.getResponsavel().getNome());
        pessoaJuridica.verificaDocumento();

    }
}
