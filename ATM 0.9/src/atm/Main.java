package atm;

import java.util.Scanner;

public class Main {

//	boolean verificaNume(String nume){
//		return false;
//	}

	public static void main(String[] args) {

		// User testUser = new User("Dave", "0000");

		AccountFactory atmWorks = new AccountFactory();
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
						// User newUser = new User(nume, pin);
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

					switch (input[0].toLowerCase()) {
					case "interogare":
						int indexInterogare = Integer.parseInt(input[1]);
						System.out.println(user.getBalanceFromAccount(indexInterogare));
						break;
					case "nou":
						while (true) {
							System.out.println("Ce tip de cont. Debit sau Credit ");
							String type = scan.nextLine();
							if (type.equals("Debit") || type.equals("debit")) {
								atmWorks.createResource(type);
								user.associateAccount(atmWorks.createResource("debit"));
								System.out.println("Cont de tipul " + type + " adaugat cu succes!");
								break;
							}
							if (type.equals("Credit") || type.equals("credit")) {
								atmWorks.createResource(type);
								user.associateAccount(atmWorks.createResource("credit"));
								System.out.println("Cont de tipul " + type + " adaugat cu succes!");
								break;
							} else {
								System.out.println("Tip de cont nou invalid");
								continue;
							}
						}

					case "afisare":
						user.printAccounts();
						break;
					case "depunere":
						float sumDep = 0;
						int indexdep = 0;
						try {
							sumDep = Float.parseFloat(input[2]);
						} catch (Exception e) {
							System.out.println("Format gresit ! Formatul asteptat este: Depunere <index_cont> <suma>");
							break;
						}
						try {
							indexdep = Integer.parseInt(input[1]);
							if (!user.depositInAccount(indexdep, sumDep)) {
								System.out.println("Nu se pot depune bani intr-un cont de credit!");
							} else {
								System.out.println("Au fost depusi cu succes " + sumDep + "$" + " in contul " + indexdep);
							}
							break;
						} catch (Exception e) {
							System.out.println("Nu exista un cont la indexul " + input[1]);
							break;
						}
					case "retragere":
						while (true) {
							float sumRetrage = Float.parseFloat(input[2]);
							int indexret = Integer.parseInt(input[1]);
							if (!user.withdrawFromAccount(indexret, sumRetrage)) {
								System.out.println("SOLD INSUFICIENT! ");
								break;
							} else {
								System.out.println("S-au retras " + sumRetrage + "$ din contul " + indexret);
								break;
							}
						}
					case "quit":
						System.out.println("Bancomat inchis! ");
						scan.close();
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
