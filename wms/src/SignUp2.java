
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignUp2 {
	
	protected JFrame jframe;
	protected JPanel jpanel;
	protected JLabel jlabel,jlabel1,jlabelback;
	protected JTextField jtextfield,jtextfield1,jtextfield2;

	
	public SignUp2() {
		
		
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
		
        jlabel1 = new JLabel("");
		jlabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new SignUp3();
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
		jlabel1.setBounds(435, 432, 131, 34);
		jpanel.add(jlabel1);
		
		jlabelback=new JLabel("");
		jlabelback.setBounds(37,38,67,64);
		jlabelback.addMouseListener(new MouseAdapter() {
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
		jpanel.add(jlabelback);

		jtextfield = new JTextField();
		jtextfield.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield.setCaretColor(new Color(30, 144, 255));
		jtextfield.setBorder(null);
		jtextfield.setOpaque(false);
		jtextfield.setBounds(401, 267, 194, 20);
		jpanel.add(jtextfield);
		jtextfield.setColumns(10);
		
		jtextfield1 = new JTextField();
		jtextfield1.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield1.setOpaque(false);
		jtextfield1.setBorder(null);
		jtextfield1.setBounds(401, 324, 194, 20);
		jpanel.add(jtextfield1);
		jtextfield1.setColumns(10);
		
		jtextfield2 = new JTextField();
		jtextfield2.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield2.setOpaque(false);
		jtextfield2.setCaretColor(new Color(30, 144, 255));
		jtextfield2.setBorder(null);
		jtextfield2.setBounds(401, 381, 194, 20);
		jpanel.add(jtextfield2);
		jtextfield2.setColumns(10);
		
		jlabel=new JLabel();
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\bin\\res\\SignUp2.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		
		
	}
}
	
	
