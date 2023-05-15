import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Cart {

    protected JFrame jframe;
    protected JPanel jpanel;
    protected JLabel jlabel, jlabel2, jlabelback, jlabelsignout;
    protected JTable table;
    private int quantity;
    private JButton addButton,subtractButton;
    String quantityString;
    public Cart() {

        jframe = new JFrame();
        jframe.setTitle("Cart");
        jframe.setSize(new Dimension(1016, 638));
        jpanel = new JPanel();
        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jframe.getContentPane().add(jpanel);
        jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);

        jlabel2 = new JLabel("");
        jlabel2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jframe.dispose();
                new PurchaseHistory();
            }
        });
        jlabel2.setBounds(426, 527, 153, 40);
        jpanel.add(jlabel2);

        JButton removeButton = new JButton("Remove");
        removeButton.setBounds(702, 482, 82, 27);
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.removeRow(selectedRow);
                }
            }
        });
        jpanel.add(removeButton);
        
        addButton = new JButton("+");
        addButton.setBounds(794, 482, 67, 27);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    Integer quantityInteger = (Integer) model.getValueAt(selectedRow, 2);
                    quantityString = quantityInteger.toString();
                    if (quantityString != null && !quantityString.isEmpty() && !quantityString.equals("null")) {
                        quantity = Integer.parseInt(quantityString);
                        model.setValueAt(quantity + 1, selectedRow, 2); // Increase quantity by 1
                    }
                }
            }
        });
        jpanel.add(addButton);

        subtractButton = new JButton("-");
        subtractButton.setBounds(625, 482, 67, 27);
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    Integer quantityInteger = (Integer) model.getValueAt(selectedRow, 2);
                    quantityString = quantityInteger.toString();
                    if (quantityString != null && !quantityString.isEmpty()) {
                        quantity = Integer.parseInt(quantityString);
                        if (quantity > 1) {
                            model.setValueAt(quantity - 1, selectedRow, 2); // Decrease quantity by 1
                        }
                    }
                }
            }
        });
        jpanel.add(subtractButton);

        // Get cart products from the database
        database db = new database("cart.txt");
        ArrayList<product> products = db.getCart();

        table = new JTable();
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{{"Product Name", "Product Price", "Product Quantity"}},
                new String[]{"Product Name", "Product Price", "Product Quantity"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setModel(model);

        for (product p : products) {
            model.addRow(new Object[]{p.productName, p.productPrice, 1}); // Set initial quantity to 1
        }

        table.setBounds(100, 140, 800, 340);
        jpanel.add(table);

        jlabelback = new JLabel("");
        jlabelback.setIcon(new ImageIcon(""));
        jlabelback.setBounds(42, 41, 59, 60);
        jlabelback.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        jframe.dispose();
        new Menu();
        }
        });
        jpanel.add(jlabelback);
        jlabelsignout = new JLabel("");
        jlabelsignout.setIcon(new ImageIcon(""));
        jlabelsignout.setBounds(802, 51, 158, 40);
        jlabelsignout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jframe.dispose();
                database db = new database("loggedIn.txt");
                db.clear();
                new LogIn();
            }
        });
        jpanel.add(jlabelsignout);

        JLabel totalLabel = new JLabel("");
        totalLabel.setText("Total:");
        totalLabel.setBounds(133, 540, 111, 14);
        jpanel.add(totalLabel);

        jlabel = new JLabel();
        jlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        jlabel.setSize(1000, 600);
        jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\src\\res\\Cart.png"));
        jpanel.add(jlabel);
        jframe.setBounds(0, 0, 1016, 637);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }

    
     
    
}