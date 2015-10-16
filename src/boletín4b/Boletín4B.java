
package boletín4b;

import javax.swing.JOptionPane;

/**
 *nina@danielcastelao.org
 * @author Pablite5
 */
public class Boletín4B {

    
    public static void main(String[] args) {
      
        Consumo cons1=new Consumo();
        cons1.setLitros(50f);
        cons1.setPgas(1.57f);
        
        Consumo cons2=new Consumo();
        cons2.setLitros(50f);
        cons2.setPgas(1.57f);
        String respuesta = JOptionPane.showInputDialog("Velocidade Media");
        cons2.setvMed(Float.parseFloat(respuesta));
        String respuesta2 = JOptionPane.showInputDialog("Distancia");
        cons2.setKms(Float.parseFloat(respuesta));

    JOptionPane.showMessageDialog(null, "Consumo Medio:" +cons2.getConsumoMedio());
    }
}