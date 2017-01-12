package br.com.loja.book.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author paulo
 */
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String index(){
        return "hello-world";
    }
}