package maria;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
    
    private JButton texto; //botao com apenas texto
    private JButton icone; //botao com icones
    
    public ButtonFrame(){
    
        super("Testando botao");
        setLayout(new FlowLayout());
        
        texto = new JButton("Botao texto");
        add(texto);
        
        Icon img1 = new ImageIcon(getClass().getResource("arara.jpg"));
        Icon img2 = new ImageIcon(getClass().getResource("pinguim.jpg"));
        icone = new JButton("Botao com icone", img1);
        icone.setRolloverIcon(img2);
        add(icone);
        
        ButtonHandler h = new ButtonHandler();
        texto.addActionListener(h);
        icone.addActionListener(h);
    }
    
    private class ButtonHandler implements ActionListener{
    
        public void actionPerformed(ActionEvent event){
            
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("vc pressionou %s", event.getActionCommand()));
        }

    }
}
