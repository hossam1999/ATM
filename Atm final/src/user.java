import javax.swing.JOptionPane;

public class user {

	private static String password="1999";
	private static String CARD_ID="1234";
	
	
	
	
	public boolean validate(String p,String ci) {
		
		if((password.equals(p))&&(CARD_ID.equals(ci))) {
			
			
			
			//System.out.println("you have logged in successfully!!");
		JOptionPane.showMessageDialog(null, "you have logged in successfully!!");	
		
		
		return true;
		
		
			}
		
		else {//System.out.println("unmatchable information");
			JOptionPane.showMessageDialog(null, "unmatchable information!!");
			
			return false;
			
			
		
		
		
		
		
		
		
		
		
		
	}






	

}}
