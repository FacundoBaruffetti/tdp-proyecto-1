package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.Calendar;
import java.util.GregorianCalendar;
import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel label;
	private JLabel lblNewLabel_5;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 271));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(420
				, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		JLabel lblNewLabel = new JLabel("LU");
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		
		JLabel lblNewLabel_3 = new JLabel("E- mail");
		
		JLabel lblNewLabel_4 = new JLabel("Github URL");
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setText(String.valueOf(studentData.getId()));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setText(studentData.getLastName());
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setText(studentData.getFirstName());
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setText(studentData.getMail());
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setText(studentData.getGithubURL());
		
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_tabInformation.createSequentialGroup()
								.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
									.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED))
							.addGroup(gl_tabInformation.createSequentialGroup()
								.addComponent(lblNewLabel_1)
								.addGap(13)))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(13)))
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textField_2, Alignment.LEADING)
						.addComponent(textField_1, Alignment.LEADING)
						.addComponent(textField_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
						.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
						.addComponent(textField_4, Alignment.LEADING))
					.addGap(134))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane, BorderLayout.WEST);
		
		label = new JLabel("");
		
		ImageIcon ico = new ImageIcon(getClass().getResource("/images/5b33c645-825b-4f77-9cd1-062bc5e69ea7.jpg"));
		ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
		
		label.setIcon(img);
		contentPane.add(label, BorderLayout.CENTER);
		
		Calendar fecha = new GregorianCalendar();
		String año = Integer.toString(fecha.get(Calendar.YEAR));
		String mes = Integer.toString(fecha.get(Calendar.MONTH)+1);
		String dia = Integer.toString(fecha.get(Calendar.DATE));
		String FC = dia+"/"+mes+"/"+año;
		String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
		String mins = Integer.toString(fecha.get(Calendar.MINUTE));
		String secs = Integer.toString(fecha.get(Calendar.SECOND));
		String HC = hora+":"+mins+":"+secs;
		lblNewLabel_5 = new JLabel("Esta ventana fue generada el "+FC+" a las "+HC);
		contentPane.add(lblNewLabel_5, BorderLayout.SOUTH);
	}
}

