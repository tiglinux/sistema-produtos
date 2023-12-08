package tiagoribeirosantos.sistemaprodutos.model.repository;

import org.springframework.data.repository.CrudRepository;

import tiagoribeirosantos.sistemaprodutos.model.Produto;

public interface ProdutoRepository extends 
	CrudRepository<Produto, Integer>{

}
