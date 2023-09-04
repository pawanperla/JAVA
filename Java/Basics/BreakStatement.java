class BreakStatement {

	public static void main(String[] args) {

		// break used in for loop

		for (int i = 1; i < 10; i++) {

			if (i == 6) {
				System.out.println("loop broke here");
				break;
			}

			System.out.println(i);
		}

		// break used in inner for loop

		for (int i = 1; i < 5; i++) {

			for (int j = 1; j < 3; j++) {

				if (i == 2 && j == 2) {

					System.out.println("The loop broke here");
					break;
				}
				System.out.println(i + " " + j);

			}
		}

		// break used in while loop

		int i = 1;

		while (i <= 10) {

			if (i == 5) {
				i = i + 1;
				break;
			}
			System.out.print(i + " ");
			i = i + 1;
		}

	}

}
