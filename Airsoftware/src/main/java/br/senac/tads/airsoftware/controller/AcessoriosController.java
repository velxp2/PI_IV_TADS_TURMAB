/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.airsoftware.controller;

import br.senac.tads.airsoftware.model.Produto;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import br.senac.tads.airsoftware.repository.ProdutoRepository;
import java.util.List;


/**
 *
 * @author rafael
 */
@Controller
public class AcessoriosController {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    
   @GetMapping("/acessorios")
   public ModelAndView armas(){
        ModelAndView modelAndView = new ModelAndView("/acessorios");
        List<Produto> p =  produtoRepository.findAll();
        modelAndView.addObject("produtos", p);
        return modelAndView;
       
   }

}
