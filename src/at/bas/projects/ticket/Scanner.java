package at.bas.projects.ticket;

public class Scanner {
    private Ticket ticket;

    public void InsertTicket(Ticket insertedTicket) {
        ticket = insertedTicket;
    }

    public double getPrice() {
        if (ticket != null) {
            float price = (System.currentTimeMillis() - ticket.getCreatedTimeStamp()) / 1000 * 60;
            return price;
        }
        System.out.println("Warnung: Kein Ticket im Scanner!");
        return 0;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
