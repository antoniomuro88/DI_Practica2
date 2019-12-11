package Practica2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSlider;
import javax.swing.DropMode;
import java.awt.List;
import java.awt.Choice;
import javax.swing.JEditorPane;
import java.awt.ScrollPane;
import java.awt.TextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Scrollbar;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Window.Type;

public class ConsultaArt extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaTicket frame = new ConsultaTicket();
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
	public ConsultaArt() {
		setType(Type.UTILITY);
		setTitle("Consultar Art\u00EDculos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		table = new JTable();
		table.setShowHorizontalLines(false);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Botella de agua", "1,50\u20AC", "30"},
				{"2", "Saco de patatas 5kg", "3\u20AC", "15"},
				{"3", "Tableta de chocolate", "1\u20AC", "30"},
				{"4", "Litro de cerveza", "1,50\u20AC", "20"},
				{"5", "Paquete de Pasta", "0.60\u20AC", "20"},
				{"6", "Paquete de galletas", "2\u20AC", "20"},
			},
			new String[] {
				"Id", "Descripci\u00F3n", "Precio", "Cantidad"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(32);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(42);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(72);
		table.setBounds(44, 83, 314, 96);
		panel.add(table);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setMaximum(50);
		scrollbar.setBounds(360, 81, 17, 98);
		panel.add(scrollbar);
		
		JLabel lblId = new JLabel("Id");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBackground(Color.WHITE);
		lblId.setBounds(44, 50, 41, 30);
		panel.add(lblId);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setBounds(88, 58, 89, 14);
		panel.add(lblDescripcin);
		
		JLabel lblPrecio = new JLabel("Cantidad");
		lblPrecio.setBounds(285, 58, 59, 14);
		panel.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Precio");
		lblCantidad.setBounds(228, 58, 55, 14);
		panel.add(lblCantidad);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(167, 213, 89, 23);
		panel.add(btnVolver);
		
		JLabel lblListaDeArtculos = new JLabel("Lista de Art\u00EDculos");
		lblListaDeArtculos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblListaDeArtculos.setBounds(118, 11, 191, 36);
		panel.add(lblListaDeArtculos);
	}
}
