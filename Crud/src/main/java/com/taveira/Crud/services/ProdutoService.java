package com.taveira.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taveira.crud.data.dto.ProdutoDTO;
import com.taveira.crud.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private final ProdutoRepository produtoRepository;

	@Autowired
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public ProdutoDTO create(ProdutoDTO produtoDTO) {
		return null;
	}
}
