import java.util.*;
public class Main{
	
	public static String USERNAME;
	
    public static void main(String[] args){ 
        System.out.println("Welcome to Wholesale Management System");

        database checkpoint = new database("loggedIn.txt");
        
        USERNAME = checkpoint.get();
            
        if (USERNAME.equals("")){
            new defaultPage();
        }else{
            
            database db = new database("users.txt");
            String ret = db.getQueryResult(USERNAME, "username");
            System.out.println("Logged in as: " + USERNAME);

            if (!ret.equals("")){
                new Menu();
            }else{
                new LogIn();
            }
        }
    }
}