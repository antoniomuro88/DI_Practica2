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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ModificarArt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarArt frame = new EliminarArt();
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
	public ModificarArt() {
		setType(Type.UTILITY);
		setTitle("Modificar Art\u00EDculo");
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
		
		JButton btnInsertar = new JButton("Modificar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnInsertar.setBounds(56, 211, 89, 23);
		panel.add(btnInsertar);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(56, 245, 89, 23);
		panel.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecciona un art\u00EDculo...", "Botella de agua", "Saco de patatas", "Tableta de chocolate", "Litro de cerveza", "Paquete de pasta", "Paquete de galletas"}));
		comboBox.setBounds(10, 59, 181, 20);
		panel.add(comboBox);
		
		JLabel lblSeleccionaArtculoA = new JLabel("Selecciona art\u00EDculo a modificar");
		lblSeleccionaArtculoA.setBounds(10, 23, 201, 14);
		panel.add(lblSeleccionaArtculoA);
	}
}
