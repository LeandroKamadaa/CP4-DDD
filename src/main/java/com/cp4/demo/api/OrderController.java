package com.cp4.demo.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping("/iniciar")
    public String iniciar() {
        return "Pedido iniciado com sucesso!";
    }

    @PostMapping("/adicionar-item")
    public String adicionarItem() {
        return "Item adicionado ao pedido com sucesso!";
    }

    @PostMapping("/confirmar")
    public String confirmar() {
        return "Pedido confirmado! Enviado para a cozinha.";
    }

    @PostMapping("/preparar")
    public String preparar() {
        return "Iniciando o preparo do pedido na cozinha.";
    }

    @PostMapping("/finalizar")
    public String finalizar() {
        return "Pedido finalizado e pronto para entrega!";
    }

    @PostMapping("/entregar")
    public String entregar() {
        return "Pedido entregue ao cliente com sucesso!";
    }

    @PostMapping("/cancelar")
    public String cancelar() {
        return "Pedido cancelado com sucesso!";
    }
}
