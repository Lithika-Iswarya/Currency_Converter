import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CurCon1 extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurCon1 frame = new CurCon1();
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
	public CurCon1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 614);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CURRENCY CONVERTER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD, 25));
		lblNewLabel.setBounds(69, 36, 376, 69);
		contentPane.add(lblNewLabel);
		
		JLabel l1 = new JLabel("Enter the Amount");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l1.setBounds(69, 156, 160, 34);
		contentPane.add(l1);
		
		t1 = new JTextField();
		t1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isLetter(c))
				{
					t1.setEditable(false);
					t1.setText("Please Enter Numbers Only");
				}
				else
				{
					t1.setEditable(true);
				}
			}
		});
		t1.setBounds(306, 156, 160, 34);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel l2 = new JLabel("Convert From");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l2.setBounds(69, 250, 160, 19);
		contentPane.add(l2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Indian Rupee", "United States Dollar", "Euro", "Canadian Dollar", "Japanese Yen", "Chinese Yen", "Bitcoin"}));
		cb1.setBounds(306, 242, 160, 34);
		contentPane.add(cb1);
		
		JLabel l3 = new JLabel("Convert To");
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l3.setBounds(80, 324, 117, 34);
		contentPane.add(l3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Indian Rupee", "United States Dollar", "Euro", "Canadian Dollar", "Japanese Yen", "Chinese Yen", "Bitcoin"}));
		cb2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cb2.setBounds(306, 324, 160, 34);
		contentPane.add(cb2);
		
		JButton b1 = new JButton("Convert");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double convert;
				Double amount=Double.parseDouble(t1.getText());
				
				//USD
				if(cb1.getSelectedItem().toString() == "United States Dollar" && cb2.getSelectedItem().toString() == "Indian Rupee" )
				{
					convert = amount*82.743;
					textField.setText(convert+" INR");
				}
				else if(cb1.getSelectedItem().toString() == "United States Dollar" && cb2.getSelectedItem().toString() == "Euro" )
				{
					convert = amount*0.943;
					textField.setText(convert+" EUR");
				}
				else if(cb1.getSelectedItem().toString() == "United States Dollar" && cb2.getSelectedItem().toString() == "Canadian Dollar" )
				{
					convert = amount*1.351;
					textField.setText(convert+" CAD");
				}
				else if(cb1.getSelectedItem().toString() == "United States Dollar" && cb2.getSelectedItem().toString() == "Japanese Yen" )
				{
					convert = amount*132.440;
					textField.setText(convert+" JPY");
				}
				else if(cb1.getSelectedItem().toString() == "United States Dollar" && cb2.getSelectedItem().toString() == "Chinese Yen" )
				{
					convert = amount*6.871;
					textField.setText(convert+" CNY");
				}
				else if(cb1.getSelectedItem().toString() == "United States Dollar" && cb2.getSelectedItem().toString() == "Bitcoin" )
				{
					convert = amount*0.0000594;
					textField.setText(convert+" BTC");
				}
				else if(cb1.getSelectedItem().toString() == "United States Dollar" && cb2.getSelectedItem().toString() == "United States Dollar" )
				{
					convert = amount*1;
					textField.setText(convert+" USD");
				}
				
				//INR
				else if(cb1.getSelectedItem().toString() == "Indian Rupee" && cb2.getSelectedItem().toString() == "United States Dollar" )
				{
					convert = amount*0.0120;
					textField.setText(convert+" USD");
				}
				else if(cb1.getSelectedItem().toString() == "Indian Rupee" && cb2.getSelectedItem().toString() == "Euro" )
				{
					convert = amount*0.01139;
					textField.setText(convert+" EUR");
				}
				else if(cb1.getSelectedItem().toString() == "Indian Rupee" && cb2.getSelectedItem().toString() == "Canadian Dollar" )
				{
					convert = amount*0.0163;
					textField.setText(convert+" CAD");
				}
				else if(cb1.getSelectedItem().toString() == "Indian Rupee" && cb2.getSelectedItem().toString() == "Japanese Yen" )
				{
					convert = amount*1.6012;
					textField.setText(convert+" JPY");
				}
				else if(cb1.getSelectedItem().toString() == "Indian Rupee" && cb2.getSelectedItem().toString() == "Chinese Yen" )
				{
					convert = amount*0.083;
					textField.setText(convert+" CNY");
				}
				else if(cb1.getSelectedItem().toString() == "Indian Rupee" && cb2.getSelectedItem().toString() == "Bitcoin" )
				{
					convert = amount*0.000000726;
					textField.setText(convert+" BTC");
				}
				else if(cb1.getSelectedItem().toString() == "Indian Rupee" && cb2.getSelectedItem().toString() == "Indian Rupee" )
				{
					convert = amount*1;
					textField.setText(convert+" INR");
				}
				
				//EUR
				else if(cb1.getSelectedItem().toString() == "Euro" && cb2.getSelectedItem().toString() == "United States Dollar" )
				{
					convert = amount*1.06057;
					textField.setText(convert+" USD");
				}
				else if(cb1.getSelectedItem().toString() == "Euro" && cb2.getSelectedItem().toString() == "Indian Rupee" )
				{
					convert = amount*87.74738;
					textField.setText(convert+" INR");
				}
				else if(cb1.getSelectedItem().toString() == "Euro" && cb2.getSelectedItem().toString() == "Canadian Dollar" )
				{
					convert = amount*1.4336;
					textField.setText(convert+" CAD");
				}
				else if(cb1.getSelectedItem().toString() == "Euro" && cb2.getSelectedItem().toString() == "Japanese Yen" )
				{
					convert = amount*140.5083;
					textField.setText(convert+" JPY");
				}
				else if(cb1.getSelectedItem().toString() == "Euro" && cb2.getSelectedItem().toString() == "Chinese Yen" )
				{
					convert = amount*7.2925;
					textField.setText(convert+" CNY");
				}
				else if(cb1.getSelectedItem().toString() == "Euro" && cb2.getSelectedItem().toString() == "Bitcoin" )
				{
					convert = amount*0.0000630;
					textField.setText(convert+" BTC");
				}
				else if(cb1.getSelectedItem().toString() == "Euro" && cb2.getSelectedItem().toString() == "Euro" )
				{
					convert = amount*1;
					textField.setText(convert+" EUR");
				}
				
				//CAD
				else if(cb1.getSelectedItem().toString() == "Canadian Dollar" && cb2.getSelectedItem().toString() == "United States Dollar" )
				{
					convert = amount*0.7397;
					textField.setText(convert+" USD");
				}
				else if(cb1.getSelectedItem().toString() == "Canadian Dollar" && cb2.getSelectedItem().toString() == "Indian Rupee" )
				{
					convert = amount*61.2043;
					textField.setText(convert+" INR");
				}
				else if(cb1.getSelectedItem().toString() == "Canadian Dollar" && cb2.getSelectedItem().toString() == "Euro" )
				{
					convert = amount*0.6975;
					textField.setText(convert+" EUR");
				}
				else if(cb1.getSelectedItem().toString() == "Canadian Dollar" && cb2.getSelectedItem().toString() == "Japanese Yen" )
				{
					convert = amount*98.0054;
					textField.setText(convert+" JPY");
				}
				else if(cb1.getSelectedItem().toString() == "Canadian Dollar" && cb2.getSelectedItem().toString() == "Chinese Yen" )
				{
					convert = amount*5.0865;
					textField.setText(convert+" CNY");
				}
				else if(cb1.getSelectedItem().toString() == "Canadian Dollar" && cb2.getSelectedItem().toString() == "Bitcoin" )
				{
					convert = amount*0.0000439;
					textField.setText(convert+" BTC");
				}
				else if(cb1.getSelectedItem().toString() == "Canadian Dollar" && cb2.getSelectedItem().toString() == "Canadian Dollar" )
				{
					convert = amount*1;
					textField.setText(convert+" CAD");
				}
				
				//JPY
				else if(cb1.getSelectedItem().toString() == "Japanese Yen" && cb2.getSelectedItem().toString() == "United States Dollar" )
				{
					convert = amount*0.00754;
					textField.setText(convert+" USD");
				}
				else if(cb1.getSelectedItem().toString() == "Japanese Yen" && cb2.getSelectedItem().toString() == "Indian Rupee" )
				{
					convert = amount*0.6244;
					textField.setText(convert+" INR");
				}
				else if(cb1.getSelectedItem().toString() == "Japanese Yen" && cb2.getSelectedItem().toString() == "Euro" )
				{
					convert = amount*0.00711;
					textField.setText(convert+" EUR");
				}
				else if(cb1.getSelectedItem().toString() == "Japanese Yen" && cb2.getSelectedItem().toString() == "Canadian Dollar" )
				{
					convert = amount*0.01020;
					textField.setText(convert+" CAD");
				}
				else if(cb1.getSelectedItem().toString() == "Japanese Yen" && cb2.getSelectedItem().toString() == "Chinese Yen" )
				{
					convert = amount*0.051900;
					textField.setText(convert+" CNY");
				}
				else if(cb1.getSelectedItem().toString() == "Japanese Yen" && cb2.getSelectedItem().toString() == "Bitcoin" )
				{
					convert = amount*0.0000000453;
					textField.setText(convert+" BTC");
				}
				else if(cb1.getSelectedItem().toString() == "Japanese Yen" && cb2.getSelectedItem().toString() == "Japanese Yen" )
				{
					convert = amount*1;
					textField.setText(convert+" JPY");
				}
				
				//CNY
				else if(cb1.getSelectedItem().toString() == "Chinese Yen" && cb2.getSelectedItem().toString() == "United States Dollar" )
				{
					convert = amount*0.1454;
					textField.setText(convert+" USD");
				}
				else if(cb1.getSelectedItem().toString() == "Chinese Yen" && cb2.getSelectedItem().toString() == "Indian Rupee" )
				{
					convert = amount*12.0325;
					textField.setText(convert+" INR");
				}
				else if(cb1.getSelectedItem().toString() == "Chinese Yen" && cb2.getSelectedItem().toString() == "Euro" )
				{
					convert = amount*0.13712;
					textField.setText(convert+" EUR");
				}
				else if(cb1.getSelectedItem().toString() == "Chinese Yen" && cb2.getSelectedItem().toString() == "Canadian Dollar" )
				{
					convert = amount*0.19659;
					textField.setText(convert+" CAD");
				}
				else if(cb1.getSelectedItem().toString() == "Chinese Yen" && cb2.getSelectedItem().toString() == "Japanese Yen" )
				{
					convert = amount*19.26750;
					textField.setText(convert+" JPY");
				}
				else if(cb1.getSelectedItem().toString() == "Chinese Yen" && cb2.getSelectedItem().toString() == "Bitcoin" )
				{
					convert = amount*0.000008646;
					textField.setText(convert+" BTC");
				}
				else if(cb1.getSelectedItem().toString() == "Chinese Yen" && cb2.getSelectedItem().toString() == "Chinese Yen" )
				{
					convert = amount*1;
					textField.setText(convert+" CNY");
				}
				
				//BTC
				else if(cb1.getSelectedItem().toString() == "Bitcoin" && cb2.getSelectedItem().toString() == "United States Dollar" )
				{
					convert = amount*16820.845;
					textField.setText(convert+" USD");
				}
				else if(cb1.getSelectedItem().toString() == "Bitcoin" && cb2.getSelectedItem().toString() == "Indian Rupee" )
				{
					convert = amount*1391685.7254;
					textField.setText(convert+" INR");
				}
				else if(cb1.getSelectedItem().toString() == "Bitcoin" && cb2.getSelectedItem().toString() == "Euro" )
				{
					convert = amount*15860.1393;
					textField.setText(convert+" EUR");
				}
				else if(cb1.getSelectedItem().toString() == "Bitcoin" && cb2.getSelectedItem().toString() == "Canadian Dollar" )
				{
					convert = amount*22738.3511;
					textField.setText(convert+" CAD");
				}
				else if(cb1.getSelectedItem().toString() == "Bitcoin" && cb2.getSelectedItem().toString() == "Japanese Yen" )
				{
					convert = amount*222848.3907;
					textField.setText(convert+" JPY");
				}
				else if(cb1.getSelectedItem().toString() == "Bitcoin" && cb2.getSelectedItem().toString() == "Chinese yen" )
				{
					convert = amount*115660.1311;
					textField.setText(convert+" CNY");
				}
				else if(cb1.getSelectedItem().toString() == "Bitcoin" && cb2.getSelectedItem().toString() == "Bitcoin" )
				{
					convert = amount*1;
					textField.setText(convert+" BTC");
				}
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b1.setHorizontalTextPosition(SwingConstants.CENTER);
		b1.setBounds(189, 418, 117, 34);
		contentPane.add(b1);
		
		JLabel lblNewLabel_1 = new JLabel("Result");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(92, 500, 82, 34);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textField.setColumns(10);
		textField.setBounds(306, 503, 160, 34);
		contentPane.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\background-images-with-currency-in-1024-x-1024-pi-upscaled.png"));
		lblNewLabel_2.setBounds(0, 0, 1020, 567);
		contentPane.add(lblNewLabel_2);
	}
}
