import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import utils.*;

public class ChangePassword extends JFrame{
	private JPanel jpanel;
	private JLabel jlabel,jlabel1,jlabelback,jlabelsignout;
	private JTextField jtextfield,jtextfield1,jtextfield2;
	public ChangePassword() {
		
		setTitle("ChangePassword");
		setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().add(jpanel);
		jpanel.setLayout(null);
        setResizable(false);
        setExtendedState(MAXIMIZED_HORIZ);
      
   
	    jtextfield= new JTextField();
	    jtextfield.setAlignmentY(1.0f);
	    jtextfield.setAlignmentX(1.0f);
	    jtextfield.setBorder(null);
	    jtextfield.setCaretColor(new Color(30, 144, 255));
	    jtextfield.setFont(new Font("Tahoma", Font.BOLD, 11));
	    jtextfield.setBounds(412,274,175,26);
	    jpanel.add(jtextfield);
	    jtextfield1= new JTextField();//new password
	    jtextfield1.setCaretColor(new Color(30, 144, 255));
	    jtextfield1.setBorder(null);
	    jtextfield1.setFont(new Font("Tahoma", Font.BOLD, 11));
	    jtextfield1.setBounds(412,317,175,24);
	    jpanel.add(jtextfield1);
	    jtextfield2= new JTextField();
	    jtextfield2.setBorder(null);
	    jtextfield2.setCaretColor(new Color(30, 144, 255));
	    jtextfield2.setFont(new Font("Tahoma", Font.BOLD, 11));
	    jtextfield2.setBounds(412,358,175,24);
	    jpanel.add(jtextfield2);
	    
	    

		jlabel1 = new JLabel("");//sets password
		jlabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String oldPassword = jtextfield.getText();
				String newPassword = jtextfield1.getText();
				String newPasswordConfirm = jtextfield2.getText();

				System.out.println(oldPassword + "|" + newPassword + "|" + newPasswordConfirm);

				validator val = new validator();

				if (!val.validatePassword(oldPassword)) {
					return;
				}

				if(!val.validatePassword(newPassword)){
					return;
				}

				if(!val.validatePassword(newPasswordConfirm)){
					return;
				}

				if (!newPassword.equals(newPasswordConfirm)){
					JOptionPane.showMessageDialog(null, "Passwords do not match");

					return;
				}

				database db = new database("users.txt");

				String oldPassword_db = db.getQueryResult(Main.USERNAME, "password");

				if (!oldPassword.equals(oldPassword_db)){
					JOptionPane.showMessageDialog(null, "Old password is incorrect");
					return;
				}

				db.update(Main.USERNAME, "password", newPassword);

				dispose();
				new ChangePassword1();
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
		jlabel1.setBounds(412, 426, 175, 32);
		jpanel.add(jlabel1);

		jlabelback=new JLabel("");
		jlabelback.setIcon(new ImageIcon(""));
		jlabelback.setBounds(38,36,64,69);
		jlabelback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
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
				dispose();
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
		
		
		jlabel=new JLabel();
		jlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\Resources\\ChangePassword.png"));
		jpanel.add(jlabel);
		setBounds(0,0,1016,637);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

}
