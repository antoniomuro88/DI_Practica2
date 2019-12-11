package Practica2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Choice;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.ScrollPane;
import java.awt.Panel;
import javax.swing.JLayeredPane;
import java.awt.Font;

public class NuevoTicket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoTicket frame = new NuevoTicket();
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
	public NuevoTicket() {
		setType(Type.UTILITY);
		setTitle("Nuevo Ticket");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setBounds(209, 145, 58, 20);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("2");
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 181, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecciona un art\u00EDculo...", "Botella de agua", "Saco de patatas", "Tableta de chocolate", "Litro de cerveza", "Paquete de pasta", "Paquete de galletas"}));
		
		textField_2 = new JTextField();
		textField_2.setBounds(207, 95, 58, 20);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("3\u20AC");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Fecha");
		lblNewLabel.setBounds(442, 11, 66, 14);
		
		JLabel lblNewLabel_1 = new JLabel("Art\u00EDculos");
		lblNewLabel_1.setBounds(72, 11, 89, 14);
		
		JLabel lblNewLabel_2 = new JLabel("Precio");
		lblNewLabel_2.setBounds(218, 79, 64, 14);
		
		JButton btnInsertar = new JButton("A\u00F1adir a la cesta");
		btnInsertar.setBounds(20, 200, 149, 23);
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(47, 234, 89, 23);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(212, 125, 64, 14);
		
		textField_3 = new JTextField();
		textField_3.setBounds(478, 8, 66, 20);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("11/12/2019");
		textField_3.setColumns(10);
		
		JLabel lblCestaDeLa = new JLabel("Cesta de la compra");
		lblCestaDeLa.setBounds(301, 11, 121, 14);
		panel.setLayout(null);
		panel.add(lblNewLabel_1);
		panel.add(lblNewLabel_2);
		panel.add(lblCestaDeLa);
		panel.add(comboBox);
		panel.add(textField_2);
		panel.add(lblCantidad);
		panel.add(textField);
		panel.add(btnInsertar);
		panel.add(lblNewLabel);
		panel.add(btnNewButton);
		panel.add(textField_3);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(Color.GRAY, 2));
		layeredPane.setBackground(Color.WHITE);
		layeredPane.setBounds(288, 36, 256, 187);
		panel.add(layeredPane);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(229, 30, 16, 14);
		layeredPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(NuevoTicket.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-error.png")));
		
		table = new JTable();
		table.setBounds(10, 28, 218, 16);
		layeredPane.add(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Saco de patatas", "3\u20AC", "2", "6\u20AC"},
			},
			new String[] {
				"Art\u00EDculo", "Precio", "Cantidad", "Total"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(110);
		table.getColumnModel().getColumn(1).setPreferredWidth(40);
		table.getColumnModel().getColumn(2).setPreferredWidth(52);
		table.getColumnModel().getColumn(3).setPreferredWidth(35);
		
		JLabel lblUd = new JLabel("Ud.");
		lblUd.setBounds(158, 11, 33, 14);
		layeredPane.add(lblUd);
		
		JLabel label_3 = new JLabel("Total");
		label_3.setBounds(199, 12, 57, 14);
		layeredPane.add(label_3);
		
		JLabel label_1 = new JLabel("Precio");
		label_1.setBounds(109, 11, 41, 14);
		layeredPane.add(label_1);
		
		JLabel label = new JLabel("Art\u00EDculo");
		label.setBounds(10, 11, 89, 14);
		layeredPane.add(label);
		
		textField_4 = new JTextField();
		textField_4.setBounds(101, 164, 58, 20);
		layeredPane.add(textField_4);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("6\u20AC");
		textField_4.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(113, 150, 57, 14);
		layeredPane.add(lblTotal);
		
		JButton btnTotalizar = new JButton("TOTALIZAR");
		btnTotalizar.setBounds(342, 234, 149, 23);
		panel.add(btnTotalizar);
	}
}
