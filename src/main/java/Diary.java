import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

public class Diary {
    private ArrayList<String> entries;
    private boolean lockStatus;
    public StringBuilder intiStrng = new StringBuilder();

    public Diary() {
        this.entries = new ArrayList<>();
        this.lockStatus = false;
    }

    public Executable writeDiary(String entry) {
        if (entry==null || entry.trim().isEmpty()) {
            throw new IllegalArgumentException("Diary entry cannot be null or empty");
        }

        this.entries.add(entry);
        return null;
    }

    public ArrayList getEntries() {
        return this.entries;
    }

    public String readDiary() {
        for (String i: entries){
            intiStrng.append(i +  '\n');
        }

        return this.intiStrng.toString();
    }

    public boolean lockDiary() {
        return this.lockStatus = true;
    }
}
