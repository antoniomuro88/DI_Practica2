package Practica2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Canvas;

public class Seguro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seguro frame = new Seguro();
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
	public Seguro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Seguro.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-warning.png")));
		setAlwaysOnTop(true);
		setResizable(false);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("\u00BFEst\u00E1 seguro?");
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(20, 88, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(148, 88, 89, 23);
		panel.add(btnCancelar);
		
		JEditorPane dtrpnAsdasdAsdaa = new JEditorPane();
		dtrpnAsdasdAsdaa.setBackground(SystemColor.control);
		dtrpnAsdasdAsdaa.setEditable(false);
		dtrpnAsdasdAsdaa.setText("Si pulsa el bot\u00F3n \"Aceptar\" el registro\r\n    se borrar\u00E1 permanentemente");
		dtrpnAsdasdAsdaa.setBounds(25, 28, 238, 62);
		panel.add(dtrpnAsdasdAsdaa);
	}
}
