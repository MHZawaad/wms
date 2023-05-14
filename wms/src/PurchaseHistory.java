import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
public class PurchaseHistory {
	
	protected JFrame jframe;
	protected JPanel jpanel;
	protected JLabel jlabel,jlabelsignout;
	protected JLabel product1,product2,product3,product4,product5;
	protected JTextField jtextfield;
	private JTable table;
	private JLabel GoToMenu;


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
  
		
		jlabelsignout=new JLabel("");
		jlabelsignout.setIcon(new ImageIcon(""));
		jlabelsignout.setBounds(801,50,189,44);
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
		
		table = new JTable();
		table.setOpaque(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Product Name", "Price", "Quantity", "ID", "Date"},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setRowMargin(4);
		table.setSurrendersFocusOnKeystroke(true);
		table.setInheritsPopupMenu(true);
		table.setIgnoreRepaint(true);
		table.setEditingRow(5);
		table.setEditingColumn(4);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(null);
		table.setAutoCreateRowSorter(true);
		table.setIntercellSpacing(new Dimension(2, 2));
		table.setBounds(80, 120, 840, 400);
		jpanel.add(table);
		
		GoToMenu = new JLabel("");
		GoToMenu.addMouseListener(new MouseAdapter() {
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
		GoToMenu.setBounds(756, 535, 150, 30);
		jpanel.add(GoToMenu);
		jpanel.add(jlabelsignout);
		
		
		jlabel=new JLabel();
		jlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\bin\\res\\PurchaseHistory.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true); 
		
		
		
	}
}
	
	
