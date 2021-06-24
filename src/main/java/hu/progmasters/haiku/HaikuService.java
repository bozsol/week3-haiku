package hu.progmasters.haiku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class HaikuService {

    @Autowired
    private Random random;

    @Autowired
    private HaikuRepository repository;

    public String getHaiku() {
        return getLine(5) + "\n" +
                getLine(7) + "\n" +
                getLine(5);
    }

    public boolean addWord(AddWordCommand addWordCommand) {
        return repository.addWord(addWordCommand.getSyllableCount(), addWordCommand.getWord().toLowerCase());
    }

    private String getLine(int remainingSyllable) {
        List<String> line = new ArrayList<>();
        while (remainingSyllable > 0) {
            int bound = Math.min(remainingSyllable, 3);
            int syllable = random.nextInt(bound+1);
            String word = repository.getWord(syllable);
            if (!word.isBlank()) {
                line.add(repository.getWord(syllable));
            }
            remainingSyllable -= syllable;
        }
        return String.join(" ", line);
    }

    public boolean deleteWord(String word) {
        return repository.deleteWord(word);
    }
}
