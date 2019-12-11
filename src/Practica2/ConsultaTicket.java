package Practica2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Scrollbar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;


public class ConsultaTicket extends JFrame {

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
					ConsultaArt frame = new ConsultaArt();
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
	public ConsultaTicket() {
		setType(Type.UTILITY);
		setTitle("Consultar Tickets");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 338);
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
				{"01/12/2019", "Botella de agua", "3", "4,5\u20AC"},
				{null, "Paquete de pasta", "1", "0,60\u20AC"},
				{null, "--Total--", null, "5,10\u20AC"},
				{null, null, null, null},
				{"05/12/2019", "Saco de patatas 5kg", "1", "3\u20AC"},
				{null, "Tableta de chocolate", "2", "2\u20AC"},
				{null, "--Total--", "", "5\u20AC"},
				{null, null, null, null},
				{"08/12/2019", "Litro de cerveza", "2", "1,50\u20AC"},
				{null, "Paquete de galletas", "2", "4\u20AC"},
				{null, "--Total--", null, "5,50\u20AC"},
				{null, null, null, null},
			},
			new String[] {
				"Fecha", "Descripci\u00F3n", "Cantidad", "Total"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(87);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(58);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(48);
		table.setBounds(44, 61, 323, 187);
		panel.add(table);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(368, 83, 17, 171);
		panel.add(scrollbar);
		
		JLabel lblId = new JLabel("Fecha");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBackground(Color.WHITE);
		lblId.setBounds(58, 36, 41, 30);
		panel.add(lblId);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setBounds(147, 45, 89, 14);
		panel.add(lblDescripcin);
		
		JLabel lblPrecio = new JLabel("Total");
		lblPrecio.setBounds(321, 44, 41, 14);
		panel.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(259, 43, 55, 14);
		panel.add(lblCantidad);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(154, 265, 89, 23);
		panel.add(btnVolver);
		
		JLabel lblListaDeArtculos = new JLabel("Lista de Tickets");
		lblListaDeArtculos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblListaDeArtculos.setBounds(132, 6, 191, 36);
		panel.add(lblListaDeArtculos);
	}
}
