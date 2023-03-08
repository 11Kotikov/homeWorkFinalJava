import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<laptops> mVideo = new HashSet<>();

        laptops laptop1 = new laptops("Apple", "MacBook Pro", 15.6, "macOS", "Silver", (short) 512, (byte) 0, (byte) 16, "Intel Core i9", "AMD Radeon Pro 5500M");
        laptops laptop2 = new laptops("HP", "Envy 15", 15.6, "Win10", "Black", (short) 512, (byte) 32, (byte) 16, "Intel Core i7", "NVIDIA GeForce GTX 1660 Ti");
        laptops laptop3 = new laptops("Acer", "Aspire 5", 14, "Win10", "Black", (short) 512, (byte) 0, (byte) 8, "AMD Ryzen 5", "AMD Radeon Graphics");
        laptops laptop4 = new laptops("Lenovo", "ThinkPad X1 Carbon", 14, "Win10", "White", (short) 256, (byte) 0, (byte) 16, "Intel Core i7", "Intel UHD Graphics 620");
        laptops laptop5 = new laptops("Dell", "XPS 15", 15.6, "Linux", "Silver", (short) 512, (byte) 0, (byte) 32, "Intel Core i9", "NVIDIA GeForce GTX 1650 Ti");
        laptops laptop6 = new laptops("Asus", "ZenBook Pro Duo", 15.6, "Win10", "Blue", (short) 512, (byte) 32, (byte) 16, "Intel Core i9", "NVIDIA GeForce RTX 3070");

        mVideo.add(laptop1);
        mVideo.add(laptop2);
        mVideo.add(laptop3);
        mVideo.add(laptop4);
        mVideo.add(laptop5);
        mVideo.add(laptop6);

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Chose options for filter:");
            System.out.println("1 - Laptop label:");
            System.out.println("2 - OS (Win10, Linux, macOS)");
            System.out.println("3 - Colour");
            System.out.println("4 - HDD Size");
            System.out.println("5 - SSD Size");
            System.out.println("6 - RAM Size");
            System.out.println(("7 - List of the laptops for sale:"));
            System.out.println("0 - Exit");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1 -> {
                    System.out.println("Input the label:");
                    String label = input.nextLine();
                    for (laptops laptop : mVideo) {
                        if (laptop.getLabel().equalsIgnoreCase(label)) {
                            System.out.println(laptop);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Input OS (e.g. Win10, Linux, macOS):");
                    String os = input.nextLine();
                    for (laptops laptop : mVideo) {
                        if (laptop.getOs().equalsIgnoreCase(os)) {
                            System.out.println(laptop);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Input color:");
                    String color = input.nextLine();
                    for (laptops laptop : mVideo) {
                        if (laptop.getColor().equalsIgnoreCase(color)) {
                            System.out.println(laptop);
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Input HDD Size:");
                    byte hddSize = input.nextByte();
                    for (laptops laptop : mVideo) {
                        if (laptop.getHddSize() == hddSize) {
                            System.out.println(laptop);
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Input SSD Size:");
                    byte ssdSize = input.nextByte();
                    int count = 1;
                    for (laptops laptop : mVideo) {
                        if (laptop.getSsdSize() == ssdSize) {
                            System.out.println(count + " " + laptop);
                            count++;
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Input RAM Size:");
                    byte ramSize = input.nextByte();
                    int count = 1;
                    for (laptops laptop : mVideo) {
                        if (laptop.getRamSize() == ramSize) {

                            System.out.println(count + " " + laptop.getModel());
                            count++;
                        }
                    }
                }
                case 7 -> {
                    System.out.println("These what we have:");
                    System.out.println(mVideo);
                }
                default -> System.out.println("Wrong number. Try again");
            }
        }
    }
}
