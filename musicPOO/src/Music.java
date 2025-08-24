import java.util.Scanner;

public class Music {
    String name;
    String artist;
    double duration;
    String gender;
    int realease;
    double SomaAvaliation;
    int totalAvaliation;

    Scanner input = new Scanner(System.in);

    void technicalSheet(){
        System.out.println("Music - " + name);
        System.out.println("Artist - " + artist);
        System.out.println("Duration - " + duration);
        System.out.println(gender);
        System.out.println(realease);
    }

    void countAvaliation(int nota){
        SomaAvaliation += nota;
        totalAvaliation++;

    }

    double avaliation(){
        return SomaAvaliation / totalAvaliation;
    }


}
