package class_programs;
abstract class game {

    abstract void play();
//    void play()
//    {
//        System.out.println("hello");
//    }

}

class cricket extends game {

    void play() {
        System.out.println("cricket");
    }
}

class Tennis extends game {

    void play() {
        System.out.println("Tennis");
    }
}

public class Task4 {

    public static void main(String[] args) {
        cricket c = new cricket();
        c.play();
        Tennis t = new Tennis();
        t.play();
    }
}
