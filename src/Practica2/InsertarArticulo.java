package Practica2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Window.Type;

public class InsertarArticulo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertarArticulo frame = new InsertarArticulo();
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
	public InsertarArticulo() {
		setType(Type.UTILITY);
		setTitle("Insertar Art\u00EDculo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 217, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(37, 36, 126, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(37, 148, 126, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Descripci\u00F3n");
		lblNewLabel.setBounds(54, 11, 90, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setBounds(73, 123, 64, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(54, 195, 89, 23);
		panel.add(btnInsertar);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(54, 236, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(73, 67, 53, 14);
		panel.add(lblPrecio);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(37, 92, 126, 20);
		panel.add(textField_1);
	}
}
