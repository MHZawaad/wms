import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Shopping extends JFrame {
	
	private JLabel jlabelsearch,jlabelcart,jlabelback,jlabelsignout;
	private JTextField jtextfield;
	private JLabel jlabelimage;
    public Shopping() {
    	
		setTitle("Shopping");
		setSize(new Dimension(1016,638));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setExtendedState(JFrame.MAXIMIZED_HORIZ);

        JPanel panel = new JPanel();
        panel.setLayout(null); // Set panel layout to null for manual positioning

        List<Rectangle> labelBounds = new ArrayList<>();
        labelBounds.add(new Rectangle(266, 166, 140, 160));
        labelBounds.add(new Rectangle(100, 166, 140, 160));
        labelBounds.add(new Rectangle(431, 166, 140, 160));
        labelBounds.add(new Rectangle(594, 166, 140, 160));
        labelBounds.add(new Rectangle(760, 166, 140, 160));
        labelBounds.add(new Rectangle(760, 337, 140, 160));
        labelBounds.add(new Rectangle(594, 337, 140, 160));
        labelBounds.add(new Rectangle(431, 337, 140, 160));
        labelBounds.add(new Rectangle(266, 337, 140, 160));
        labelBounds.add(new Rectangle(100, 337, 140, 160));

        for (int i = 0; i < labelBounds.size(); i++) {
            Rectangle bounds = labelBounds.get(i);

            JLabel label = new JLabel("Product " + (i + 1));
            label.setBounds(bounds);

            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.println(label.getText() + " clicked!");
                }
            });

            panel.add(label);
        

        }
        
        jlabelsearch = new JLabel("\r\n");
		jlabelsearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//searches for product
			
				//get text from e
				String queryString = jtextfield.getText();

				System.out.println(queryString);

				//search for product
				database producDatabase = new database("products.txt");

				for (String item : producDatabase.getProducts(queryString)){
					System.out.println(item);
				}
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
		jlabelsearch.setBounds(636, 107, 41, 43);
		panel.add(jlabelsearch);
		
		


		
		
		
		
		jlabelcart = new JLabel("\r\n");
		jlabelcart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Cart();
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
		jlabelcart.setBounds(684, 107, 41, 43);
		panel.add(jlabelcart);

		jlabelback=new JLabel("");
		jlabelback.setIcon(new ImageIcon(""));
		jlabelback.setBounds(39,40,60,60);
		jlabelback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
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
		panel.add(jlabelback);
		
		jlabelsignout=new JLabel("");
		jlabelsignout.setIcon(new ImageIcon(""));
		jlabelsignout.setBounds(802,48,160,43);
		jlabelsignout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
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
		panel.add(jlabelsignout);
		
		jtextfield=new JTextField();
		//jtextfield.setOpaque(false);
		jtextfield.setCaretColor(Color.ORANGE);
		jtextfield.setBorder(null);
		jtextfield.setBounds(343,118,243,20);
		panel.add(jtextfield);
		
        getContentPane().add(panel);
        jlabelimage=new JLabel();
		jlabelimage.setAlignmentX(Component.CENTER_ALIGNMENT);
		jlabelimage.setSize(1000, 600);
		jlabelimage.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\Resources\\Shopping1.png"));
		panel.add(jlabelimage);
		this.setBounds(0,0,1016,637);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
    }

    
}

