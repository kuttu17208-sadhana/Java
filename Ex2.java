Import java.util.ArrayList;
Import java.util.Scanner;

Public class CityArrayList {
    Public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> cities = new ArrayList<>();

        System.out.print(“Enter number of cities: “);
        Int n = sc.nextInt();
        Sc.nextLine();

        System.out.println(“Enter city names:”);
        For (int I = 0; I < n; i++) {
            Cities.add(sc.nextLine());
        }

        While (true) {
            System.out.println(“\n===== MENU =====”);
            System.out.println(“1. Append a City”);
            System.out.println(“2. Insert a City at Index”);
            System.out.println(“3. Search a City”);
            System.out.println(“4. Display Cities Starting with a Letter”);
            System.out.println(“5. Exit”);
            System.out.print(“Enter your choice: “);

            Int choice = sc.nextInt();
            Sc.nextLine();

            Switch (choice) {

                Case 1:
                    System.out.print(“Enter city to append: “);
                    String city = sc.nextLine();
                    Cities.add(city);
                    System.out.println(“Updated List: “ + cities);
                    Break;

                Case 2:
                    System.out.print(“Enter index: “);
                    Int index = sc.nextInt();
                    Sc.nextLine();
                    System.out.print(“Enter city to insert: “);
                    City = sc.nextLine();

                    If (index >= 0 && index <= cities.size()) {
                        Cities.add(index, city);
                        System.out.println(“Updated List: “ + cities);
                    } else {
                        System.out.println(“Invalid Index”);
                    }
                    Break;

                Case 3:
                    System.out.print(“Enter city to search: “);
                    City = sc.nextLine();

                    Int pos = cities.indexOf(city);
                    If (pos != -1) {
                        System.out.println(“City Found at Index: “ + pos);
                    } else {
                        System.out.println(“City Not Found”);
                    }
                    Break;

                Case 4:
                    System.out.print(“Enter starting letter: “);
                    Char ch = sc.next().charAt(0);

                    System.out.print(“Cities Starting with ‘” + ch + “’: “);
                    Boolean found = false;

                    For (String c : cities) {
                        If (Character.toUpperCase(c.charAt(0)) == Character.toUpperCase(ch)) {
                            System.out.print(c + “ “);
                            Found = true;
                        }
                    }

                    If (!found) {
                        System.out.print(“No cities found”);
                    }
                    System.out.println();
                    Break;

                Case 5:
                    System.out.println(“Program Ended”);
                    Sc.close();
                    System.exit(0);

                Default:
                    System.out.println(“Invalid Choice”);
            }
        }
    }
}
