/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo.Cruz
 */
public class Refeicao {

    List<Item> listaItens = new ArrayList();

    public void adicionarItem(Item item) {
        listaItens.add(item);
    }

    public float getCusto() {
        float total = 0;
        for (Item item : listaItens) {
            total = total + item.preco();
        }
        return total;
    }

    public void mostrarItens() {
        for (Item item : listaItens) {
            System.out.println("Item : " + item.nome() + ", Embalagem : " + item.pacote().pacote() + ", Preço : " + item.preco());
        }
    }
}
