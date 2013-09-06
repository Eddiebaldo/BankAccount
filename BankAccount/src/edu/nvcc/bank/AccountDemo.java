package edu.nvcc.bank;

import javax.swing.JOptionPane;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account tanes = new Account(100,"Craig", 8888);
		Account craig = new Account(10000, "Craig", 0000);
		//the next two lines are the same
		//JOptionPane.showMessageDialog(null, tanes.getAcNum()+ "\n"+ tanes.getName() + "\n" + tanes.getBalance());
		JOptionPane.showMessageDialog(null, craig);
		tanes.setBalance(30);
		JOptionPane.showMessageDialog(null, tanes);
		
		System.out.println("There are" + Account.getCount() + "Acounts");
		Account.setCount(5);
		System.out.println("There are" + tanes.getCount() + "Acounts");
	}

}
