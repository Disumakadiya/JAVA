abstract class Instrument {
    abstract void play();
    abstract String what();
    abstract void adjust();
}

class Wind extends Instrument {
    public void play() {
        System.out.println("Wind instrument played");
    }
    public String what() {
        return "Wind instrument";
    }
    public void adjust() {
        System.out.println("Wind instrument tuned properly");
    }
}

class Woodwind extends Wind {
    public void play() {
        System.out.println("Woodwind instrument played");
    }
    public String what() {
        return "Woodwind instrument";
    }
}

class Brass extends Wind {
    public void play() {
        System.out.println("Brass instrument played");
    }
    public String what() {
        return "Brass instrument";
    }
}

class Percussion extends Instrument {
    public void play() {
        System.out.println("Percussion instrument played");
    }
    public String what() {
        return "Percussion instrument";
    }
    public void adjust() {
        System.out.println("Percussion instrument tuned properly");
    }
}

class Stringed extends Instrument {
    public void play() {
        System.out.println("Stringed instrument played");
    }
    public String what() {
        return "Stringed instrument";
    }
    public void adjust() {
        System.out.println("Stringed instrument tuned properly");
    }
}

public class Task11 {
    public static void main(String[] args) {
        Instrument[] instruments = {
            new Woodwind(),
            new Brass(),
            new Percussion(),
            new Stringed()
        };

        for (Instrument inst : instruments) {
            inst.play();
            System.out.println(inst.what());
            inst.adjust();
            System.out.println();
        }
    }
}
