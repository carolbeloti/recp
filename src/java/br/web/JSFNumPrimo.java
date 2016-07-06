/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import Model.NumPrimos;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author K008
 */
@ManagedBean
@RequestScoped
public class JSFNumPrimo {
    
    public JSFNumPrimo(){}
    
    private String nome;
    private int qtde;
    private Model.NumPrimos num;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public void setNum(NumPrimos num) {
        this.num = num;
    }

    public int getQtde() {
        return qtde;
    }

    public NumPrimos getNum() {
        return num;
    }

    
}
