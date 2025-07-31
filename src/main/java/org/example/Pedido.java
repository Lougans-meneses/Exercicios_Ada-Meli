package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    private ItemPedido item;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0.0;
        for(ItemPedido item : itens){
            total += item.getSubtotal();
        }
        return  total;
    }

    public void exibirResumo() {
        System.out.println("Resumo do pedido: ");
        for(ItemPedido item : itens){
            System.out.printf("- %s (x%d): R$ %.2f\n",
                    item.getProduto().getNome(),
                    item.getQuantidade(),
                    item.getSubtotal());
        }
        System.out.printf("Total do pedido: R$%.2f", calcularTotal());
    }
}
