import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (workbook 6.12)
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2;

        ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;

        printTicketNumbers(ticket, 1);  
        printTicketNumbers(ticket2, 2);  
    } 

    public static void printTicketNumbers(int[] numbers, int name) {
        System.out.print("Ticket " + name + " numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
    }
    
}

