import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends TelaBase implements ActionListener {

    double numero1, numero2, resultado;
	JLabel lblResultado;
	JTextField txtNumero1;
	JTextField txtNumero2;
	JPanel painel;
	JButton btSomar;
	JButton btSubtrair;
	JButton btMultiplicar;
	JButton btDividir;
    static Calculadora c1;
	
	Calculadora(){
        this.setLayout(new GridLayout(4,2,10,10));  // Definindo um Layout do Tipo GridLayout 4 linhas, 2 colunas
		this.setTitle("Cálculadora"); // Titulo do Frame
		this.setSize(300, 150); // Tamanho do Frame/Janela
		this.setResizable(false); // A Janela não pode ter o tamanho alterado
		
		lblResultado = new JLabel();
		lblResultado.setBackground(Color.LIGHT_GRAY);
		txtNumero1 = new JTextField();
		txtNumero2 = new JTextField();
		
		painel = new JPanel();
		painel.setLayout(new GridLayout(1,4));

		btSomar = new JButton("+");
		btSubtrair = new JButton("-");
		btMultiplicar = new JButton("*");
		btDividir = new JButton("/");

		painel.add(btSomar);
		painel.add(btSubtrair);
		painel.add(btMultiplicar);
		painel.add(btDividir);

		this.add(lblResultado);
		this.add(txtNumero1);
		this.add(txtNumero2);
		this.add(painel);
		
		this.setLayout(new GridLayout(4,1,5,5));
		this.setTitle("Calculadora");
		this.setSize(200,150);
		this.setResizable(false);

		btSomar.addActionListener(this);
		btSubtrair.addActionListener(this);
		btMultiplicar.addActionListener(this);
		btDividir.addActionListener(this);
	
		
	}
	
	public static void main(String[] args) {

        c1 = new Calculadora();
		c1.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean flagErro =false;
		try{
			numero1 = Double.valueOf(txtNumero1.getText());
			numero2 = Double.valueOf(txtNumero2.getText());
		}catch (NumberFormatException erro){
			lblResultado.setText("somente números");
			flagErro = true;
		}
		if (!flagErro){
			if(e.getSource() == btSomar){
				resultado = numero1 + numero2;
			}else if (e.getSource() == btSubtrair){
				resultado = numero1 - numero2;
		 }else if (e.getSource() == btDividir){
			resultado = numero1 / numero2;
	     }else if (e.getSource() == btMultiplicar){
	  	 resultado = numero1 * numero2;
          }
		  lblResultado.setText(String.valueOf(resultado));
	}
}
}