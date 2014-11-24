
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class JF_Clientes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_Clientes frame = new JF_Clientes();
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
	public JF_Clientes() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 377, 438);
		
		contentPane = new JPanel();
		setTitle("Registo de Clientes");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		textField = new JTextField();
		textField.setBounds(10, 272, 341, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(9);
		textField_1.setBounds(10, 229, 341, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 187, 341, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		contentPane.add(new JScrollPane());
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(8, 316, 93, 23);
		contentPane.add(rdbtnMasculino);
		
		JRadioButton rdbtnAdicionar = new JRadioButton("Adicionar");
		JRadioButton rdbtnPesquisar = new JRadioButton("Pesquisar");
		JRadioButton rdbtnRemover = new JRadioButton("Remover");
		
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnFeminino.isSelected()==true)
				{
					rdbtnMasculino.setSelected(false);
				}
				else if (rdbtnMasculino.isSelected()==true)
				{
					rdbtnFeminino.setSelected(false);
				}
				
			}
		});
		rdbtnFeminino.setBounds(103, 315, 109, 23);
		contentPane.add(rdbtnFeminino);
		
		
		rdbtnMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnMasculino.isSelected()==true)
				{
					rdbtnFeminino.setSelected(false);
				}
				else if (rdbtnFeminino.isSelected()==true)
				{
					rdbtnMasculino.setSelected(false);
				}
			}
		});
		
		
		JButton btnSubmeter = new JButton("Submeter");
		btnSubmeter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||rdbtnFeminino.isSelected()==false&&rdbtnMasculino.isSelected()==false){
					JOptionPane.showMessageDialog(null,
						    "Por favor preencha todos os campos.",
						    "Erro",
						    JOptionPane.WARNING_MESSAGE);
					
				}
				else{
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
				if (rdbtnAdicionar.isSelected()){
				JOptionPane.showMessageDialog(null,
					    "Adicionado com exito!",
					    "Sucesso",
					    JOptionPane.INFORMATION_MESSAGE);}
				
				if (rdbtnRemover.isSelected()){
					JOptionPane.showMessageDialog(null,
						    "Removido com exito!",
						    "Removido",
						    JOptionPane.INFORMATION_MESSAGE);}}
				
				
				
				if(rdbtnFeminino.isSelected()||rdbtnMasculino.isSelected())
				{
					rdbtnFeminino.setSelected(false);
					rdbtnMasculino.setSelected(false);
					
				}
				
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
		lblNome.setBounds(10, 168, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(10, 210, 117, 14);
		contentPane.add(lblNumero);
		
		JLabel lblMorada = new JLabel("Morada:");
		lblMorada.setBounds(10, 254, 46, 14);
		contentPane.add(lblMorada);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 298, 46, 14);
		contentPane.add(lblSexo);
	
		rdbtnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnPesquisar.isSelected()){
					
					rdbtnRemover.setSelected(false);
					rdbtnAdicionar.setSelected(false);
				}
			}
		});
		
		rdbtnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnRemover.isSelected()){
					
					rdbtnAdicionar.setSelected(false);
					rdbtnPesquisar.setSelected(false);
				}
			}
		});
		
		rdbtnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnAdicionar.isSelected()){
					
					rdbtnRemover.setSelected(false);
					rdbtnPesquisar.setSelected(false);
				}
				
			}
		});
		rdbtnAdicionar.setBounds(6, 138, 109, 23);
		contentPane.add(rdbtnAdicionar);
		
	
		rdbtnRemover.setBounds(116, 138, 109, 23);
		contentPane.add(rdbtnRemover);
		
		
		rdbtnPesquisar.setBounds(227, 138, 109, 23);
		contentPane.add(rdbtnPesquisar);
		
		
		
		
	}
}
