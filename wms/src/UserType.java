import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UserType {
	
	protected JFrame jframe;
	protected JPanel jpanel;
	protected JLabel jlabel,jlabel1,jlabel2,jlabel3,jlabelback;


	
	public UserType() {
		
		
		jframe=new JFrame();
		jframe.setTitle("SignUp");
		jframe.setSize(new Dimension(1016,638));
		jframe.setLocationRelativeTo(null);
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        jframe.setVisible(true);
        
        
		jlabel2 = new JLabel("");
		jlabel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new SignUp();
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
		jlabel2.setBounds(324, 285, 152, 30);
		jpanel.add(jlabel2);
		
		jlabel3 = new JLabel("");
		jlabel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				//new merchantPage();

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
		jlabel3.setBounds(521, 285, 152, 30);
		jpanel.add(jlabel3);
		
		jlabelback=new JLabel("");
		jlabelback.setIcon(new ImageIcon(""));
		jlabelback.setBounds(36,37,70,67);
		jlabelback.addMouseListener(new MouseAdapter() {
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
		jpanel.add(jlabelback);
		

		
		jlabel=new JLabel();
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("res/TypeChoose.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		
		
	}
}
	
	
