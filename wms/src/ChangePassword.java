package wholesalemanagementsystem;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import wholesalemanagementsystem.Menu;

public class ChangePassword{
	private JFrame jframe;
	private JPanel jpanel;
	private JLabel jlabel,jlabel1,jlabelback,jlabelsignout;
	private JTextField jtextfield,jtextfield1,jtextfield2;
	public ChangePassword() {
		
		jframe=new JFrame();
		jframe.setTitle("ChangePassword");
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        jframe.setVisible(true);
   
	    jtextfield= new JTextField();
	    jtextfield.setAlignmentY(1.0f);
	    jtextfield.setAlignmentX(1.0f);
	    jtextfield.setBorder(null);
	    jtextfield.setCaretColor(new Color(30, 144, 255));
	    jtextfield.setFont(new Font("Tahoma", Font.BOLD, 11));
	    jtextfield.setBounds(458,257,154,26);
	    jpanel.add(jtextfield);
	    jtextfield1= new JTextField();//new password
	    jtextfield1.setCaretColor(new Color(30, 144, 255));
	    jtextfield1.setBorder(null);
	    jtextfield1.setFont(new Font("Tahoma", Font.BOLD, 11));
	    jtextfield1.setBounds(458,297,154,26);
	    jpanel.add(jtextfield1);
	    jtextfield2= new JTextField();
	    jtextfield2.setBorder(null);
	    jtextfield2.setCaretColor(new Color(30, 144, 255));
	    jtextfield2.setFont(new Font("Tahoma", Font.BOLD, 11));
	    jtextfield2.setBounds(458,337,154,26);
	    jpanel.add(jtextfield2);
	    
	    

		jlabel1 = new JLabel("");
		jlabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new PurchaseHistory();
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
		jlabel1.setBounds(452, 404, 175, 32);
		jpanel.add(jlabel1);

		jlabelback=new JLabel("");
		jlabelback.setIcon(new ImageIcon(""));
		jlabelback.setBounds(38,36,64,69);
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
		jlabelsignout.setBounds(799,47,162,47);
		jlabelsignout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
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
		
		
		jlabel=new JLabel();
		jlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\WholeSaleManagementSystem\\wholesalemanagementsystem\\Resources\\ChangePassword.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		
	}

}
