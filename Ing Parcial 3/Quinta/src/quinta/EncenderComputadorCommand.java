/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quinta;

/**
 *
 * @author hp
 */
public class EncenderComputadorCommand implements Comand{
    private computador computador;
    
    public EncenderComputadorCommand(Computador computador) {
       this.computador = computador;
    }

    @Override
    public void execute() {
        computador.Encender();
    }
    
}
