package entidade.imovel;

public class ImovelEspecEntidade {
    private String  endereco;
    private String  bairro;
    private String  cidade;
    private String  cep;
    private String  descricao;  

    public ImovelEspecEntidade(){
        
    }

    public ImovelEspecEntidade(String endereco, String bairro, String cidade, String cep, String descricao) {
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;        
        this.descricao = descricao;
    }    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
   
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ImovelEspecEntidade{" + "endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", descricao=" + descricao + '}';
    }    
    
}
