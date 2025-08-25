
class Event {
    protected String eventId;
    protected String eventName;
    protected String date;
    protected String venue;

    protected int durationHours;
    protected String theme;
    protected int maxTeamSize;

    public Event(String eventId, String eventName, String date, String venue,
                 int durationHours, String theme, int maxTeamSize) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.date = date;
        this.venue = venue;
        this.durationHours = durationHours;
        this.theme = theme;
        this.maxTeamSize = maxTeamSize;
    }

    public void displayEventDetails() {
        System.out.println("Event ID: " + eventId);
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Venue: " + venue);
        System.out.println("Duration (Hours): " + durationHours);
        System.out.println("Theme: " + theme);
        System.out.println("Max Team Size: " + maxTeamSize);
    }
}


interface Registrable {
    void registerParticipant(String name);
    void showParticipants();
}


class CodingEvent extends Event implements Registrable {
    private String[] participants;
    private int count;

//parameterized constructor
    public CodingEvent(String eventId, String eventName, String date, String venue,
                       int durationHours, String theme, int maxTeamSize) {
        super(eventId, eventName, date, venue, durationHours, theme, maxTeamSize);
        this.participants = new String[maxTeamSize];
        this.count = 0;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("\n=== Coding Event Details ===");
        super.displayEventDetails();
    }

    @Override
    public void registerParticipant(String name) {
        if (count < maxTeamSize) {
            participants[count++] = name;
            System.out.println(name + " registered successfully for " + eventName);
        } else {
            System.out.println("Registration full for " + eventName);
        }
    }

    @Override
    public void showParticipants() {
        System.out.print("Participants in " + eventName + ": ");
        for (int i = 0; i < count; i++) {
            System.out.print(participants[i] + (i < count - 1 ? ", " : ""));
        }
        System.out.println();
    }
}


class RoboticsEvent extends Event implements Registrable {
    private String[] participants;
    private int count;

    public RoboticsEvent(String eventId, String eventName, String date, String venue,
                         int durationHours, String theme, int maxTeamSize) {
        super(eventId, eventName, date, venue, durationHours, theme, maxTeamSize);
        this.participants = new String[maxTeamSize];
        this.count = 0;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("\n=== Robotics Event Details ===");
        super.displayEventDetails();
    }

    @Override
    public void registerParticipant(String name) {
        if (count < maxTeamSize) {
            participants[count++] = name;
            System.out.println(name + " registered successfully for " + eventName);
        } else {
            System.out.println("Registration full for " + eventName);
        }
    }

    @Override
    public void showParticipants() {
        System.out.print("Participants in " + eventName + ": ");
        for (int i = 0; i < count; i++) {
            System.out.print(participants[i] + (i < count - 1 ? ", " : ""));
        }
        System.out.println();
    }
}


class HackathonEvent extends Event implements Registrable {
    private String[] participants;
    private int count;

    public HackathonEvent(String eventId, String eventName, String date, String venue,
                          int durationHours, String theme, int maxTeamSize) {
        super(eventId, eventName, date, venue, durationHours, theme, maxTeamSize);
        this.participants = new String[maxTeamSize];
        this.count = 0;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("\n=== Hackathon Event Details ===");
        super.displayEventDetails();
    }

    @Override
    public void registerParticipant(String name) {
        if (count < maxTeamSize) {
            participants[count++] = name;
            System.out.println(name + " registered successfully for " + eventName);
        } else {
            System.out.println("Registration full for " + eventName);
        }
    }

    @Override
    public void showParticipants() {
        System.out.print("Participants in " + eventName + ": ");
        for (int i = 0; i < count; i++) {
            System.out.print(participants[i] + (i < count - 1 ? ", " : ""));
        }
        System.out.println();
    }
}
public class Eventmangementsystem {
    public static void main(String[] args) {
        // Polymorphic array of events
        Event[] events = new Event[3];
        events[0] = new CodingEvent("C01", "CodeStorm", "10-Sep-2025", "Lab A", 3, "DSA Challenges", 3);
        events[1] = new RoboticsEvent("R01", "RoboRace", "11-Sep-2025", "Ground", 2, "AI-Powered Bots", 5);
        events[2] = new HackathonEvent("H01", "HackTheFuture", "12-Sep-2025", "Auditorium", 24, "Smart Cities", 4);

        // Register participants
        Registrable reg1 = (Registrable) events[0];
        reg1.registerParticipant("Alice");
        reg1.registerParticipant("Bob");
        reg1.registerParticipant("Charlie");
        reg1.registerParticipant("David"); // should fail

        Registrable reg2 = (Registrable) events[1];
        reg2.registerParticipant("Eve");
        reg2.registerParticipant("Frank");

        Registrable reg3 = (Registrable) events[2];
        reg3.registerParticipant("Grace");
        reg3.registerParticipant("Heidi");
        reg3.registerParticipant("Ivan");
        reg3.registerParticipant("Jack");
        reg3.registerParticipant("Ken"); // should fail

        // Display event details + participants
        System.out.println("\n--- Event Details ---");
        for (Event e : events) {
            e.displayEventDetails(); // polymorphic call
            ((Registrable) e).showParticipants();
            System.out.println("----------------------");
        }
    }
}
