package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;
import br.senai.sp.jandira.model.Cliente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ClienteController {

    Conexao conexao = new Conexao();

    Connection connection = conexao.getConnection();

    public void listeCliente() throws SQLException {

        Statement statement = connection.createStatement();
        String queryList = "SELECT * FROM Cliente";

        ResultSet resultSet = statement.executeQuery(queryList);

        Cliente cliente = new Cliente();

        while (resultSet.next()){
            cliente.setId(resultSet.getInt("id"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.setEmail(resultSet.getString("email"));
            cliente.setSaldo(resultSet.getDouble("saldo"));

            System.out.println("id " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Saldo " + cliente.getSaldo());
            System.out.println("/-----------------------------------------------------/");
        }

    }



}

