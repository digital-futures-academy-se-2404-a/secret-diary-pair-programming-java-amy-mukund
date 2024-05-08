import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    @DisplayName("Throws an error when the user tries to make a diary entry that is empty or null")
    void testThatWriteDiaryThrowsErrorWhenEmptyOrNull() {
        // Arrange
        Diary testDiary = new Diary();

        // Act
        // Assert
        assertThrows(IllegalArgumentException.class, () -> testDiary.writeDiary(" "));
    }

    @Test
    @DisplayName("Changes lock status to locked when lock method is called")
    void testDiaryLockChangesStatusToLocked() {
        //Arrange
        Diary testDiary = new Diary();
        //Act
        boolean lockStatus = testDiary.lockDiary();
        //Assert
        assertEquals(true, lockStatus);
    }
}