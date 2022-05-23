package Desafio_Spring_Boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import Desafio_Spring_Boot.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/qualquer")
	public Cliente obtercliente() {
		return new Cliente(28, "Vitor", "093.187.297-90" );
	}
	
    @GetMapping ("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
    	return new Cliente(id, "Maria", "987.654.321-00");
    }
    @GetMapping
    public Cliente obterClientePorId2(
    		@RequestParam(name = "id", defaultValue = "1")int id) {
    	return new Cliente(id, "João Augusto", "111.222.333-44");
    }
}
