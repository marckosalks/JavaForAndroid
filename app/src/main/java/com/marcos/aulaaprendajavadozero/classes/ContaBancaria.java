package com.marcos.aulaaprendajavadozero.classes;

class ContaBancaria {

    //java não precias do get e set usamos o private e o this
    //o private serve apenas para privar os dados de demais classes
    protected double saldo = 0;

    public void conferirSaldo(){
        System.out.println("Este é o saldo da sua conta: " + saldo);
    }
    public void transferir(){
        saldo = 100;
    }



}
