import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Shopping {
	
	protected JFrame jframe;
	protected JPanel jpanel,jpanel1,jpanel2,jpanel3,jpanel4,jpanel5;
	protected JLabel jlabel,jlabelleft,jlabelsearch,jlabelback,jlabelsignout,jlabelcart;
	protected JLabel product1,product2,product3,product4,product5,product6,product7,product8,product9,product10;
	protected JTextField jtextfield;


	public Shopping() {
		
		
		jframe=new JFrame();
		jpanel=new JPanel();//bg1
		jpanel1=new JPanel();//grid layout button
		jpanel2=new JPanel();//bg2
		jpanel3=new JPanel();//bg3
		jpanel4=new JPanel();//bg3
		jpanel5=new JPanel();//bg4
		jframe.setTitle("Shopping");
		jframe.setSize(new Dimension(1016,638));
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
		
		jlabelsearch = new JLabel("\r\n");
		jlabelsearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//searches for product
			
				//get text from e
				String queryString = jtextfield.getText();

				System.out.println(queryString);

				//search for product
				database producDatabase = new database("products.txt");

				for (String item : producDatabase.getProducts(queryString)){
					System.out.println(item);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		
		jpanel1 = new JPanel();
		jpanel1.setBounds(100, 530, 800, 35);
		jpanel.add(jpanel1);
		jpanel1.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jpanel.setVisible(true);
				jpanel2.setVisible(false);
				jpanel3.setVisible(false);
				jpanel4.setVisible(false);
				jpanel5.setVisible(false);
			}
		});
		jpanel1.add(button);
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jpanel.setVisible(false);
				jpanel2.setVisible(true);
				jpanel3.setVisible(false);
				jpanel4.setVisible(false);
				jpanel5.setVisible(false);
			}
		});
		jpanel1.add(button_1);
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jpanel.setVisible(false);
				jpanel2.setVisible(false);
				jpanel3.setVisible(true);
				jpanel4.setVisible(false);
				jpanel5.setVisible(false);
			}
		});
		jpanel1.add(button_2);
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jpanel.setVisible(false);
				jpanel2.setVisible(false);
				jpanel3.setVisible(false);
				jpanel4.setVisible(true);
				jpanel5.setVisible(false);
			}
		});
		jpanel1.add(button_3);
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jpanel.setVisible(false);
				jpanel2.setVisible(false);
				jpanel3.setVisible(false);
				jpanel4.setVisible(false);
				jpanel5.setVisible(true);
				
			}
		});
		jpanel1.add(button_4);
		
		
		
		jlabelsearch.setBounds(636, 107, 41, 43);
		jpanel.add(jlabelsearch);
		
		jlabelcart = new JLabel("\r\n");
		jlabelcart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new Cart();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		jlabelcart.setBounds(684, 107, 41, 43);
		jpanel.add(jlabelcart);

		jlabelback=new JLabel("");
		jlabelback.setIcon(new ImageIcon(""));
		jlabelback.setBounds(39,40,60,60);
		jlabelback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new Menu();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		jpanel.add(jlabelback);
		
		jlabelsignout=new JLabel("");
		jlabelsignout.setIcon(new ImageIcon(""));
		jlabelsignout.setBounds(802,48,160,43);
		jlabelsignout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				database db = new database("loggedIn.txt");
		        db.clear();
				new LogIn();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		jpanel.add(jlabelsignout);
		
		jtextfield=new JTextField();
		//jtextfield.setOpaque(false);
		jtextfield.setCaretColor(Color.ORANGE);
		jtextfield.setBorder(null);
		jtextfield.setBounds(343,118,243,20);
		jpanel.add(jtextfield);
		
		product1 = new JLabel("");
		product1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SeeDetails();//of this product
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
		
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		product1.setBounds(266, 166, 140, 160);
		jpanel.add(product1);
		
		product2 = new JLabel("");
		product2.setBounds(100, 166, 140, 160);
		jpanel.add(product2);
		
		product3 = new JLabel("");
		product3.setBounds(431, 166, 140, 160);
		jpanel.add(product3);
		
		product4 = new JLabel("");
		product4.setBounds(594, 166, 140, 160);
		jpanel.add(product4);
		
		product5 = new JLabel("");
		product5.setBounds(760, 166, 140, 160);
		jpanel.add(product5);
		
		product6 = new JLabel("");
		product6.setBounds(760, 337, 140, 160);
		jpanel.add(product6);
		
		product7 = new JLabel("");
		product7.setBounds(594, 337, 140, 160);
		jpanel.add(product7);
		
		product8 = new JLabel("");
		product8.setBounds(431, 337, 140, 160);
		jpanel.add(product8);
		
		product9 = new JLabel("");
		product9.setBounds(266, 337, 140, 160);
		jpanel.add(product9);
		
		product10 = new JLabel("");
		product10.setBounds(100, 337, 140, 160);
		jpanel.add(product10);
		
		
		jlabel=new JLabel();
		jlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\Resources\\Shopping1.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		
		
		
	}
}
	
	
