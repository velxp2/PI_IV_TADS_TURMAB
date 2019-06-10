package br.senac.tads.airsoftware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import br.senac.tads.airsoftware.repository.ProdutoRepository;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import br.senac.tads.airsoftware.model.Produto;
import java.util.Optional;
/**
 *
 * @author rafael.dini
 */


@Controller
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/cadastrar_produto")
    public ModelAndView adicionarNovo() {
        ModelAndView modelAndView = new ModelAndView("/cadastrar_produto");
        modelAndView.addObject("produto", new Produto());
        return modelAndView;
    }

    @PostMapping("**/salvar")
    public ModelAndView salvar(Produto p) {
        produtoRepository.save(p);
        ModelAndView modelAndView = new ModelAndView("redirect:/pesquisar");
        return modelAndView;
    }

    @GetMapping("/pesquisar")
    public ModelAndView lista() {
        ModelAndView modelAndView = new ModelAndView("/pesquisar");
        List<Produto> produto = produtoRepository.findAll();
        modelAndView.addObject("produto", produto);
        return modelAndView;
    }

    @GetMapping("/editarproduto/{id}")
    public ModelAndView editar(
            @PathVariable("id") Long id) {
        Optional<Produto> p = produtoRepository.findById(id);

        ModelAndView modelAndView = new ModelAndView("/cadastrar_produto");
        modelAndView.addObject("produto", p.get());
        return modelAndView;
    }

    @GetMapping("/removerproduto/{id}")
    public ModelAndView remover(
            @PathVariable("id") Long id) {

        produtoRepository.deleteById(id);
        ModelAndView modelAndView = new ModelAndView("redirect:/pesquisar");

        return modelAndView;

    }
}
