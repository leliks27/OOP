import java.util.Scanner;

public class SlonCli {
    public static void main(String[] args) {
        Slon bot = new Slon();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(bot.getIntro() + "\n");

            while (true) {
                String input = scanner.nextLine();

                if (bot.isExitCommand(input)) {
                    break;
                }

                String response = bot.getReply(input);
                System.out.println("\n" + response + "\n");
            }
        }
    }
}