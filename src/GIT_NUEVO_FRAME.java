import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class GIT_NUEVO_FRAME extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtHola;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GIT_NUEVO_FRAME frame = new GIT_NUEVO_FRAME();
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
	public GIT_NUEVO_FRAME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//CambioMaster
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(186, 45, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		//Cambio 1
		textField_1 = new JTextField();
		textField_1.setBounds(186, 88, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtHola = new JTextField();
		txtHola.setText("Hola");
		txtHola.setBounds(186, 126, 86, 20);
		contentPane.add(txtHola);
		txtHola.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(55, 185, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(183, 185, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
