package io.github.cursodsantos.clientes;

import io.github.cursodsantos.clientes.dominio.Cliente;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println(cliente.getCodigo());
    }
}
