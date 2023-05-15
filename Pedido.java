import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class InterfacePedido {
    public static void main(String[] args) {

        
        JFrame janela = new JFrame("Pedido");
        janela.setSize(300, 250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel painel = new JPanel();
        JLabel perguntaField = new JLabel("Você aceita?");
         
        JButton botaoSim = new JButton("Sim");
        JButton botaoNao = new JButton("Não");

        painel.add(perguntaField ,0);
        painel.add(botaoSim);
        painel.add(botaoNao);

        
        janela.add(painel);
        
        
        botaoNao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            
                int x = (int) (Math.random() * (painel.getWidth() - botaoNao.getWidth()));
                int y = (int) (Math.random() * (painel.getHeight() - botaoNao.getHeight()));
                botaoNao.setLocation(x, y);
            }
        });

        
        painel.setLayout(null);

        perguntaField.setBounds(0, 0, 80, 30);;
        botaoSim.setBounds(50, 100, 80, 30);
        botaoNao.setBounds(150, 100, 80, 30);

        
        janela.setVisible(true);
        botaoSim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(janela, "❤️");
            }
        });
    
    }
}
