import java.util.ArrayList;

public class Diary {
    private ArrayList<String> entries;
    public StringBuilder intiStrng = new StringBuilder();

    public Diary() {
        this.entries = new ArrayList<>();
    }

    public void writeDiary(String entry) {
        this.entries.add(entry);
    }

    public ArrayList getEntries() {
        return this.entries;
    }

    public String readDiary() {

        for (String i: entries){

            intiStrng.append(i +  '\n');
            //intiStrng += i;
        }

        return this.intiStrng.toString();
    }
}
