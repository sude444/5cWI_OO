package at.bas.projects.ticket;

public class UI {
    private Controller controller;
    private Scanner scanner;
    private CashDispenser cashDispenser;

    // Konstruktor mit Abhängigkeiten
    public UI(Controller controller, Scanner scanner, CashDispenser cashDispenser) {
        this.controller = controller;
        this.scanner = scanner;
        this.cashDispenser = cashDispenser;
    }

    // Methode, die ausgeführt wird, wenn ein Button gedrückt wird
    public void buttonPressed() {
        System.out.println("Button wurde gedrückt.");
        controller.CreateTicket(); // Methode in camelCase umbenannt
    }

    // Methode, um Geld einzuzahlen
    public void insertMoney(double betrag) {
        System.out.println(betrag + "€ eingeworfen.");

        double preis = scanner.getPrice(); // Preis in eine Variable speichern, um Redundanz zu vermeiden

        if (betrag >= preis) {
            scanner.getTicket().setPayedTimeStamp(System.currentTimeMillis());
            double wechselgeld = betrag - preis;
            cashDispenser.returnChange(wechselgeld);
        } else {
            double nochZuZahlen = preis - betrag;
            System.out.println("Noch zu zahlen: " + nochZuZahlen + "€");
        }
    }
}