import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Real_Estate {

	private JFrame frmR;
	private JTextField lotnotxt;
	private JTextField firstnametxt;
	private JTextField lastnametxt;
	private JTextField pricetxt;
	private JTextField squartxt;
	private JTextField numboftxt;
	
	int displayedEstate; // how many estate that need to be displayed
	//int displayedEstate1;
//	double disEstatdouble price;
	ArrayList<Estate> estateList; // make a arraylist for Estate class feilds
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Real_Estate window = new Real_Estate();
					window.frmR.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Real_Estate() 
	{
		initialize();
		estateList = new ArrayList<Estate>();// instantiate arraylist
		displayedEstate = 0; // initialization
		//displayedEstate1 = 1;
	//disEstate = 0;
		Estate e1 = new Estate("1", "malith", "karunathilake", 120000, 350, 3); // make a instance as e1 from estateList
		estateList.add(e1);
		
		Estate e2 = new Estate("2", "prabath", "madusanka", 234000, 450, 4); 
		estateList.add(e2);	
		Estate e3 = new Estate("3", "saman", "bandara", 344000, 550, 5); 
		estateList.add(e3);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmR = new JFrame();
		frmR.setTitle("Real Estate Program");
		frmR.getContentPane().setEnabled(false);
		frmR.getContentPane().setBackground(new Color(102, 205, 170));
		frmR.setBounds(100, 100, 487, 582);
		frmR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmR.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lot Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(76, 73, 97, 21);
		frmR.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(157, 73, 105, -23);
		frmR.getContentPane().add(lblNewLabel_1);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstName.setBounds(76, 117, 97, 21);
		frmR.getContentPane().add(lblFirstName);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(76, 165, 97, 21);
		frmR.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Price");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(76, 207, 97, 21);
		frmR.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Square Feet");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(76, 256, 97, 21);
		frmR.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Number of Bedrooms");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(76, 304, 134, 21);
		frmR.getContentPane().add(lblNewLabel_5);
		
		lotnotxt = new JTextField();
		lotnotxt.setBounds(251, 74, 155, 33);
		frmR.getContentPane().add(lotnotxt);
		lotnotxt.setColumns(10);
		
		firstnametxt = new JTextField();
		firstnametxt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		firstnametxt.setBounds(251, 118, 155, 33);
		frmR.getContentPane().add(firstnametxt);
		firstnametxt.setColumns(10);
		
		lastnametxt = new JTextField();
		lastnametxt.setBounds(251, 166, 155, 33);
		frmR.getContentPane().add(lastnametxt);
		lastnametxt.setColumns(10);
		
		pricetxt = new JTextField();
		pricetxt.setBounds(251, 210, 155, 33);
		frmR.getContentPane().add(pricetxt);
		pricetxt.setColumns(10);
		
		squartxt = new JTextField();
		squartxt.setBounds(251, 257, 155, 33);
		frmR.getContentPane().add(squartxt);
		squartxt.setColumns(10);
		
		numboftxt = new JTextField();
		numboftxt.setBounds(251, 305, 155, 33);
		frmR.getContentPane().add(numboftxt);
		numboftxt.setColumns(10);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(76, 375, 114, 39);
		frmR.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(new Color(0, 128, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(76, 425, 114, 39);
		frmR.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setForeground(new Color(0, 128, 128));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(76, 477, 114, 39);
		frmR.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Next");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override

			public void mouseClicked(MouseEvent arg0) {
				
				
			//	Estate est = new Estate();
			//	double a =Double.ToString((est.setPrice(displayedEstate)));
				//String priz=Double.toString( est.getPrice());
				if(displayedEstate>estateList.size()){
	
					
					lotnotxt.setText(estateList.get(displayedEstate++).getLotno());
					firstnametxt.setText(estateList.get(displayedEstate).getFname());
				    lastnametxt.setText(estateList.get(displayedEstate).getLname());
					pricetxt.setText(String.valueOf(estateList.get(displayedEstate).getPrice()));
					squartxt.setText(String.valueOf(estateList.get(displayedEstate).getSquare_feet()));
					numboftxt.setText(String.valueOf(estateList.get(displayedEstate).getNo_of_bedroom()));
					
				
				}
			}
		});
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setForeground(new Color(0, 128, 128));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(208, 375, 114, 39);
		frmR.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_4.setForeground(new Color(0, 128, 128));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setBounds(208, 425, 114, 39);
		frmR.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Find");
		btnNewButton_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton_5.setForeground(new Color(0, 128, 128));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_5.setBounds(208, 477, 114, 39);
		frmR.getContentPane().add(btnNewButton_5);
		
		
	}
}
