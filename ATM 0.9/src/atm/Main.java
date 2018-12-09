package atm;

import java.util.Scanner;

public class Main {

//	boolean verificaNume(String nume){
//		return false;
//	}

	public static void main(String[] args) {

		User testUser = new User("Dave", "0000");

		Factory atmWorks = new Factory();
		Scanner scan = new Scanner(System.in);
		ATM myAtm = new ATM();

		myAtm.addUser("test", "test");

		String nume = "Nume";
		String pin = "0000";
		while (true) {
			System.out.println("Scrieti <register> daca sunteti un utilizator nou sau <login> daca aveti deja cont ");
			String nou_sau_existent = scan.nextLine();
			User user = null;
			if (nou_sau_existent.equals("register")) {

				while (true) {
					System.out.println("Introdu nume: ");
					nume = scan.nextLine();
					System.out.println("Introdu PIN: ");
					pin = scan.nextLine();
					System.out.println("Reintrodu PIN-ul: ");
					String pin2 = scan.nextLine();
					if (pin.equals(pin2)) {
						User newUser = new User(nume, pin);
						myAtm.addUser(nume, pin);
						break;
					} else {
						System.out.println("Cele doua PIN-uri nu se potrivesc");
						continue;
					}
				}
			} else if (nou_sau_existent.equals("login")) {
				System.out.println("Introdu nume: ");
				nume = scan.nextLine();
				System.out.println("Introdu PIN: ");
				pin = scan.nextLine();
				if (myAtm.map.containsKey(nume) && myAtm.map.get(nume).password.equals(pin)) {
					user = myAtm.map.get(nume);
					System.out.println("Autentificat cu succes!");
				} else {
					System.out.println("USERUL NU EXISTA!");
					continue;
				}
				System.out.println("Pentru a face un cont nou, tastati <nou>");
				System.out.println(
						"Pentru a depune o suma de bani, tastati <depunere> urmat de numarul contului si suma dorita");
				System.out.println(
						"Pentru a retrage o suma de bani, tastati <retrage> urmat de numarul contului si suma dorita");
				while (true) {
					String input[] = scan.nextLine().split(" ");

					switch (input[0]) {
					case "interogare":
						int indexInterogare = Integer.parseInt(input[1]);
						System.out.println(user.getBalanceFromAccount(indexInterogare));
						break;
					case "nou":
						System.out.println("Ce tip de cont. Debit sau Credit ");
						String type = scan.nextLine();
						atmWorks.createAccount(type);
						user.associateAccount(atmWorks.createAccount(type));
						System.out.println("Cont de tipul " + type + " adaugat cu succes!");

					case "afisare":
						user.printAccounts();
						break;
					case "depunere":
						float sumDep = Float.parseFloat(input[2]);
						int indexdep = Integer.parseInt(input[1]);
						if (user.depositInAccount(indexdep, sumDep) == true) {
							user.depositInAccount(indexdep, sumDep);
						} else {
							System.out.println("Nu se pot depune bani intr-un cont de credit!");
						}

						break;
					case "retragere":
						float sumRetrage = Float.parseFloat(input[2]);
						int indexret = Integer.parseInt(input[1]);
						user.withdrawFromAccount(indexret, sumRetrage);
						break;
					case "back":
						break;
					case "quit":
						System.out.println("Bancomat inchis! ");
						System.exit(0);
						break;
					default:
						System.out.println("Comanda gresita!");
						continue;
					}

				}
			}

		}
	}
}
