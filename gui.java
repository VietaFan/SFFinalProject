import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JComboBox;

public class Display1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display1 window = new Display1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Display1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.setBounds(100, 100, 816, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(0, 0, 800, 129);
		
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\User1\\Desktop\\2016CodingCompSolution\\src\\main\\java\\FinalProject\\SFlogo.jpg").getImage().getScaledInstance(frame.getWidth(), frame.getHeight()/3, Image.SCALE_DEFAULT));
		frame.getContentPane().setLayout(null);
		lblNewLabel.setIcon(imageIcon);
		
		
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Product");
		lblNewLabel_1.setBounds(20, 233, 70, 68);
		frame.getContentPane().add(lblNewLabel_1, BorderLayout.WEST);
		
		JLabel lblNewLabel_2 = new JLabel("Language");
		lblNewLabel_2.setBounds(20, 312, 169, 21);
		frame.getContentPane().add(lblNewLabel_2, BorderLayout.SOUTH);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(20, 377, 46, 14);
		frame.getContentPane().add(lblState);
		
		JLabel lblSearchForAn = new JLabel("Search for an Agent");
		lblSearchForAn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearchForAn.setBounds(337, 140, 144, 30);
		frame.getContentPane().add(lblSearchForAn);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(370, 465, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JSlider slider = new JSlider();
		slider.setBounds(466, 254, 200, 23);
		frame.getContentPane().add(slider);
		
		JSlider slider_1 = new JSlider();
		slider_1.setBounds(466, 310, 200, 23);
		frame.getContentPane().add(slider_1);
		
		JSlider slider_2 = new JSlider();
		slider_2.setBounds(466, 368, 200, 23);
		frame.getContentPane().add(slider_2);
		
		JLabel lblCriteria = new JLabel("Criteria");
		lblCriteria.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCriteria.setBounds(134, 193, 55, 14);
		frame.getContentPane().add(lblCriteria);
		
		JLabel lblWeighting = new JLabel("Weighting");
		lblWeighting.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWeighting.setBounds(540, 193, 86, 14);
		frame.getContentPane().add(lblWeighting);
		
		
		String[] Products = {"BANK",
			      "LIFE",
			      "AUTO",
			      "ANNUITIES",
			      "HEALTH",
			      "HOME_AND_PROPERTY",
			      "MUTUAL_FUNDS"}; 
		String[] Languages = { "English", "Spanish", "French", "Italian"}; 
		String[] State = { "English", "Spanish", "French", "Italian"}; 
		

		
		JComboBox comboBox = new JComboBox(Products);
		comboBox.setBounds(125, 257, 118, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(125, 312, 118, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(125, 371, 118, 20);
		frame.getContentPane().add(comboBox_2);
		
	}
}
