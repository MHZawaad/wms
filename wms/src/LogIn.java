package wholesalemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LogIn {
	
	protected JFrame jframe;
	protected JPanel jpanel;
	protected JLabel jlabel,jlabel1,jlabel2,jlabelback;
	protected JTextField jtextfield;
	protected JPasswordField jpasswordfield;
	
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
				new SignUp1();
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
		
		jlabelback=new JLabel("");
		jlabelback.setBounds(38,37,63,64);
		jlabelback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
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

		jlabel=new JLabel();
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\WholeSaleManagementSystem\\wholesalemanagementsystem\\Resources\\LogIn.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);


	}
}


	