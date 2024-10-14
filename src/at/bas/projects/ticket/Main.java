package at.bas.projects.ticket;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Ticket ticket = printer.PrintTicket();

        System.out.println("\n id: " + ticket.getId() + " \n created: " + ticket.getCreatedTimeStamp() + " \n payed: "
                + ticket.getPayedTimeStamp());
    }
}