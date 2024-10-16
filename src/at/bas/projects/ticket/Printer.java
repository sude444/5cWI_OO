package at.bas.projects.ticket;

public class Printer {

    public Ticket PrintTicket() {
        Ticket ticket = new Ticket();
        System.out.println("\n id: " + ticket.getId() + " \n created: " + ticket.getCreatedTimeStamp() + " \n payed: "
                + ticket.getPayedTimeStamp());
        return ticket;
    }
}