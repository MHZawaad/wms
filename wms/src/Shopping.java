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
	private JPanel panel;
	private List<Rectangle> labelBounds;
    public Shopping() {
    	
		setTitle("Shopping");
		setSize(new Dimension(1016,638));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setExtendedState(JFrame.MAXIMIZED_HORIZ);

        panel = new JPanel();
        panel.setLayout(null); 
        labelBounds = new ArrayList<>();
        int x = 100;
        int y = 166;

        for (int i = 0; i < 10; i++) {
            Rectangle bounds = new Rectangle(x, y, 140, 160);
            labelBounds.add(bounds);

            JLabel label = new JLabel("Product " + (i + 1));//fuad ekhane tui 10 ta product er nam boshabi from database
            label.setBounds(bounds);

            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.println(label.getText() + " clicked!");
                }
            });

            panel.add(label);

            x += 166;
            if (i == 4) {
                x = 100;
                y += 171;
            }
        }

        add(panel, BorderLayout.CENTER);
        jlabelsearch = new JLabel("\r\n");
		jlabelsearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//searches for product
			
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
		jlabelimage.setIcon(new ImageIcon("res\\Shopping1.png"));
		panel.add(jlabelimage);
		this.setBounds(0,0,1016,637);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
    }

    
}

