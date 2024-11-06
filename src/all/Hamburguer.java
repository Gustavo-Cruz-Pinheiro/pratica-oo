/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all;

/**
 *
 * @author Gustavo.Cruz
 */
public abstract class Hamburguer implements Item{
    
    abstract public float preco();

    public Embalagem pacote() {
        Embrulho embrulho = new Embrulho();
        return embrulho;
    }
    
}
