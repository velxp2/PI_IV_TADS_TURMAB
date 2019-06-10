/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.airsoftware.controller;

import br.senac.tads.airsoftware.model.Cliente;
import br.senac.tads.airsoftware.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.lavieri.modelutil.cep.WebServiceCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author rafael
 */
@Controller
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired

    @GetMapping("/cadastrar_cliente")
    public ModelAndView adicionarNovo() {
        ModelAndView modelAndView = new ModelAndView("/cadastrar_cliente");
        modelAndView.addObject("cliente", new Cliente());
        return modelAndView;
    }

    @PostMapping("**/salvarcliente")
    public ModelAndView salvar(Cliente c) {
        clienteRepository.save(c);
        ModelAndView modelAndView = new ModelAndView("redirect:/pesquisar_clientes");
        return modelAndView;
    }
    

    @GetMapping("/cep")
    public ModelAndView index() {

        return new ModelAndView("/cep");
    }

    @GetMapping("/pesquisar_clientes")
    public ModelAndView lista() {
        ModelAndView modelAndView = new ModelAndView("/pesquisar_clientes");
        Iterable<Cliente> cliente =  clienteRepository.findAll();
        modelAndView.addObject("cliente", cliente);
        return modelAndView;
    }

    @GetMapping("/editarcliente/{id}")
    public ModelAndView editar(
            @PathVariable("id") Long id) {
        Optional<Cliente> c = clienteRepository.findById(id);

        ModelAndView modelAndView = new ModelAndView("/cadastrar_cliente");
        modelAndView.addObject("cliente", c.get());
        return modelAndView;
    }

    @GetMapping("/removercliente/{id}")
    public ModelAndView remover(
            @PathVariable("id") Long id) {

        clienteRepository.deleteById(id);
        ModelAndView modelAndView = new ModelAndView("redirect:/pesquisar_clientes");

        return modelAndView;

    }
}


