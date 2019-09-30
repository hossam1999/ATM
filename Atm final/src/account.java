//import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class account {
private	double balance=0;  double ope[]={0,0,0,0,0}; double balanceNP[]= {0,0,0,0,0};     int i=0;int j=0;int k;int a;
//----------------------------------------------------------------------------------------------------------------------------------------------

	void deposite(double entryd) {
		if(entryd<0) {JOptionPane.showMessageDialog(null, "Invalid input!!");}
		else {
		
		
		
		if(i==5) {for(j=0;j<4;j++) {ope[j]=ope[j+1];balanceNP[j]=balanceNP[j+1];}
		i=4;
	}
		balanceNP[i]=balance;
		balance=balance+entryd;
		JOptionPane.showMessageDialog(null, "Successfull operation!!");	
		ope[i]=entryd;
		
		i++;
		
		
		k=i-1;
	}}
	//----------------------------------------------------------------------------------------------------------------------------------------------
	void withdraw(double entryw) {
		if(entryw<0) {JOptionPane.showMessageDialog(null, "Invalid input!!");}
		else {
		
		
		if(java.lang.Math.abs(entryw)>java.lang.Math.abs(balance)) {JOptionPane.showMessageDialog(null, "Invalid operation!!");}
		else {balance=balance-entryw;JOptionPane.showMessageDialog(null, "Successful Operation");
		ope[i]=entryw*-1;
		balanceNP[i]=balance;
		i++;
		if(i==5) {for(j=0;j<4;j++) {ope[j]=ope[j+1];balanceNP[j]=balanceNP[j+1];}
		i=4;
	}
		
		
		
		k=i-1;
		}
		
		}}
	//----------------------------------------------------------------------------------------------------------------------------------------------

	void print_balance() {JOptionPane.showMessageDialog(null, "Your balance equals"+balance); }
	//----------------------------------------------------------------------------------------------------------------------------------------------

	void previosOperation() {
		if(k<0) {JOptionPane.showMessageDialog(null, "NO PREVIOUS OPERATIONS TO BE SHOWN");}
		else { 
		if(i==0) {JOptionPane.showMessageDialog(null, "NO PREVIOUS OPERATIONS TO BE SHOWN");}
		else {
		JOptionPane.showMessageDialog(null, "Your balance was:  "+balanceNP[k]+"      \n" +"The Operation made:  "+ope[k]);
		if(k>=0) {a=k+1;
		k=k-1;}}
		
	
	
	}}
	//----------------------------------------------------------------------------------------------------------------------------------------------

	void nextOperation() {
		if(i==0) {JOptionPane.showMessageDialog(null, "NO  OPERATIONS TO BE SHOWN");}
		else if(a>4) {JOptionPane.showMessageDialog(null, "NO  OPERATIONS TO BE SHOWN");k=a-1;}
		
		else if((balanceNP[a])==0&&(ope[a]==0)) {JOptionPane.showMessageDialog(null, "NO DATA TO BE SHOWN");
}
		else	{JOptionPane.showMessageDialog(null, "Your balance was: "+balanceNP[a]+"       \n"+"The Operation made: "+ope[a]);
		
		
	
	k=a-1;
	a=a+1;
	}}
	//----------------------------------------------------------------------------------------------------------------------------------------------

	public account() {
		// TODO Auto-generated constructor stub
	}
	
	//public static void main(String[] args)
	//{
		
		
		
		
		
	//}
	
	
	

}
