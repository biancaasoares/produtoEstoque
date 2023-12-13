package br.senai.sp.jandira.controller;

import java.util.Scanner;
import br.senai.sp.jandira.model.Cliente;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public static void Menu() throws SQLException {


        System.out.println("-------------------- menu --------------------");
        System.out.println("1- Listar clientes ");
        System.out.println("2- Sair");


        Scanner scanner = new Scanner(System.in);

        int userOption = scanner.nextInt();
        scanner.nextLine();

        ClienteController clienteController = new ClienteController();

        switch (userOption) {
            case 1:
                clienteController.listeCliente();
                break;


        }

    }
}
