package com.example.lavucy.controller;
import com.example.lavucy.dao.ClienteDao;
import com.example.lavucy.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    private ClienteDao dao;
    private Cliente cliente;
    private List<Cliente> clientes;

    public ClienteController() {
        cliente = new Cliente();
        dao = new ClienteDao();
        clientes = new ArrayList<>();
    }


}
