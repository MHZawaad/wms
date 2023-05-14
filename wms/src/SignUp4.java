
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignUp4 {
	
	protected JFrame jframe;
	protected JPanel jpanel;
	protected JLabel jlabel,jlabel1,jlabel2,jlabelback;


	
	public SignUp4() {
		
		
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
		jlabel2.setBounds(424, 285, 152, 30);
		jpanel.add(jlabel2);
		
		

		
		jlabel=new JLabel();
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("res/SignUp4.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		
		
	}
}
	
	
