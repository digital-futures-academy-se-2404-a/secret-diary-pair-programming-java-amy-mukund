import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    @Test
    public void testWriteDiaryPassesStringToEntries() {
        // Arrange
        String text = "Hello, world!";
        Diary diary = new Diary();

        // Act
        diary.writeDiary(text);

        // Assert
        assertEquals(diary.getEntries().get(0), text);
    }

    @Test
    void testThatReadDiaryReturnsNonNull() {
        // Arrange

        Diary testDiary = new Diary();
        testDiary.writeDiary("Hellow, world");

        // Act
        String actualEntries = testDiary.readDiary();

        // Assert
        assertNotNull(actualEntries);
    }
}