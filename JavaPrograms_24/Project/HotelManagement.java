package Project;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class HotelManagement {
    double bill = 0.0;
    String name = "";
    String order = "";
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    String dateTime = dtf.format(now);

    void viewMenu() {
        System.out.println("Menu:\n1. Starters\n2. Main Course\n3. Desserts\n4. Exit");
        int n = sc.nextInt();
        System.out.println();

        switch (n) {
            case 1:
                showStarters();
                break;

            case 2:
                showMainCourse();
                break;

            case 3:
                showDesserts();
                break;

            case 4:
                System.out.println("Program terminated.");
                System.exit(0);

            default:
                System.out.println("Invalid input! Please choose a valid option.");
                viewMenu();
                break;
        }
    }

    void showStarters() {
        System.out.println("Starters Menu:");
        System.out.println("1. Spring Rolls - ₹150");
        System.out.println("2. Garlic Bread - ₹120");
        System.out.println("3. Paneer Tikka - ₹200");
        System.out.println("4. Back to Main Menu");

        handleBackToMenu('S');
    }

    void showMainCourse() {
        System.out.println("Main Course Menu:");
        System.out.println("1. Butter Chicken - ₹350");
        System.out.println("2. Paneer Butter Masala - ₹250");
        System.out.println("3. Dal Makhani - ₹180");
        System.out.println("4. Back to Main Menu");

        handleBackToMenu('M');
    }

    void showDesserts() {
        System.out.println("Desserts Menu:");
        System.out.println("1. Gulab Jamun - ₹100");
        System.out.println("2. Ice Cream - ₹120");
        System.out.println("3. Brownie with Ice Cream - ₹180");
        System.out.println("4. Back to Main Menu");

        handleBackToMenu('D');
    }

    void Input() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.println();
        System.out.println();
    }

    void checkoutProceed() {
        System.out.println("NAME: " + name + "\t\t DATE/TIME: " + dateTime + "\n");

        System.out.println("ITEMS ORDERED: ");
        System.out.println(order);

        System.out.println("COST: " + bill);
        System.out.println("SGST: " + 0.09 * bill);
        System.out.println("CGST: " + 0.09 * bill);
        System.out.println("BILL AMOUNT: ₹" + (bill + 0.18 * bill));
    }

    void orderMore() {
        System.out.print("Want to order more (YES/NO):");
        String s = sc.next();
        System.out.println();
        System.out.println();
        if (s.equalsIgnoreCase("YES")) {
            viewMenu();
        } else if (s.equalsIgnoreCase("NO")) {
            checkoutProceed();
        } else {
            System.out.println("Invalid input!");
            orderMore();
        }

    }

    void acceptPlateValue(int n, String item) {
        System.out.print("Enter number of plates: ");
        int n1 = sc.nextInt();
        System.out.println();
        System.out.println();
        bill += n1 * n;
        String s = item+" x " + "" + n1 + "\n";
        order += s;
        orderMore();
    }

    void handleBackToMenu(char flag) {
        int choice = sc.nextInt();
        System.out.println();

        if (choice == 4) {
            viewMenu();
        } else if (choice < 4 && choice >= 1) {
            switch (flag) {
                case 'M':
                    switch (choice) {
                        case 1:
                            System.out.println("Butter Chicken - ₹350");
                            acceptPlateValue(350, "Butter Chicken - ₹350");
                            break;

                        case 2:
                            System.out.println("Paneer Butter Masala - ₹250");
                            acceptPlateValue(250, "Paneer Butter Masala - ₹250");
                            break;

                        case 3:
                            System.out.println("Dal Makhani - ₹180");
                            acceptPlateValue(180, "Dal Makhani - ₹180");
                            break;

                        default:
                            System.err.println("Invalid choice passed to function: handleBackToMenu();");
                            break;
                    }
                    break;

                case 'S':
                    switch (choice) {
                        case 1:
                            System.out.println("Spring Rolls - ₹150");
                            acceptPlateValue(150, "Spring Rolls - ₹150");
                            break;

                        case 2:
                            System.out.println("Garlic Bread - ₹120");
                            acceptPlateValue(120, "Garlic Bread - ₹120");
                            break;

                        case 3:
                            System.out.println("Paneer Tikka - ₹200");
                            acceptPlateValue(200, "Paneer Tikka - ₹200");
                            break;

                        default:
                            System.err.println("Invalid choice passed to function: handleBackToMenu();");
                            break;
                    }

                    break;

                case 'D':
                    switch (choice) {
                        case 1:
                            System.out.println("Gulab Jamun - ₹100");
                            acceptPlateValue(100, "Gulab Jamun - ₹100");
                            break;

                        case 2:
                            System.out.println("Ice Cream - ₹120");
                            acceptPlateValue(120, "Ice Cream - ₹120");
                            break;

                        case 3:
                            System.out.println("Brownie with Ice Cream - ₹180");
                            acceptPlateValue(180, "Brownie with Ice Cream - ₹180");
                            break;

                        default:
                            System.err.println("Error: Invalid choice passed to function: handleBackToMenu();");
                            break;
                    }
                    break;

                default:
                    System.err.println("Error: Proper flag not passed to function: handleBackToMenu();");
                    break;
            }
        } else {
            System.out.print("Invalid choice: Please enter a valid option: ");
            handleBackToMenu(flag);
        }
    }

    public static void main(String args[]) {
        HotelManagement ob = new HotelManagement();
        ob.Input();
        ob.viewMenu();
    }
}