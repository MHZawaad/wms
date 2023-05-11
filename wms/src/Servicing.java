

import javax.swing.*;



import java.awt.*;
import java.awt.event.*;


public class Servicing{
	private JFrame jframe;
	private JPanel jpanel;
	private JLabel jlabel,jlabel1,jlabelback,jlabelsignout;
	private JTextField jtextfield,jtextfield1,jtextfield2;

	Servicing(){
		jframe=new JFrame();
		jframe.setTitle("Servicing");
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        jframe.setVisible(true);
        
        
		jtextfield=new JTextField();
		jtextfield.setCaretColor(new Color(30, 144, 255));
		jtextfield.setBorder(null);
		jtextfield.setFont(new Font("Tahoma", Font.PLAIN, 11));
		jtextfield.setBounds(190,224,275,30);
		jpanel.add(jtextfield);
		jtextfield1=new JTextField();//date of purchase
		jtextfield1.setCaretColor(new Color(30, 144, 255));
		jtextfield1.setBorder(null);
		jtextfield1.setBounds(190,277,275,30);
		jpanel.add(jtextfield1);
		jtextfield2=new JTextField();//product details
		jtextfield2.setCaretColor(new Color(30, 144, 255));
		jtextfield2.setBorder(null);
		 jtextfield2.setBounds(190,329,275,70);
		jpanel.add(jtextfield2);
		
		
		jlabel1 = new JLabel("");
		jlabel1.addMouseListener(new MouseAdapter() {
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
		jlabel1.setBounds(183, 441, 282, 39);
		jpanel.add(jlabel1);

		jlabelback=new JLabel("");
		jlabelback.setIcon(new ImageIcon(""));
		jlabelback.setBounds(40,39,64,62);
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
		
		jlabelsignout=new JLabel("");
		jlabelsignout.setIcon(new ImageIcon(""));
		jlabelsignout.setBounds(803,47,161,45);
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
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\bin\\res\\Servicing.png"));
		jpanel.add(jlabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setDropMode(DropMode.ON);
		textArea.setRows(4);
		textArea.setBounds(190, 329, 275, 70);
		jpanel.add(textArea);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
				
		
	}
}
