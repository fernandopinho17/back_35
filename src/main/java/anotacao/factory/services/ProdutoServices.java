package main.java.anotacao.factory.services;


import pt.com.ferpinho.dao.IProdutoDAO;
import pt.com.ferpinho.domain.Produto;
import pt.com.ferpinho.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
