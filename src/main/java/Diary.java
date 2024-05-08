import java.util.ArrayList;

public class Diary {
    private ArrayList<String> entries;
    public StringBuilder intiStrng = new StringBuilder();

    public Diary() {
        this.entries = new ArrayList<>();
    }

    public void writeDiary(String entry) {
        if (entry==null || entry.trim().isEmpty()) {
            return;
        }

        this.entries.add(entry);
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
}
