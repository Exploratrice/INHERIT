import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TasksTest {
    @Test
    public void testSimpleTaskMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSimpleTaskNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Написать");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testEpicMatches() {
        Epic epic = new Epic(55, "Молоко, Яйца, Хлеб");

        boolean actual = epic.matches("Молоко");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testEpicNotMatches() {
        Epic epic = new Epic(55, "Молоко, Яйца, Хлеб");

        boolean actual = epic.matches("Мясо");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMeetingTopicMatches() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения");

        boolean actual = meeting.matches("Выкатка");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMeetingProjectMatches() {
        Meeting meeting = new Meeting(555, "Приложение НетоБанка");

        boolean actual = meeting.matches("Приложение");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMeetingNotMatches() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения");

        boolean actual = meeting.matches("Сайт");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
}
