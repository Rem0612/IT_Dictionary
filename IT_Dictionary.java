

import java.util.Scanner;

public class IT_Dictionary {

//this are all the data
    static String[] data = new String[15];

    public static void main(String[] args) {

        data[0] = "API: Application Programming Interface; a set of rules for building software.";
        data[1] = "Bandwidth: The maximum amount of data that can be transmitted over a network.";
        data[2] = "Cloud Computing: Storing and accessing data and programs over the internet.";
        data[3] = "Debugging: The process of identifying and removing errors from computer hardware or software.";
        data[4] = "Encryption: The process of converting information or data into a code to prevent unauthorized access.";
        data[5] = "Firewall: A security system that monitors and controls incoming and outgoing network traffic.";
        data[6] = "GUI: Graphical User Interface; a visual way of interacting with a computer using items such as windows and icons.";
        data[7] = "HTTP: Hypertext Transfer Protocol; the foundation of data exchange on the World Wide Web.";
        data[8] = "IP Address: A unique string of characters that identifies each computer using the Internet Protocol.";
        data[9] = "JSON: JavaScript Object Notation; a lightweight data-interchange format.";
        data[10] = "Kernel: The core part of an operating system that manages operations of the computer and hardware.";
        data[11] = "Latency: The delay before a transfer of data begins following an instruction for its transfer.";
        data[12] = "Metadata: A set of data that describes and gives information about other data.";
        data[13] = "Node: A basic unit of a data structure, such as a linked list or tree data structure.";
        data[14] = "Open Source: Software for which the original source code is made freely available and may be redistributed and modified.";

        Scanner input = new Scanner(System.in);

        // enter user input
        System.out.print("enter word: ");
        String response = input.nextLine();

        // delete spaces.
        String cleanInput = response.trim();

        int resultIndex = BinarySearch(data, cleanInput);

        if (resultIndex != -1) {
            System.out.println("Result: " + data[resultIndex]);
        } else {
            System.out.println("Word not found");
        }

    }

    public static int BinarySearch(String[] list, String target) {

        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            String currentWord = list[mid].split(":")[0].trim();

            int comparison = target.compareToIgnoreCase(currentWord);

            if (comparison == 0) {
                return mid;
            } else if (comparison > 0) {
                low = mid + 1;
            } else if (comparison < 0) {
                high = mid - 1;
            }

        }

        return -1;

    }

}
