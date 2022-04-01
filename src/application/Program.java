package application;

import java.util.Scanner;

import entities.Account;
import entities.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account Data: ");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("Enter the amount for withdraw: ");
		double withdraw = sc.nextDouble();
		account.withDraw(withdraw);
		System.out.println(account);
		
		
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
	}

}
