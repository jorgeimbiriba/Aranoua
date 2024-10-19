package modelo;

public class Funcionario extends Pessoa{

    private String dataAdmissao;


    public Funcionario() {
    }

    public Funcionario(String nome, String telefone, String email, String dataAdmissao,String documento) {
        super(nome, telefone, email,documento);
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public boolean validarDocumento() {
        //cnpj: fornecedor
        //Compara a string
        //Valida o documento de acordo com a comparação
            if (this.getDocumento().toCharArray()[0] == '1') {
                return true;
            }
            return false;
        }




//    public String toString(){
//        String dados = "Nome:"+this.getNome()+
//        "\nTelefone:"+this.getTelefone()+
//        "\nEmail:"+this.getEmail()+
//        "\nCarteira:"+this.getCarteira()+
//        "\nCarteira de Trabalho:"+this.validarDocumento()+
//        "\nData de Admissão:"+this.getDataAdmissao();
//
//        return dados;
//    }

}
