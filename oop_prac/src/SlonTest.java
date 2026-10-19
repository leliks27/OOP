import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlonTest {

    @Test
    void testReplyFormatsCorrectly() {
        Slon bot = new Slon();
        String response = bot.getReply("не хочу");
        assertTrue(response.contains("\"не хочу\""));
        assertTrue(response.contains("А ты купи слона!"));
    }

    @Test
    void testHelpCommandReturnsHelpText() {
        Slon bot = new Slon();
        assertEquals(bot.getHelp(), bot.getReply("\\help"));
    }

    @Test
    void testExitCommandIsRecognized() {
        Slon bot = new Slon();
        assertTrue(bot.isExitCommand("\\exit"));
        assertFalse(bot.isExitCommand("обычный текст"));
    }
}