public class Slon {
    public String getIntro() {
        return "Привет!\nЯ - продавец слона\nДля справки используй \\help или\nКупи слона!";
    }

    public String getHelp() {
        return "Я - бот-дразнилка. На любую твою фразу я буду предлагать купить слона.\nПросто напиши мне что-нибудь.";
    }

    public boolean isExitCommand(String userInput) {
        return "\\exit".equals(userInput);
    }

    public String getReply(String userInput) {
        if ("\\help".equals(userInput)) {
            return getHelp();
        }
        return "Все говорят \"" + userInput + "\".\nА ты купи слона!";
    }
}