package main.java.anotacao.factory.jpa;

import pt.com.ferpinho.dao.generic.jpa.IGenericJapDAO;
import pt.com.ferpinho.domain.jpa.VendaJpa;
import pt.com.ferpinho.exceptions.DAOException;
import pt.com.ferpinho.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     * Usando este método para evitar a exception org.hibernate.LazyInitializationException
     * Ele busca todos os dados de objetos que tenham colletion pois a mesma por default é lazy
     * Mas você pode configurar a propriedade da collection como fetch = FetchType.EAGER na anotação @OneToMany e usar o consultar genérico normal
     *
     * OBS: Não é uma boa prática utiliar FetchType.EAGER pois ele sempre irá trazer todos os objetos da collection
     * mesmo sem precisar utilizar.
     *
     *
     * @see VendaJpa produtos
     *
     * @param id
     * @return
     */
    public VendaJpa consultarComCollection(Long id);
}
