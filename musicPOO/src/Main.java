import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Music music = new Music();

        music.name = "D&$";
        music.artist = "DESSIIIK";
        music.realease = 2025;
        music.duration = 2.00;
        music.gender = "HIP-HOP/RAP";

        music.technicalSheet();

        music.countAvaliation(10);
        music.countAvaliation(10);
        music.countAvaliation(7);
        music.countAvaliation(8);

        double mediaAvaliation = music.avaliation();
        System.out.println("Avaliation: " + mediaAvaliation);

    }
}