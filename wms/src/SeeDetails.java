import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SeeDetails {
	
	protected JFrame jframe;
	protected JPanel jpanel;
	protected JLabel jlabel,jlabel1,jlabel2,jlabel3;



	public SeeDetails() {
		
		
		jframe=new JFrame();
		jframe.setTitle("SeeDetails");
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
       

        jlabel1 = new JLabel("");
    	//total amount
		jlabel1.setBounds(135, 154, 140, 160);
		jpanel.add(jlabel1);
		
		jlabel2 = new JLabel("");
    	//total amount
		jlabel2.setBounds(285, 154, 330, 181);
		jpanel.add(jlabel2);
        
		jlabel3 = new JLabel("");
		jlabel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//adds product to cart
				System.out.println("product added");
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
		jlabel3.setBounds(751, 530, 165, 34);
		jpanel.add(jlabel3);
		
		
		jlabel=new JLabel();
		jlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\bin\\res\\See Details.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		//jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		
		
		
	}
}
	
	
