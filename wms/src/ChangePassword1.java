import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class ChangePassword1{
	private JFrame jframe;
	private JPanel jpanel;
	private JLabel jlabel,jlabel1;

	public ChangePassword1() {
		
		jframe=new JFrame();
		jframe.setTitle("ChangePassword");
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
		jlabel1.setBounds(425, 286, 151, 30);
		jpanel.add(jlabel1);

		
		jlabel=new JLabel();
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("res/ChangePassword1.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		
	}

}
