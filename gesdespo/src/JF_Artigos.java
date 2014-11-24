
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;



public class JF_Artigos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_Artigos frame = new JF_Artigos();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JF_Artigos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 377, 438);
		contentPane = new JPanel();
		setTitle("Registo de Artigos");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmeter = new JButton("Submeter");
		btnSubmeter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals("")||textField_4.getText().equals("")){
					JOptionPane.showMessageDialog(null,
						    "Por favor preencha todos os campos.",
						    "Erro",
						    JOptionPane.WARNING_MESSAGE);
					
				}
				else{
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");}
				
				
				
			}
		});
		btnSubmeter.setBounds(0, 345, 361, 23);
		contentPane.add(btnSubmeter);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JF_inicio inicio= new JF_inicio();
				inicio.setVisible(true);
				inicio.setResizable(false);
				
				if (inicio.isVisible()){
					dispose();
				}
			}
			
			
		});
		
		
		btnVoltar.setBounds(0, 370, 361, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 131, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblstk = new JLabel("Stock");
		lblstk.setBounds(10, 186, 46, 14);
		contentPane.add(lblstk);
		
		textField = new JTextField();
		textField.setBounds(10, 151, 206, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 202, 46, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblprecodsc = new JLabel("Pre\u00E7o com desconto");
		lblprecodsc.setBounds(110, 244, 106, 14);
		contentPane.add(lblprecodsc);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 259, 46, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblpreco = new JLabel("Preço");
		lblpreco.setBounds(10, 244, 46, 14);
		contentPane.add(lblpreco);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 259, 80, 23);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblstm = new JLabel("Stock Minimo");
		lblstm.setBounds(104, 186, 112, 14);
		contentPane.add(lblstm);
		
		textField_4 = new JTextField();
		textField_4.setBounds(104, 203, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 314, 80, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Verão");
		comboBox.addItem("Outono");
		comboBox.addItem("Inverno");
		comboBox.addItem("Primavera");
		
		
	
		
		JLabel lblSazonalidade = new JLabel("Sazonalidade");
		lblSazonalidade.setBounds(10, 289, 80, 14);
		contentPane.add(lblSazonalidade);
		
		
		
		
		
	
		
		
		
	
	}
}
