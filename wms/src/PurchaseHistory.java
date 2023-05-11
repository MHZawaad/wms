
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PurchaseHistory {
	
	protected JFrame jframe;
	protected JPanel jpanel;
	protected JLabel jlabel,jlabelback,jlabelsignout;
	protected JLabel product1,product2,product3,product4,product5;
	protected JTextField jtextfield;


	public PurchaseHistory() {
		
		
		jframe=new JFrame();
		jframe.setTitle("PurchaseHistory");
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        jframe.setVisible(true);

		jlabelback=new JLabel("Back");
		jlabelback.setIcon(new ImageIcon(""));
		jlabelback.setBounds(40,70,70,70);
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
		
		jlabelsignout=new JLabel("SignOut");
		jlabelsignout.setIcon(new ImageIcon(""));
		jlabelsignout.setBounds(869,70,70,70);
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
		jlabel.setIcon(new ImageIcon("E:\\Git\\WholeSaleManagementSystem\\wholesalemanagementsystem\\Resources\\PurchaseHistory.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true); 
		
		
		
	}
}
	
	
