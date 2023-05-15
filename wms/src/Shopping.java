import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shopping extends JFrame {
	
	private JLabel jlabelsearch,jlabelcart,jlabelback,jlabelsignout;
	private JTextField jtextfield;
	private JLabel jlabelimage,addtocart;
	private JPanel panel;
	private List<Rectangle> labelBounds;
	private String selected;
	private product selectedProduct;

	private HashMap<product, Boolean> cart = new HashMap<>();
	
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


		ArrayList<product> products = new database("products.txt").getAllProducts();

		/*
		System.out.println(products.size());
		for (int i = 0; i < products.size(); i++){
			System.out.println("-------------------------------------------");
			System.out.println("ID: " + products.get(i).productID);
			System.out.println("Name: " + products.get(i).productName);
			System.out.println("Price: " + products.get(i).productPrice);
			System.out.println("MFD: " + products.get(i).manufacturingDate);
			System.out.println("EXP: " + products.get(i).expiryDate);
			System.out.println("-------------------------------------------");
		}
		*/

        for (int i = 0; i < 10; i++) {
            Rectangle bounds = new Rectangle(x, y, 140, 160);
            labelBounds.add(bounds);

            JLabel label = new JLabel(products.get(i).productName);//fuad ekhane tui 10 ta product er nam boshabi from database
            label.setBounds(bounds);

			int finalI = i;

            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.println(label.getText() + " clicked!");
                    //selected="";//productid or product name that was selected
					//selected = products.get(i).productName + " | " + products.get(i).productPrice + " " + products.get(i).productQuantity;
					selectedProduct = products.get(finalI);
                }
            });

            panel.add(label);

            x += 166;
            if (i == 4) {
                x = 100;
                y += 171;
            }
        }
        
        addtocart = new JLabel("");
		addtocart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (selectedProduct == null){
					System.out.println("no product selected");
					JOptionPane.showMessageDialog(null, "Please select a product");
					return;
				}

				if (cart.get(selectedProduct) != null){
					System.out.println("product already in cart");

					JOptionPane.showMessageDialog(null, "Product is already in cart");
					return;
				}

				//adds product to cart
				System.out.println("product added to cart:\n"+ selectedProduct.productName);//fuad step1: select a product step 2 : click on add to cart button step3: cart.txt product is added with quantity 1
				//addedProducts.add(new product(selected, 1));
				cart.put(selectedProduct, true);
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
		addtocart.setBounds(751, 530, 165, 34);
		panel.add(addtocart);
		

        getContentPane().add(panel, BorderLayout.CENTER);
        jlabelsearch = new JLabel("\r\n");
		jlabelsearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//searches for product
			
				String queryString = jtextfield.getText();

				System.out.println(queryString);

				//search for product
				database producDatabase = new database("products.txt");

				for (product item : producDatabase.getProducts(queryString)){
					System.out.println("-------------------------------------------");
					System.out.println("ID: " + item.productID);
					System.out.println("Name: " + item.productName);
					System.out.println("Price: " + item.productPrice);
					System.out.println("MFD: " + item.manufacturingDate);
					System.out.println("EXP: " + item.expiryDate);
					System.out.println("-------------------------------------------");
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

				database cartDatabase = new database("cart.txt");

				//add products to cart
				for (product item : cart.keySet()){
					cartDatabase.add("Id=" + item.productID + ",Name=" + item.productName + ",Price=" + item.productPrice + ",Quantity=" + item.productQuantity + ",MFD=" + item.manufacturingDate + ",EXP=" + item.expiryDate);
				}

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

