package all;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo.Cruz
 */
public class Executavel {
    public static void main(String[] args) {
        ConstutorDeRefeicao construtorRefeicao = new ConstutorDeRefeicao();
        
        Refeicao refeicaoVegana = construtorRefeicao.construirRefeicaoVegana();
        System.out.println("Refeição Vegana");
        refeicaoVegana.mostrarItens();
        System.out.println("Custo Total: " + refeicaoVegana.getCusto());
        
        Refeicao refeicaoNaoVegana = construtorRefeicao.construirRefeicaoNaoVegana();
        System.out.println("Refeição não Vegana");
        refeicaoNaoVegana.mostrarItens();
        System.out.println("Custo Total: " + refeicaoNaoVegana.getCusto());
    }
}
