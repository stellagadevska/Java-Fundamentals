import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            String[] parts = scanner.nextLine().split("_");

            Song song = new Song(parts[0], parts[1], parts[2]);
            songs.add(song);
        }

        String printCommand = scanner.nextLine();


        if (printCommand.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (printCommand.equals(song.getTypeList())) {
                    System.out.printf("%s%n", song.getName());
                }
            }
        }

    }
}
