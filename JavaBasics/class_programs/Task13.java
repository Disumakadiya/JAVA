import java.util.Random;

class TicketSystem {
    private int ticketsAvailable = 10;

    // Synchronize to ensure thread safety
    public synchronized void bookTicket(int count) {
        if (count <= ticketsAvailable) {
            ticketsAvailable -= count;
            System.out.printf("[%s] Booked %d tickets. Tickets left: %d%n",
                    Thread.currentThread().getName(), count, ticketsAvailable);
        } else {
            System.out.printf("[%s] Booking %d tickets FAILED. Only %d tickets left.%n",
                    Thread.currentThread().getName(), count, ticketsAvailable);
        }
    }

    public synchronized void cancelTicket(int count) {
        ticketsAvailable += count;
        System.out.printf("[%s] Cancelled %d tickets. Tickets left: %d%n",
                Thread.currentThread().getName(), count, ticketsAvailable);
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }
}

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        TicketSystem system = new TicketSystem();
        Runnable userSession = () -> {
            Random rand = new Random();
            for (int i = 0; i < 5; i++) { // Repeat several times
                int bookCount = rand.nextInt(3) + 1; // 1-3
                system.bookTicket(bookCount);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                int cancelCount = rand.nextInt(2) + 1; // 1-2
                system.cancelTicket(cancelCount);
            }
        };

        Thread t1 = new Thread(userSession, "User-1");
        Thread t2 = new Thread(userSession, "User-2");
        Thread t3 = new Thread(userSession, "User-3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final tickets available: " + system.getTicketsAvailable());
    }
}