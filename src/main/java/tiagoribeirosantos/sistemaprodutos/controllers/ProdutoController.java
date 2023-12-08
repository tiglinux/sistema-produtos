package tiagoribeirosantos.sistemaprodutos.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import tiagoribeirosantos.sistemaprodutos.model.Produto;
import tiagoribeirosantos.sistemaprodutos.model.repository.ProdutoRepository;

@RestController
@RequestMapping(path = "/api/products")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;

	@PostMapping
	public @ResponseBody Produto addProduct(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}

	@GetMapping
	public Iterable<Produto> obtainAllProducts() {
		return produtoRepository.findAll();
	}

	@GetMapping(path = "/page/{numberPage}")
	public Iterable<Produto> obtainProductsPerPage(@PathVariable int numberPage){
		return produtoRepository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Produto> obtainProductPerId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}

	@PutMapping
	public Produto updateProduct(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@DeleteMapping(path = "/{id}")
	public void removeProduct(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}

}
