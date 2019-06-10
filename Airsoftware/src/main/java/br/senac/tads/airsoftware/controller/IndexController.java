/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.airsoftware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {

    @GetMapping("/index")
    public ModelAndView index() {

        return new ModelAndView("/index");
    }
     @GetMapping("/login")
    public ModelAndView login() {

        return new ModelAndView("/login");
    }
    @GetMapping("/carrinho")
    public ModelAndView carrinho() {

        return new ModelAndView("/carrinho");
    }
    @GetMapping("/ops")
    public ModelAndView ops() {

        return new ModelAndView("/ops");
    }
}
