import java.util.Scanner;
import java.text.DecimalFormat;

public class ComputingTaxes {

	public static void main(String[] args) {
		// User inputs information, program returns taxes (based on tax information from 2021-2022 in New Jersey)
			DecimalFormat df = new DecimalFormat("$###,###,###,###,###,###,###,###,###.00");
			
			Scanner sc = new Scanner(System.in);
			
		// Prompt user
			System.out.println("0 - Single Filer");
			System.out.println("1 - Married Jointly");
			System.out.println("2 - Married Separately");
			System.out.println("3 - Head of Household");
			
			System.out.print("Enter Your Filing Status: ");
			int status = sc.nextInt();
			
			System.out.print("Enter Your Taxable Income: ");
			double income = sc.nextDouble();
			
			sc.close();
			
			double tax = 0;
			
		// Nested if else chain to compute taxes
			if (status == 0) {
				if (income > 8350) {
					if (income > 33950) {
						if (income > 82250) {
							if (income > 171550) {
								if (income > 372950) {
									tax = (income - 372950) * 0.35 + (201400 * 0.33) + (89300 * 0.28) +
											(48300 * 0.25) + (25600 * 0.15) + (8350 * 0.1);
									double net = income - tax;
									System.out.println("Income: " + df.format(income));
									System.out.println("Tax: " + df.format(tax));
									System.out.println("Net Pay: " + df.format(net));
								} else {
									tax = (income - 171550) * 0.33 + (89300 * 0.28) + (48300 * 0.25)
											+ (25600 * 0.15) + (8350 * 0.1);
									double net = income - tax;
									System.out.println("Income: " + df.format(income));
									System.out.println("Tax: " + df.format(tax));
									System.out.println("Net Pay: " + df.format(net));
								}
							} else {
								tax = (income - 82250) * 0.28 + (48300 * 0.25) + (25600 * 0.15) + (8350 * 0.1);
								double net = income - tax;
								System.out.println("Income: " + df.format(income));
								System.out.println("Tax: " + df.format(tax));
								System.out.println("Net Pay: " + df.format(net));
							}
						} else {
							tax = (income - 33950) * 0.25 + (25600 * 0.15) + (8350 * 0.1);
							double net = income - tax;
							System.out.println("Income: " + df.format(income));
							System.out.println("Tax: " + df.format(tax));
							System.out.println("Net Pay: " + df.format(net));
						}
					} else {
						tax = (income - 8350) * 0.15 + (8350 * 0.1);
						double net = income - tax;
						System.out.println("Income: " + df.format(income));
						System.out.println("Tax: " + df.format(tax));
						System.out.println("Net Pay: " + df.format(net));
					}
				} else {
					tax = income * 0.1;
					double net = income - tax;
					System.out.println("Income: " + df.format(income));
					System.out.println("Tax: " + df.format(tax));
					System.out.println("Net Pay: " + df.format(net));
				}
			} else if (status == 1) {
				if (income > 16700) {
					if (income > 67900) {
						if (income > 137050) {
							if (income > 208850) {
								if (income > 372950) {
									tax = (income - 372950) * 0.35 + (164100 * 0.33) + (71800 * 0.28) +
											(69150 * 0.25) + (51200 * 0.15) + (16700 * 0.1);
									double net = income - tax;
									System.out.println("Income: " + df.format(income));
									System.out.println("Tax: " + df.format(tax));
									System.out.println("Net Pay: " + df.format(net));
								} else {
									tax = (income - 208850) * 0.33 + (71800 * 0.28) + (69150 * 0.25)
											+ (51200 * 0.15) + (16700 * 0.1);
									double net = income - tax;
									System.out.println("Income: " + df.format(income));
									System.out.println("Tax: " + df.format(tax));
									System.out.println("Net Pay: " + df.format(net));
								}
							} else {
								tax = (income - 137050) * 0.28 + (69150 * 0.25) + (51200 * 0.15) + (16700 * 0.1);
								double net = income - tax;
								System.out.println("Income: " + df.format(income));
								System.out.println("Tax: " + df.format(tax));
								System.out.println("Net Pay: " + df.format(net));
							}
						} else {
							tax = (income - 67900) * 0.25 + (51200 * 0.15) + (16700 * 0.1);
							double net = income - tax;
							System.out.println("Income: " + df.format(income));
							System.out.println("Tax: " + df.format(tax));
							System.out.println("Net Pay: " + df.format(net));
						}
					} else {
						tax = (income - 16700) * 0.15 + (16700 * 0.1);
						double net = income - tax;
						System.out.println("Income: " + df.format(income));
						System.out.println("Tax: " + df.format(tax));
						System.out.println("Net Pay: " + df.format(net));
					}
				} else {
					tax = income * 0.1;
					double net = income - tax;
					System.out.println("Income: " + df.format(income));
					System.out.println("Tax: " + df.format(tax));
					System.out.println("Net Pay: " + df.format(net));
				}
			} else if (status == 2) {
				if (income > 8350) {
					if (income > 33950) {
						if (income > 68525) {
							if (income > 104425) {
								if (income > 186475) {
									tax = (income - 186475) * 0.35 + (82050 * 0.33) + (35900 * 0.28) +
											(34575 * 0.25) + (25600 * 0.15) + (8350 * 0.1);
									double net = income - tax;
									System.out.println("Income: " + df.format(income));
									System.out.println("Tax: " + df.format(tax));
									System.out.println("Net Pay: " + df.format(net));
								} else {
									tax = (income - 104425) * 0.33 + (35900 * 0.28) + (34575 * 0.25)
											+ (25600 * 0.15) + (8350 * 0.1);
									double net = income - tax;
									System.out.println("Income: " + df.format(income));
									System.out.println("Tax: " + df.format(tax));
									System.out.println("Net Pay: " + df.format(net));
								}
							} else {
								tax = (income - 68525) * 0.28 + (34575 * 0.25) + (25600 * 0.15) + (8350 * 0.1);
								double net = income - tax;
								System.out.println("Income: " + df.format(income));
								System.out.println("Tax: " + df.format(tax));
								System.out.println("Net Pay: " + df.format(net));
							}
						} else {
							tax = (income - 33950) * 0.25 + (25600 * 0.15) + (8350 * 0.1);
							double net = income - tax;
							System.out.println("Income: " + df.format(income));
							System.out.println("Tax: " + df.format(tax));
							System.out.println("Net Pay: " + df.format(net));
						}
					} else {
						tax = (income - 8350) * 0.15 + (8350 * 0.1);
						double net = income - tax;
						System.out.println("Income: " + df.format(income));
						System.out.println("Tax: " + df.format(tax));
						System.out.println("Net Pay: " + df.format(net));
					}
				} else {
					tax = income * 0.1;
					double net = income - tax;
					System.out.println("Income: " + df.format(income));
					System.out.println("Tax: " + df.format(tax));
					System.out.println("Net Pay: " + df.format(net));
				}
			} else if (status == 3) {
				if (income > 11950) {
					if (income > 45500) {
						if (income > 117450) {
							if (income > 190200) {
								if (income > 372950) {
									tax = (income - 372950) * 0.35 + (182750 * 0.33) + (72750 * 0.28) +
											(71950 * 0.25) + (33550 * 0.15) + (11950 * 0.1);
									double net = income - tax;
									System.out.println("Income: " + df.format(income));
									System.out.println("Tax: " + df.format(tax));
									System.out.println("Net Pay: " + df.format(net));
								} else {
									tax = (income - 190200) * 0.33 + (72750 * 0.28) + (71950 * 0.25)
											+ (33550 * 0.15) + (11950 * 0.1);
									double net = income - tax;
									System.out.println("Income: " + df.format(income));
									System.out.println("Tax: " + df.format(tax));
									System.out.println("Net Pay: " + df.format(net));
								}
							} else {
								tax = (income - 117450) * 0.28 + (71950 * 0.25) + (33550 * 0.15) + (11950 * 0.1);
								double net = income - tax;
								System.out.println("Income: " + df.format(income));
								System.out.println("Tax: " + df.format(tax));
								System.out.println("Net Pay: " + df.format(net));
							}
						} else {
							tax = (income - 45500) * 0.25 + (33550 * 0.15) + (11950 * 0.1);
							double net = income - tax;
							System.out.println("Income: " + df.format(income));
							System.out.println("Tax: " + df.format(tax));
							System.out.println("Net Pay: " + df.format(net));
						}
					} else {
						tax = (income - 11950) * 0.15 + (11950 * 0.1);
						double net = income - tax;
						System.out.println("Income: " + df.format(income));
						System.out.println("Tax: " + df.format(tax));
						System.out.println("Net Pay: " + df.format(net));
					}
				} else {
					tax = income * 0.1;
					double net = income - tax;
					System.out.println("Income: " + df.format(income));
					System.out.println("Tax: " + df.format(tax));
					System.out.println("Net Pay: " + df.format(net));
				}
			} else {
				System.out.print("Invalid Status. Try again!");
			}
			
	}

}
