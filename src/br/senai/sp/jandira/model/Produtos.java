package br.senai.sp.jandira.model;

public class Produtos {

    private int idProduto;

    private String nome;

    private String fornecedor;

    private double valor;

    private int estoque;


    public Produtos (int idProduto, String nome, String fornecedor, double valor, int estoque){

        this.idProduto = idProduto;

        this.nome = nome;

        this.fornecedor = fornecedor;

        this.valor= valor;

        this.estoque = estoque;

    }


    public int getIdProduto() {

        return idProduto;

    }


    public void setIdProduto(int idProduto) {

        this.idProduto = idProduto;

    }


    public String getNome() {

        return nome;

    }


    public void setNome(String nome) {

        this.nome = nome;

    }


    public String getFornecedor() {

        return fornecedor;

    }


    public void setFornecedor(String fornecedor) {

        this.fornecedor = fornecedor;

    }

    public double getValor() {

        return valor;

    }


    public void setValor(double valor) {

        this.valor = valor;

    }



    public int getEstoque() {

        return estoque;

    }



    public void setEstoque(int estoque) {

        this.estoque = estoque;

    }



    public void verDados (){

        System.out.println("O  id é:" + idProduto);

        System.out.println("O nome é:" + nome);

        System.out.println("O fornecedor é:" + fornecedor);

        System.out.println("O valor é:"  + valor);

        System.out.println("O estoque é:" + estoque);

    }

}