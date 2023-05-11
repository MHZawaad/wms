
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
        jframe.setVisible(true);

        jlabel1 = new JLabel("image");
    	//total amount
		jlabel1.setBounds(145, 200, 178, 199);
		jpanel.add(jlabel1);
		
		jlabel2 = new JLabel("details");
    	//total amount
		jlabel2.setBounds(371, 203, 330, 181);
		jpanel.add(jlabel2);
        
		jlabel3 = new JLabel("");
		jlabel3.addMouseListener(new MouseAdapter() {
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
		jlabel3.setBounds(342, 430, 150, 29);
		jpanel.add(jlabel3);
		
		
		jlabel=new JLabel();
		jlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\WholeSaleManagementSystem\\wholesalemanagementsystem\\Resources\\See Details.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		
		
		
	}
}
	
	
