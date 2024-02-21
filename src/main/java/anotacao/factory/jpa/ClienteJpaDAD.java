package main.java.anotacao.factory.jpa;


import pt.com.ferpinho.dao.generic.jpa.GenericJpaDAO;
import pt.com.ferpinho.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}
