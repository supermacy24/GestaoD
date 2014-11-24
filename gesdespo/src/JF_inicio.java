
import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class JF_inicio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_inicio frame = new JF_inicio();
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
	public JF_inicio() {
		
		
		getContentPane().setLayout(null);
		addWindowListener(new WindowAdapter() {
			  public void windowClosing(WindowEvent e) {
				  Object[] options = {"Sim",
                  "Não"};
int confirmed = JOptionPane.showOptionDialog(null,
  "Tem a certeza que deseja sair?",
  "Mensagem de saida",
  JOptionPane.YES_NO_OPTION,
  JOptionPane.QUESTION_MESSAGE,
  null,     //do not use a custom Icon
  options,  //the titles of buttons
  options[0]); //default button title

			    if (confirmed == JOptionPane.YES_OPTION) {
			    dispose();
			     
			   }
			    else{
			    	try {
						wait();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}
			    }
			  
			});
		setBounds(100, 100, 457, 369);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("DesporGest");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(153, 161, 116, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numero de Funcionario");
		lblNewLabel.setBounds(153, 136, 134, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submeter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")){
					JOptionPane.showMessageDialog(null,
						    "Por favor insira o seu numero de funcionario.",
						    "Erro",
						    JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(153, 192, 116, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblArtigo = new JLabel("New label");
		lblArtigo.setToolTipText("Gest\u00E3o referente a Artigos");
		lblArtigo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JF_Artigos artigos = new JF_Artigos();
				artigos.setVisible(true);
				
				if (artigos.isVisible())
				{
					dispose();
				}
				
			}
		});
		lblArtigo.setIcon(new ImageIcon("C:\\Users\\Tiago\\Desktop\\UNIVERSIDADE\\ULTIMO ANO\\1Semestre\\LP2\\Gestao_desporto\\btnartigo.png"));
		lblArtigo.setBounds(10, 226, 100, 100);
		contentPane.add(lblArtigo);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setToolTipText("Gest\u00E3o referente a clientes");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JF_Clientes clientes = new JF_Clientes();
				clientes.setVisible(true);
				
				if(clientes.isVisible())
				{
					dispose();
				}
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Tiago\\Desktop\\UNIVERSIDADE\\ULTIMO ANO\\1Semestre\\LP2\\Gestao_desporto\\btnbtn.png"));
		lblNewLabel_1.setBounds(221, 226, 100, 100);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setToolTipText("Estat\u00EDsticas de vendas");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JF_Estat est = new JF_Estat();
				est.setVisible(true);
				
				if(est.isVisible())
				{
					dispose();
				}
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Tiago\\Desktop\\UNIVERSIDADE\\ULTIMO ANO\\1Semestre\\LP2\\Gestao_desporto\\btnest.png"));
		lblNewLabel_2.setBounds(331, 226, 100, 100);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Tiago\\Desktop\\UNIVERSIDADE\\ULTIMO ANO\\1Semestre\\LP2\\Gestao_desporto\\despor.png"));
		lblNewLabel_3.setBounds(20, 13, 411, 89);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblAdicionaFuncionario = new JLabel("Adiciona Funcionario");
		lblAdicionaFuncionario.setToolTipText("Gest\u00E3o referente a funcion\u00E1rios");
		lblAdicionaFuncionario.setIcon(new ImageIcon("C:\\Users\\Tiago\\Desktop\\UNIVERSIDADE\\ULTIMO ANO\\1Semestre\\LP2\\Gestao_desporto\\btnfuncionarios.png"));
		lblAdicionaFuncionario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JF_Funcionarios func= new JF_Funcionarios();
				func.setVisible(true);
				
				if (func.isVisible())
				{
					dispose();
				}
					
				
			}
		});
		lblAdicionaFuncionario.setBounds(121, 226, 100, 100);
		contentPane.add(lblAdicionaFuncionario);
		
		JLabel lblNewLabel_4 = new JLabel("V1.0");
		lblNewLabel_4.setBounds(385, 11, 46, 14);
		contentPane.add(lblNewLabel_4);
	}
}
