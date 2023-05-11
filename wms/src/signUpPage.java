//fuad
import java.lang.*;
import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

import utils.validator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class signUpPage implements MouseListener {
	
	protected JFrame jframe;
	protected JLabel jlabel,jlabel1,jlabel2,jlabel3,nextButton,jlabel7,jlabel8,jlabel9,jlabel10,jlabel11,jlabel12,jlabel13,jlabel14,jlabelback,jlabelback1,jlabelback2,jlabwlback3;
	private JTextField jtextfield,jtextfield1,jtextfield2,jtextfield3,jtextfield4,jtextfield5,jtextfield6,jtextfield7,jtextfield8,jtextfield9;
    private JPanel jpanel1, jpanel2, jpanel3, jpanel4,jpanel5;
    private String username, password,confirmpassword, fullName, ownerAddress, ownerPhone, ownerEmail, accountType, entityName,
            entityAddress, entityPhone, entityEmail, entityLicense;
    private int step = 1;

    signUpPage() {
    	jframe=new JFrame();
		jframe.setTitle("SignUp");
		jframe.setSize(new Dimension(1016,638));
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane();
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
		jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        
        showStep1();
    }

    

    /**
     * Step 1. Fisrt panel on the same frame
     * Label: Create account as a,
     * two buttons: Merchant and Manufacturer
     */
    private void showStep1() {

        step = 1;
        jpanel1 = new JPanel();
        jpanel1.setLayout(null);
        jpanel1.setSize(1000, 600);

		jlabel2 = new JLabel("");//merchant
		jlabel2.addMouseListener(this);
		jlabel2.setBounds(324, 285, 152, 30);
		jpanel1.add(jlabel2);
		
		jlabel3 = new JLabel("");//manufacturer
		jlabel3.addMouseListener(this);
		jlabel3.setBounds(521, 285, 152, 30);
		jpanel1.add(jlabel3);
		
		jlabelback=new JLabel("");
		jlabelback.addMouseListener(this);
		jlabelback.setIcon(new ImageIcon(""));
		jlabelback.setBounds(36,37,70,67);
		jpanel1.add(jlabelback);
		

		
		jlabel=new JLabel();
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\bin\\res\\TypeChoose.png"));
		jpanel1.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
       
        
        if (jpanel2 != null) {
            jpanel2.setVisible(false);
            jframe.remove(jpanel2);
            System.out.println("removed panel2");
        }


        jframe.getContentPane().add(jpanel1);
    }

    /**
     * Step 2. Second panel on the same frame
     * Takes the Name, Address, Phone, and Email from the user
     */
    private void showStep2() {//signup1

        step = 2;

        jpanel2 = new JPanel();
        jpanel2.setLayout(null);
        jpanel2.setSize(1000, 600);

		nextButton = new JLabel("");//next
		nextButton.addMouseListener(this);
		nextButton.setBounds(435, 432, 131, 34);
		jpanel2.add(nextButton);
		
		jlabelback=new JLabel("");//back
		jlabelback.addMouseListener(this);
		jlabelback.setBounds(37,38,67,64);
		jpanel2.add(jlabelback);

		jtextfield = new JTextField();
		jtextfield.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield.setCaretColor(new Color(30, 144, 255));
		jtextfield.setBorder(null);
		jtextfield.setOpaque(false);
		jtextfield.setBounds(401, 267, 194, 20);
		jpanel2.add(jtextfield);
		jtextfield.setColumns(10);
		
		jtextfield1 = new JTextField();
		jtextfield1.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield1.setOpaque(false);
		jtextfield1.setBorder(null);
		jtextfield1.setBounds(401, 324, 194, 20);
		jpanel2.add(jtextfield1);
		jtextfield1.setColumns(10);
		
		jtextfield2 = new JTextField();
		jtextfield2.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield2.setOpaque(false);
		jtextfield2.setCaretColor(new Color(30, 144, 255));
		jtextfield2.setBorder(null);
		jtextfield2.setBounds(401, 381, 194, 20);
		jpanel2.add(jtextfield2);
		jtextfield2.setColumns(10);
		
		jlabel=new JLabel();
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\bin\\res\\SignUp1.png"));
		jpanel2.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);



        if (jpanel1 != null) {
            jpanel1.setVisible(false);
            jframe.remove(jpanel1);
            System.out.println("removed panel1");
        }

        if (jpanel3 != null) {
            jpanel3.setVisible(false);
            jframe.remove(jpanel3);
            System.out.println("removed panel3");
        }

        jframe.getContentPane().add(jpanel2);
    }

    /**
     * Step 3. Third panel on the same frame
     * Takes info about Shop or Company depending on the account type
     */
    private void showStep3() {

        step = 3;

        jpanel3 = new JPanel();
        jpanel3.setLayout(null);
        jpanel3.setSize(1000, 600);

        nextButton = new JLabel("");//next
        nextButton.addMouseListener(this);
		nextButton.setBounds(435, 432, 131, 34);
		jpanel3.add(nextButton);
		
		jlabelback=new JLabel("");//back
		jlabelback.addMouseListener(this);
		jlabelback.setBounds(37,38,67,64);
		jpanel3.add(jlabelback);

		jtextfield3 = new JTextField();
		jtextfield3.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield3.setCaretColor(new Color(30, 144, 255));
		jtextfield3.setBorder(null);
		jtextfield3.setOpaque(false);
		jtextfield3.setBounds(401, 267, 194, 20);
		jpanel3.add(jtextfield3);
		jtextfield3.setColumns(10);
		
		jtextfield4 = new JTextField();
		jtextfield4.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield4.setOpaque(false);
		jtextfield4.setBorder(null);
		jtextfield4.setBounds(401, 324, 194, 20);
		jpanel3.add(jtextfield4);
		jtextfield4.setColumns(10);
		
		jtextfield5 = new JTextField();
		jtextfield5.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield5.setOpaque(false);
		jtextfield5.setCaretColor(new Color(30, 144, 255));
		jtextfield5.setBorder(null);
		jtextfield5.setBounds(401, 381, 194, 20);
		jpanel3.add(jtextfield5);
		jtextfield5.setColumns(10);
		
		jlabel=new JLabel();
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\bin\\res\\SignUp2.png"));
		jpanel3.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
        if (accountType.equals("Manufacturer")) {

            if (jpanel2 != null) {
                jpanel2.setVisible(false);
                jframe.remove(jpanel2);
                System.out.println("removed panel2");
            }
    
            if (jpanel4 != null) {
                jpanel4.setVisible(false);
                jframe.remove(jpanel4);
                System.out.println("removed panel4");
            }
    
            jframe.add(jpanel3);
            
        } else if (accountType.equals("Merchant")) {

       
            if (jpanel2 != null) {
                jpanel2.setVisible(false);
                jframe.remove(jpanel2);
                System.out.println("removed panel2");
            }
    
            if (jpanel4 != null) {
                jpanel4.setVisible(false);
                jframe.remove(jpanel4);
                System.out.println("removed panel4");
            }
    
            jframe.add(jpanel3);

        } else {
            System.out.println("Error: Account type not found");
        }
    }

    /**
     * Step 4. Fourth panel on the same frame
     * Takes the Username and Password from the user
     */
    private void showStep4() {
        
        step = 4;

        jpanel4 = new JPanel();
        jpanel4.setLayout(null);
        jpanel4.setSize(1000, 600);

        nextButton = new JLabel("");//next
        nextButton.addMouseListener(this);
		nextButton.setBounds(435, 432, 131, 34);
		jpanel4.add(nextButton);
		
		jlabelback=new JLabel("");//back
		jlabelback.addMouseListener(this);
		jlabelback.setBounds(37,38,67,64);
		jpanel4.add(jlabelback);

		jtextfield6 = new JTextField();
		jtextfield6.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield6.setCaretColor(new Color(30, 144, 255));
		jtextfield6.setBorder(null);
		jtextfield6.setOpaque(false);
		jtextfield6.setBounds(401, 267, 194, 20);
		jpanel4.add(jtextfield6);
		jtextfield6.setColumns(10);
		
		jtextfield7 = new JTextField();
		jtextfield7.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield7.setOpaque(false);
		jtextfield7.setBorder(null);
		jtextfield7.setBounds(401, 324, 194, 20);
		jpanel4.add(jtextfield7);
		jtextfield7.setColumns(10);
		
		jtextfield8 = new JTextField();
		jtextfield8.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtextfield8.setOpaque(false);
		jtextfield8.setCaretColor(new Color(30, 144, 255));
		jtextfield8.setBorder(null);
		jtextfield8.setBounds(401, 381, 194, 20);
		jpanel4.add(jtextfield8);
		jtextfield8.setColumns(10);
		
		jlabel=new JLabel();
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\bin\\res\\SignUp3.png"));
		jpanel4.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		System.out.println("figures");
        if (jpanel3 != null) {
            jpanel3.setVisible(false);
            jframe.remove(jpanel3);
            System.out.println("removed panel3");
        }
        
        if (jpanel4 != null) {
            jpanel3.setVisible(false);
            jframe.remove(jpanel3);
            System.out.println("removed panel3");
        	}

        jframe.add(jpanel4);
    }
    
    public void showStep5() {
    	step = 5;
        jpanel5 = new JPanel();
        jpanel5.setLayout(null);
        jpanel5.setSize(1000, 600);
    	
    	nextButton = new JLabel("");//go to login
    	nextButton.addMouseListener(this);
		nextButton.setBounds(424, 285, 152, 30);
		jpanel5.add(nextButton);
		
		jlabel=new JLabel();
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\bin\\res\\SignUp4.png"));
		jpanel5.add(jlabel);
		jframe.setBounds(0,0,1016,637);
		jframe.setLocationRelativeTo(null);
		
		jpanel1.setVisible(false);
		jpanel2.setVisible(false);
		jpanel3.setVisible(false);
		jpanel4.setVisible(false);

    	jframe.add(jpanel5);
		
	}
    @Override
    public void mouseClicked(MouseEvent e) {
    	
        System.out.println("Clicked on " + /*e.getActionCommand() +*/ " button");
        if (e.getSource() == nextButton) {
        
            if (step == 2) {
            	
                fullName = jtextfield.getText();
                ownerAddress = jtextfield1.getText();
                ownerPhone = jtextfield2.getText();
                //ownerEmail = emailField.getText();

                if (fullName.equals("") || ownerAddress.equals("") || ownerPhone.equals("") ) {
                    JOptionPane.showMessageDialog(jframe, "Please fill all the fields");
                    return;
                }

                // email validation
                //if (!ownerEmail.contains("@") || !ownerEmail.contains(".")) {
                 //   JOptionPane.showMessageDialog(jframe, "Please enter a valid email address");
                //    return;
                //}

                showStep3();
            } else if (step == 3) {
            	
                entityName = jtextfield3.getText();
                entityAddress = jtextfield4.getText();
                entityPhone = jtextfield5.getText();
                //entityEmail = entityEmailField.getText();
                //entityLicense = jtextfield5.getText();

                if (entityName.equals("") || entityAddress.equals("") || entityPhone.equals("")
                       /* || entityEmail.equals("") || entityLicense.equals("")*/) {
                    JOptionPane.showMessageDialog(jframe, "Please fill all the fields");
                    return;
                }

                // email validation
                //if (!entityEmail.contains("@") || !entityEmail.contains(".")) {
                //    JOptionPane.showMessageDialog(jframe, "Please enter a valid email address");
                //    return;
                //}

                showStep4();
            } else if (step == 4) {
            	
                System.out.println("Last step");

                username = jtextfield6.getText();
                password = jtextfield7.getText();
                confirmpassword=jtextfield8.getText();


                if (new validator().validate(username, password) == false){
                    return;
                }


                // database write
                database db = new database("users.txt");

                // find if username already exists
                if (db.match("username=" + username)) {
             
                    JOptionPane.showMessageDialog(jframe, "Username already exists");
                    return;
                }

                String record = "username=" + username + ",password=" + password + ",accountType=" + accountType
                        + ",fullName=" + fullName + ",ownerAddress=" + ownerAddress + ",ownerPhone=" + ownerPhone
                        + /*",ownerEmail=" + ownerEmail +*/ ",entityName=" + entityName + ",entityAddress=" + entityAddress
                        + ",entityPhone=" + entityPhone + /*",entityEmail=" + entityEmail + ",entityLicense="
                        + entityLicense + */"\n";

                db.add(record);

                //JOptionPane.showMessageDialog(jframe, "Account created successfully");
                showStep5();
            } else if(step ==5){
            	jframe.dispose();
            	new LogIn();
            }

        }else if (e.getSource() == jlabelback){
        	
            if (step == 2){
                showStep1();
            }else if (step == 1){
            	jframe.dispose();
                new LogIn();
            }else if (step == 3){
                showStep2();
            }else if (step == 4){
                showStep3();
            }
        } else if (e.getSource() == jlabel2) {
        
            accountType = "Merchant";
            jpanel1.setVisible(false);
            showStep2();
        } else if (e.getSource() == jlabel3) {//
        
            accountType = "Manufacturer";
            //jpanel1.setVisible(false);
            //showStep2();
        
        }
    }



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
