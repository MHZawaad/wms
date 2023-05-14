import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrontPage {
	
	private JFrame jframe;
	private JPanel jpanel;
	private JLabel jlabel,jlabel1;
	public FrontPage() {
		
		
		jframe=new JFrame();
		jframe.setTitle("Welcome!");
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        
        
        jlabel1=new JLabel();
        jlabel1.setFont(new Font("Tahoma", Font.BOLD, 24));
        jlabel1.setForeground(new Color(255, 255, 255));
        jlabel1.setBounds(97,307,400,50);
		jpanel.add(jlabel1);
		
		jlabel=new JLabel(new ImageIcon("res/FrontPage.png"), JLabel.CENTER);
		//jlabel.setSize(1000,600);
		//jlabel.setIcon(new ImageIcon("res/FrontPage.png"));
		//jframe.setBounds(0,0,1016,637); 
		jlabel.setVerticalAlignment(JLabel.BOTTOM);
        jlabel.setBounds(0, 0, 1000, 600);
		jpanel.add(jlabel);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		for(int x=2;x>=0;x--) {
			jlabel1.setText("The program will start in: "+x);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		jframe.dispose();
		new LogIn();
		
		
		
	}
}
