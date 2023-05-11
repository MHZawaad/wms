
import javax.swing.*;

import utils.validator;

import java.awt.*;
import java.awt.event.*;
public class LogIn {
	
	protected JFrame jframe;
	protected JPanel jpanel;
	protected JLabel jlabel,jlabel1,jlabel2;
	protected JTextField jtextfield;
	protected JPasswordField jpasswordfield;
	private String username, password;
	
	public LogIn() {
		
		
		jframe=new JFrame();
		jframe.setTitle("LogIn");//
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        
       
        
		
		jlabel1 = new JLabel("");
		jlabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new UserType();
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
		jlabel1.setBounds(455, 392, 118, 29);
		jpanel.add(jlabel1);
		
		jlabel2 = new JLabel("");
		jlabel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		            
		            username = jtextfield.getText();
		            password = jpasswordfield.getText();

		            if (new validator().validate(username, password) == false){
		                return;
		            }else {
		                database db = new database("users.txt");
		                if (db.match("username=" + username + ",password=" + password)) {
		                    jframe.dispose();
		                    new Menu();//Menu(username)//
		                    database loggedIn = new database("loggedIn.txt");
		                    loggedIn.add(username);
		                    JOptionPane.showMessageDialog(jframe, "Login successful");
		                    
		                    String type = db.getQueryResult(username, "accountType");
		                    if (type.equals("Merchant")){
		                        new merchantPage(username);
		                    }else if (type.equals("Manufacturer")){
		                        new manufacturerPage();
		                    }
		                } else {
		                    JOptionPane.showMessageDialog(jframe, "Username or password is incorrect");
		                }
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
		jlabel2.setBounds(586, 392, 70, 29);
		jpanel.add(jlabel2);
		
		jtextfield = new JTextField();
		jtextfield.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield.setBorder(null);
		jtextfield.setCaretColor(new Color(30, 144, 255));
		jtextfield.setDisabledTextColor(new Color(240, 240, 240));
		jtextfield.setOpaque(false);
		jtextfield.setBounds(415, 260, 214, 29);
		jpanel.add(jtextfield);
		jtextfield.setColumns(10);
		
		jpasswordfield = new JPasswordField();
		jpasswordfield.setCaretColor(new Color(30, 144, 255));
		jpasswordfield.setBorder(null);
		jpasswordfield.setOpaque(false);
		jpasswordfield.setBounds(415, 331, 214, 29);
		jpanel.add(jpasswordfield);
		

		jlabel=new JLabel();
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\bin\\res\\LogIn.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);


	}
}


	