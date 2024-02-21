package main.java.anotacao.factory.services;


import pt.com.ferpinho.domain.Cliente;
import pt.com.ferpinho.exceptions.DAOException;
import pt.com.ferpinho.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
