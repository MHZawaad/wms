import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
public class Cart {
	
	protected JFrame jframe;
	protected JPanel jpanel;
	protected JLabel jlabel,jlabel2,jlabelback,jlabelsignout;
	protected JLabel product1,product2,product3,product4,product5;
	protected JTextField jtextfield;
	private JTable table;


	public Cart() {
		
		
		jframe=new JFrame();
		jframe.setTitle("Cart");
		jframe.setSize(new Dimension(1016,638));
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
		
		JButton btnNewButton_1_1 = new JButton("remove");
		btnNewButton_1_1.setBounds(878, 133, 82, 23);
		jpanel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBounds(827, 133, 41, 23);
		jpanel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.setBounds(776, 133, 41, 23);
		jpanel.add(btnNewButton);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Price", "Quantity"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.setSurrendersFocusOnKeystroke(true);
		table.setRowMargin(4);
		table.setOpaque(false);
		table.setIntercellSpacing(new Dimension(2, 2));
		table.setInheritsPopupMenu(true);
		table.setIgnoreRepaint(true);
		table.setEditingRow(5);
		table.setEditingColumn(4);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(null);
		table.setAutoCreateRowSorter(true);
		table.setBounds(50, 120, 716, 400);
		jpanel.add(table);
		jlabel2.setBounds(426, 527, 153, 40);
		jpanel.add(jlabel2);

		jlabelback=new JLabel("");
		jlabelback.setIcon(new ImageIcon(""));
		jlabelback.setBounds(42,41,59,60);
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
		jlabelsignout.setBounds(802,51,158,40);
		jlabelsignout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				database db = new database("loggedIn.txt");
		        db.clear();
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
		jlabel.setIcon(new ImageIcon("res/Cart.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		
		
		
		
	}
}
	
	
