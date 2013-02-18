package entidade.imovel;

import entidade.uf.EstadoEntidade;
//import entidade.ClienteEntidade;

public class ImovelEntidade {  
    private long id;
    private Float  valor;
    private ImovelEspecEntidade imovelEspec;;
    private ImovelStatusEntidade status;
  //  private ClienteEntidade cliente;    
    private ImovelTipoEntidade tipo;
    private ImovelCategoriaEntidade categoria;
    private ImovelModalidadeEntidade modalidade;   
    private ImovelChavesEntidade chaves;
    private EstadoEntidade uf;

    public ImovelEntidade(long id, Float valor, ImovelEspecEntidade imovelEspec, ImovelStatusEntidade status, //ClienteEntidade cliente, 
            ImovelTipoEntidade tipo, ImovelCategoriaEntidade categoria, ImovelModalidadeEntidade modalidade, ImovelChavesEntidade chaves, EstadoEntidade uf) {
        this.id = id;
        this.valor = valor;
        this.imovelEspec = imovelEspec;
        this.status = status;
        //this.cliente = cliente;
        this.tipo = tipo;
        this.categoria = categoria;
        this.modalidade = modalidade;
        this.chaves = chaves;
        this.uf = uf;
    }  

    public ImovelEntidade(){
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public ImovelEspecEntidade getImovelEspec() {
        return imovelEspec;
    }

    public void setImovelEspec(ImovelEspecEntidade imovelEspec) {
        this.imovelEspec = imovelEspec;
    }

    public ImovelStatusEntidade getStatus() {
        return status;
    }

    public void setStatus(ImovelStatusEntidade status) {
        this.status = status;
    }

//    public ClienteEntidade getCliente() {
//        return cliente;
//    }
//
//    public void setCliente(ClienteEntidade cliente) {
//        this.cliente = cliente;
//    }

    public ImovelTipoEntidade getTipo() {
        return tipo;
    }

    public void setTipo(ImovelTipoEntidade tipo) {
        this.tipo = tipo;
    }

    public ImovelCategoriaEntidade getCategoria() {
        return categoria;
    }

    public void setCategoria(ImovelCategoriaEntidade categoria) {
        this.categoria = categoria;
    }

    public ImovelModalidadeEntidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(ImovelModalidadeEntidade modalidade) {
        this.modalidade = modalidade;
    }

    public ImovelChavesEntidade getChaves() {
        return chaves;
    }

    public void setChaves(ImovelChavesEntidade chaves) {
        this.chaves = chaves;
    }
    
    public EstadoEntidade getUf() {
        return uf;
    }

    public void setUf(EstadoEntidade uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "ImovelEntidade{" + "id=" + id + ", valor=" + valor + ", imovelEspec=" + imovelEspec + ", status=" + status + //", cliente=" + cliente +
                ", tipo=" + tipo + ", categoria=" + categoria + ", modalidade=" + modalidade + ", chaves=" + chaves + ", uf=" + uf + '}';
    }

     
}
