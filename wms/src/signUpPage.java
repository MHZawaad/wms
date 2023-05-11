//fuad
import java.lang.*;
import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
import javax.swing.*;

import utils.validator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class signUpPage implements ActionListener {
	
	protected JFrame jframe;
	protected JLabel jlabel,jlabel1,jlabel2,jlabel3,jlabel4,jlabel5,jlabel6,jlabel7,jlabel8,jlabel9,jlabel10,jlabel11,jlabel12,jlabel13,jlabel14,jlabelback,jlabelback1,jlabelback2,jlabwlback3;
	private JTextField jtextfield,jtextfield1,jtextfield2,jtextfield3,jtextfield4,jtextfield5,jtextfield6,jtextfield7,jtextfield8,jtextfield9;
    private JPanel jpanel,jpanel1, jpanel2, jpanel3, jpanel4,jpanel5;
    private String username, password, fullName, ownerAddress, ownerPhone, ownerEmail, accountType, entityName,
            entityAddress, entityPhone, entityEmail, entityLicense;
    private int step = 1;

    signUpPage() {
    	jframe=new JFrame();
		jframe.setTitle("SignUp");
		jframe.setSize(new Dimension(1016,638));
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        jframe.setVisible(true);
        
        

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

        jpanel = new JPanel();
        jpanel.setLayout(null);
        jpanel.setSize(1000, 600);

		jlabel2 = new JLabel("");
		jlabel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new signUpPage();
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
		jlabel2.setBounds(324, 285, 152, 30);
		jpanel.add(jlabel2);
		
		jlabel3 = new JLabel("");
		jlabel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				//new merchantPage();

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
		jlabel3.setBounds(521, 285, 152, 30);
		jpanel.add(jlabel3);
		
		jlabelback=new JLabel("");
		jlabelback.setIcon(new ImageIcon(""));
		jlabelback.setBounds(36,37,70,67);
		jlabelback.addMouseListener(new MouseAdapter() {
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
		jpanel.add(jlabelback);
		

		
		jlabel=new JLabel();
		jlabel.setSize(1000, 600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\bin\\res\\TypeChoose.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);
       
        
        if (jpanel2 != null) {
            jpanel2.setVisible(false);
            jframe.remove(jpanel2);
            System.out.println("removed panel2");
        }


        jframe.add(jpanel1);
    }

    /**
     * Step 2. Second panel on the same frame
     * Takes the Name, Address, Phone, and Email from the user
     */
    private void showStep2() {

        step = 2;

        jpanel2 = new JPanel();
        jpanel2.setLayout(null);
        jpanel2.setSize(1000, 600);

		jlabel4 = new JLabel("");
		jlabel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new SignUp2();
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
		jlabel4.setBounds(435, 432, 131, 34);
		jpanel.add(jlabel4);
		
		jlabelback=new JLabel("");
		jlabelback.setBounds(37,38,67,64);
		jlabelback.addMouseListener(new MouseAdapter() {
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
		jlabel.setIcon(new ImageIcon("E:\\Git\\wms\\wms\\bin\\res\\SignUp1.png"));
		jpanel.add(jlabel);
		jframe.setBounds(0,0,1016,637);



        if (panel1 != null) {
            panel1.setVisible(false);
            this.remove(panel1);
            System.out.println("removed panel1");
        }

        if (panel3 != null) {
            panel3.setVisible(false);
            this.remove(panel3);
            System.out.println("removed panel3");
        }

        this.add(panel2);
    }

    /**
     * Step 3. Third panel on the same frame
     * Takes info about Shop or Company depending on the account type
     */
    private void showStep3() {

        step = 3;

        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setSize(800, 450);

        stepCount.setBounds(10, 10, 80, 25);
        panel3.add(stepCount);

        entityNameLabel.setBounds(260, 50, 80, 25);
        panel3.add(entityNameLabel);

        entityNameField.setBounds(350, 50, 160, 25);
        panel3.add(entityNameField);
        entityAddressLabel.setBounds(260, 100, 80, 25);
        panel3.add(entityAddressLabel);
        entityAddressField.setBounds(350, 100, 160, 25);
        panel3.add(entityAddressField);
        entityPhoneLabel.setBounds(260, 150, 80, 25);
        panel3.add(entityPhoneLabel);
        entityPhoneField.setBounds(350, 150, 160, 25);
        panel3.add(entityPhoneField);
        entityEmailLabel.setBounds(260, 200, 80, 25);
        panel3.add(entityEmailLabel);
        entityEmailField.setBounds(350, 200, 160, 25);
        panel3.add(entityEmailField);
        entityLicenseLabel.setBounds(260, 250, 80, 25);
        panel3.add(entityLicenseLabel);
        entityLicenseField.setBounds(350, 250, 160, 25);
        panel3.add(entityLicenseField);
        previousButton.setBounds(260, 300, 100, 25);
        panel3.add(previousButton);
        nexButton.setBounds(400, 300, 100, 25);
        panel3.add(nexButton);
        if (accountType.equals("Manufacturer")) {

            stepCount.setText("Step 3/4");

            entityNameLabel.setText("Company Name");

            entityAddressLabel.setText("Company Address");

            entityPhoneLabel.setText("Company Phone");

            entityEmailLabel.setText("Company Email");

            entityLicenseLabel.setText("Company License");

            previousButton.setText("Previous");

            nexButton.setText("Next");
        
            if (panel2 != null) {
                panel2.setVisible(false);
                this.remove(panel2);
                System.out.println("removed panel2");
            }
    
            if (panel4 != null) {
                panel4.setVisible(false);
                this.remove(panel4);
                System.out.println("removed panel4");
            }
    
            this.add(panel3);
            
        } else if (accountType.equals("Merchant")) {

            stepCount.setText("Step 3/4");

            entityNameLabel.setText("Shop Name");

            entityAddressLabel.setText("Shop Address");

            entityPhoneLabel.setText("Shop Phone");

            entityEmailLabel.setText("Shop Email");

            entityLicenseLabel.setText("Shop License");

            previousButton.setText("Previous");

            nexButton.setText("Next");

            if (panel2 != null) {
                panel2.setVisible(false);
                this.remove(panel2);
                System.out.println("removed panel2");
            }
    
            if (panel4 != null) {
                panel4.setVisible(false);
                this.remove(panel4);
                System.out.println("removed panel4");
            }
    
            this.add(panel3);

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

        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setSize(800, 450);

        stepCount.setText("Step 4/4");
        stepCount.setBounds(10, 10, 80, 25);
        panel4.add(stepCount);

        usernameLabel.setText("Username");
        usernameLabel.setBounds(260, 150, 80, 25);
        panel4.add(usernameLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(350, 150, 160, 25);
        panel4.add(usernameField);

        passwordLabel.setText("Password");
        passwordLabel.setBounds(260, 200, 80, 25);
        panel4.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(350, 200, 160, 25);
        panel4.add(passwordField);

        previousButton.setText("Previous");
        previousButton.setBounds(120, 250, 100, 25);
        panel4.add(previousButton);

        nexButton.setText("Finish");
        nexButton.setBounds(260, 250, 100, 25);
        panel4.add(nexButton);

        cancelButton.setText("Cancel");
        cancelButton.setBounds(400, 250, 100, 25);
        panel4.add(cancelButton);

        if (panel3 != null) {
            panel3.setVisible(false);
            this.remove(panel3);
            System.out.println("removed panel3");
        }

        this.add(panel4);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked on " + e.getActionCommand() + " button");
        if (e.getSource() == nexButton) {
            if (step == 2) {
                fullName = nameField.getText();
                ownerAddress = addressField.getText();
                ownerPhone = phoneField.getText();
                ownerEmail = emailField.getText();

                if (fullName.equals("") || ownerAddress.equals("") || ownerPhone.equals("") || ownerEmail.equals("")) {
                    JOptionPane.showMessageDialog(this, "Please fill all the fields");
                    return;
                }

                // email validation
                if (!ownerEmail.contains("@") || !ownerEmail.contains(".")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid email address");
                    return;
                }

                showStep3();
            } else if (step == 3) {
                entityName = entityNameField.getText();
                entityAddress = entityAddressField.getText();
                entityPhone = entityPhoneField.getText();
                entityEmail = entityEmailField.getText();
                entityLicense = entityLicenseField.getText();

                if (entityName.equals("") || entityAddress.equals("") || entityPhone.equals("")
                        || entityEmail.equals("") || entityLicense.equals("")) {
                    JOptionPane.showMessageDialog(this, "Please fill all the fields");
                    return;
                }

                // email validation
                if (!entityEmail.contains("@") || !entityEmail.contains(".")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid email address");
                    return;
                }

                showStep4();
            } else if (step == 4) {
                System.out.println("Last step");

                username = usernameField.getText();
                password = passwordField.getText();


                if (new validator().validate(username, password) == false){
                    return;
                }


                // database write
                database db = new database("users.txt");

                // find if username already exists
                if (db.match("username=" + username)) {
                    JOptionPane.showMessageDialog(this, "Username already exists");
                    return;
                }

                String record = "username=" + username + ",password=" + password + ",accountType=" + accountType
                        + ",fullName=" + fullName + ",ownerAddress=" + ownerAddress + ",ownerPhone=" + ownerPhone
                        + ",ownerEmail=" + ownerEmail + ",entityName=" + entityName + ",entityAddress=" + entityAddress
                        + ",entityPhone=" + entityPhone + ",entityEmail=" + entityEmail + ",entityLicense="
                        + entityLicense + "\n";

                db.add(record);

                JOptionPane.showMessageDialog(this, "Account created successfully");
                this.dispose();
                new loginPage();
            }

        }else if (e.getSource() == previousButton){
            if (step == 2){
                showStep1();
            }else if (step == 3){
                showStep2();
            }else if (step == 4){
                showStep3();
            }
        } else if (e.getSource() == merchantButton) {
            accountType = "Merchant";
            panel1.setVisible(false);
            showStep2();
        } else if (e.getSource() == manufacturerButton) {
            accountType = "Manufacturer";
            panel1.setVisible(false);
            showStep2();
        } else if (e.getSource() == cancelButton) {
            this.setVisible(false);
            new signUpPage();
        }
    }
}
