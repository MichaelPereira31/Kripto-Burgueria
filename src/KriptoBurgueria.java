import javax.swing.*;
//import javax.swing.Border;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// import jdk.internal.org.jline.reader.impl.BufferImpl;

public class KriptoBurgueria {
	public JFrame main_frame = new JFrame("Kripto Lanchonete - v1.0");
	public JPanel main_container = new JPanel();
	public Font font_padrao = new Font("serif", Font.PLAIN, 33);
	public Font font_button = new Font("roboto", Font.PLAIN, 14);

	public static void main(String[] args) {
		KriptoBurgueria app = new KriptoBurgueria();
		app.configure();
		app.tela_principal();
	}

	public void configure() {
		this.main_frame.setLayout(null);
		this.main_frame.setSize(720, 512);
		this.main_frame.setVisible(true);
		this.main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.main_frame.getContentPane().setBackground(Color.decode("#212F4D"));
	}

	public void tela_principal() {

		this.main_frame.add(this.main_container);
		this.main_container.setBackground(Color.decode("#212F4D"));
		this.main_container.setVisible(true);
		this.main_container.setLayout(null);
		this.main_container.setSize(720, 512);

		JLabel kripto = new JLabel("KRIPTO");
		kripto.setBounds(290, 79, 315, 150);
		kripto.setForeground(Color.decode("#ebf1fb"));
		kripto.setFont(this.font_padrao);
		this.main_container.add(kripto);

		JLabel burgueria = new JLabel("BURGUERIA");
		burgueria.setBounds(250, 141, 315, 150);
		burgueria.setForeground(Color.decode("#ebf1fb"));
		burgueria.setFont(this.font_padrao);
		this.main_container.add(burgueria);

		JButton pedido = new JButton("Faça seu pedido");
		pedido.setBounds(262, 281, 195, 67);
		pedido.setBackground(Color.decode("#3A8AD3"));
		pedido.setForeground(Color.decode("#FFFFFF"));
		pedido.setFont(this.font_button);
		this.main_container.add(pedido);

		JButton historico = new JButton("Historico de pedidos");
		historico.setBounds(262, 351, 195, 20);
		historico.setForeground(Color.decode("#FFFFFF"));
		historico.setBackground(Color.decode("#212F4D"));
		historico.setFont(this.font_button);
		this.main_container.add(historico);

		pedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main_container.setVisible(false);
				Cardapio cardapio = new Cardapio(main_frame, font_button, main_container);
				cardapio.gerar_botoes();
			}
		});

	}

	public void voltar_tela() {
		main_frame.getContentPane().removeAll();
		main_frame.repaint();

		this.tela_principal();
	}

}