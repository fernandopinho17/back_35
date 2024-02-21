package main.java.anotacao.factory.jpa;



import pt.com.rpires.dao.generic.jpa.GenericJpaDAO;
import pt.com.rpires.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}
