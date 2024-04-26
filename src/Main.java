import hogwarts.GryffindorStudent;
import hogwarts.HufflepuffStudent;
import hogwarts.RavenclawStudent;
import hogwarts.SlytherinStudent;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        GryffindorStudent potter = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent weaslty = generateGryffindorStudent("Рон Уизли");
        SlytherinStudent malfoy = generateSlytherinStudent("Драко Малфой");

        potter.compareTo(weaslty);
        potter.compareToHogwartsStudent(malfoy);

        potter.print();
        weaslty.print();
        malfoy.print();
    }

    private static GryffindorStudent generateGryffindorStudent(String name){
        return new GryffindorStudent(
                name,
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100)
        );
    }

    private static HufflepuffStudent generateHufflepuffStudent(String name){
        return new HufflepuffStudent(
                name,
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100)
        );
    }

    private static RavenclawStudent generateRavenclawStudent(String name){
        return new RavenclawStudent(
                name,
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100)
        );
    }

    private static SlytherinStudent generateSlytherinStudent(String name){
        return new SlytherinStudent(
                name,
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100)
        );
    }

}