import java.util.*;
public class Main{
	
	public static String USERNAME;
	
    public static void main(String[] args){ 
        System.out.println("Welcome to Wholesale Management System");


        database prod = new database("products.txt");
        ArrayList<String> prods = prod.getProducts("salt");

        for (String item : prods){
            System.out.println(item);
        }

        database checkpoint = new database("loggedIn.txt");
        
        USERNAME = checkpoint.get();
            
        if (USERNAME.equals("")){
            new defaultPage();
        }else{
            
            database db = new database("users.txt");
            String ret = db.getQueryResult(USERNAME, "username");

            if (!ret.equals("")){
                String type = db.getQueryResult(USERNAME, "accountType");
                if (type.equals("Merchant")){
                    new Menu();
                }else if (type.equals("Manufacturer")){
                    //new manufacturerPage();
                }
            }else{
                new LogIn();
            }
        }
    }
}