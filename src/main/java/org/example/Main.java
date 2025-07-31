package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Tenis", 850);
        Produto p2 = new Produto("Jaqueta", 550);

        ItemPedido item1 = new ItemPedido(p1, 2);
        ItemPedido item2 = new ItemPedido(p2, 6);

        Pedido pedido1 = new Pedido();
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);

        pedido1.exibirResumo();
    }
}