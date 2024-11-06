/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all;

/**
 *
 * @author Gustavo.Cruz
 */
public class ConstutorDeRefeicao {
    
    Refeicao construirRefeicaoVegana(){
        Refeicao refeicao = new Refeicao();
        Aquarius aquarius = new Aquarius();
        HamburguerVegano hamburguerVegano = new HamburguerVegano();
        refeicao.adicionarItem(hamburguerVegano);
        refeicao.adicionarItem(aquarius);
        return refeicao;
    }
    Refeicao construirRefeicaoNaoVegana(){
        Refeicao refeicao = new Refeicao();
        Pepsi pepsi = new Pepsi();
        HamburguerNaoVegano hamburguerNaoVegano = new HamburguerNaoVegano();
        refeicao.adicionarItem(hamburguerNaoVegano);
        refeicao.adicionarItem(pepsi);
        return refeicao;    
    }
}
