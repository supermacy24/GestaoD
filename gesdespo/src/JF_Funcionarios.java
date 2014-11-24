import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTable;


public class JF_Funcionarios extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNumero;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_Funcionarios frame = new JF_Funcionarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JF_Funcionarios() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 316, 438);
		contentPane = new JPanel();
		setTitle("Registo de Funcionarios");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 366, 280, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(31, 225, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblNumeroDeFuncionario = new JLabel("Numero de Funcionario:");
		lblNumeroDeFuncionario.setBounds(150, 225, 185, 14);
		contentPane.add(lblNumeroDeFuncionario);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(31, 281, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(31, 302, 109, 23);
		contentPane.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(150, 302, 109, 23);
		contentPane.add(rdbtnFeminino);
		
		JButton btnSubmeter = new JButton("Submeter");
		btnSubmeter.setBounds(10, 332, 280, 23);
		contentPane.add(btnSubmeter);
		
		txtNome = new JTextField();
		txtNome.setBounds(31, 250, 109, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(150, 250, 109, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		table = new JTable();
		table.setBounds(10, 11, 280, 184);
		contentPane.add(table);
	}
}
