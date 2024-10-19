package modelo;

public class Fornecedor extends Pessoa {

    public Fornecedor() {
    }

    public Fornecedor(String nome, String telefone, String email, String documento) {
        super(nome, telefone, email, documento);

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
}
