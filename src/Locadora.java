import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Locadora {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Locadora window = new Locadora();
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
	public Locadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				//frame.setEnabled(true);
			}
		});
		frame.setBounds(100, 100, 824, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOCADORA BEM LOCADO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(171, 10, 226, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(37, 51, 728, 407);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_Carros = new JPanel();
		tabbedPane.addTab("Carros", null, panel_Carros, null);
		panel_Carros.setLayout(null);
		
		JButton btnNewButton_CRUDCarros = new JButton("Cadastrar/Alterar  Veiculo");
		btnNewButton_CRUDCarros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_CRUDCarros.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_CRUDCarros.setBounds(243, 64, 252, 55);
		panel_Carros.add(btnNewButton_CRUDCarros);
		
		JList list_carros = new JList();
		list_carros.setBounds(57, 162, 606, 193);
		panel_Carros.add(list_carros);
		
		JPanel panel_Usuario = new JPanel();
		tabbedPane.addTab("Usu\u00E1rios", null, panel_Usuario, null);
		panel_Usuario.setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 119, 703, 251);
		panel_Usuario.add(list);
		
		JButton btnNewButton = new JButton("Cadastrar/Alterar Usu\u00E1rio");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(215, 37, 256, 51);
		panel_Usuario.add(btnNewButton);
		
		JPanel panel_Locacao = new JPanel();
		tabbedPane.addTab("Loca\u00E7\u00E3o", null, panel_Locacao, null);
		panel_Locacao.setLayout(null);
	}
}
