package com.iftm.backendachadosperdidos.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iftm.backendachadosperdidos.dto.ProductDTO;
import com.iftm.backendachadosperdidos.entities.Product;
import com.iftm.backendachadosperdidos.repositories.ProductRepository;
import com.iftm.backendachadosperdidos.resources.exeptions.ResourceNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<ProductDTO> findAll() {
		List<Product> list =  repository.findAll();
		return list.stream().map(e -> new ProductDTO(e)).collect(Collectors.toList());
	}
	
	public ProductDTO findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		Product entity = obj.orElseThrow(() -> new ResourceNotFoundException(id));
		return new ProductDTO(entity);
	}
	
}
