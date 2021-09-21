  
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class TestaActionListener extends TelaBase implements ActionListener {   

    JButton btVermelho = new JButton("Vermelho");
	JButton btAzul = new JButton("Azul");
	JButton btVerde = new JButton("Verde");
	JButton btAmarelo = new JButton("Amarelo");
	JButton btSair = new JButton("Sair");

	TestaActionListener(){
		this.setLayout(new FlowLayout());
		this.add(btVermelho);
		this.add(btAzul);
		this.add(btVerde);
		this.add(btAmarelo);
		this.add(btSair);
		this.setVisible(true);
		this.btVermelho.addActionListener(this);
		this.btAzul.addActionListener(this);
		this.btVerde.addActionListener(this);
		this.btAmarelo.addActionListener(this);
		this.btSair.addActionListener(this);
	}
	public static void main(String[] args) {
		TestaActionListener t01 = new TestaActionListener();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btVermelho) {
			this.getContentPane().setBackground(Color.red);
		} else if (e.getSource() == btAzul) {
			this.getContentPane().setBackground(Color.blue);			
		} else if (e.getSource() == btVerde) {
			this.getContentPane().setBackground(Color.green);			
		} else if (e.getSource() == btAmarelo) {
			this.getContentPane().setBackground(Color.yellow);			
		} else if (e.getSource() == btSair) {
			System.exit(0);			
		}
		
	}
}
