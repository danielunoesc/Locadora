import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class CarrosCRUD {
	public static JFrame pai = null;
	private JFrame frame;
	private JTextField textField_codigo;
	private JTextField textField_Nome;
	private JTextField textField_Marca;
	private JTextField textField_modelo;
	private JTextField textField_Preco;
	private JTextField textField_VL_locacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarrosCRUD window = new CarrosCRUD();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CarrosCRUD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				
			}
			@Override
			public void windowClosing(WindowEvent e) {
				if (pai != null){
				pai.setEnabled(true);
				if (pai.isEnabled()) {
					System.out.print("Ali");
				}}
			}
		});
		frame.setBounds(100, 100, 485, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(36, 35, 62, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField_codigo = new JTextField();
		textField_codigo.setBounds(108, 35, 45, 19);
		frame.getContentPane().add(textField_codigo);
		textField_codigo.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNome.setBounds(36, 76, 54, 16);
		frame.getContentPane().add(lblNome);
		
		textField_Nome = new JTextField();
		textField_Nome.setBounds(108, 76, 173, 19);
		frame.getContentPane().add(textField_Nome);
		textField_Nome.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMarca.setBounds(36, 112, 54, 16);
		frame.getContentPane().add(lblMarca);
		
		textField_Marca = new JTextField();
		textField_Marca.setBounds(108, 112, 173, 19);
		frame.getContentPane().add(textField_Marca);
		textField_Marca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblModelo.setBounds(36, 154, 54, 16);
		frame.getContentPane().add(lblModelo);
		
		textField_modelo = new JTextField();
		textField_modelo.setBounds(108, 154, 173, 19);
		frame.getContentPane().add(textField_modelo);
		textField_modelo.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o: R$");
		lblPreo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPreo.setBounds(30, 196, 72, 16);
		frame.getContentPane().add(lblPreo);
		
		textField_Preco = new JTextField();
		textField_Preco.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_Preco.setBounds(112, 188, 96, 35);
		frame.getContentPane().add(textField_Preco);
		textField_Preco.setColumns(10);
		
		JLabel lblLocao = new JLabel("Valor Loca\u00E7\u00E3o");
		lblLocao.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLocao.setBounds(340, 36, 96, 16);
		frame.getContentPane().add(lblLocao);
		
		textField_VL_locacao = new JTextField();
		textField_VL_locacao.setBounds(340, 57, 96, 35);
		frame.getContentPane().add(textField_VL_locacao);
		textField_VL_locacao.setColumns(10);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setBounds(164, 233, 165, 35);
		frame.getContentPane().add(btnNewButton);
	}

}
