package br.com.loja.book.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.loja.book.daos.ProductDAO;
import br.com.loja.book.models.Product;

/**
 *
 * @author paulo
 */
@Controller
@Transactional
public class ProdutosController {
    
	@Autowired
	private ProductDAO productDAO;
	
    @RequestMapping("/produtos")
    public String save(Product product){
        productDAO.save(product);
        return "/produtos/form";
    }
    
    @RequestMapping("/produtos/cadastrar")
    public String form(){
        return "/produtos/form";
    }
}