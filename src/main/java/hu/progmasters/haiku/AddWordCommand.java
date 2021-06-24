package hu.progmasters.haiku;

public class AddWordCommand {
    private int syllableCount;
    private String word;

    public AddWordCommand() {
    }

    public int getSyllableCount() {
        return syllableCount;
    }

    public AddWordCommand setSyllableCount(int syllableCount) {
        this.syllableCount = syllableCount;
        return this;
    }

    public String getWord() {
        return word;
    }

    public AddWordCommand setWord(String word) {
        this.word = word;
        return this;
    }
}
