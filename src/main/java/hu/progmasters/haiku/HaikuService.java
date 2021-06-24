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
        StringBuilder haiku = new StringBuilder();
        haiku.append(getLine(5)).append("\n")
                .append(getLine(7)).append("\n")
                .append(getLine(5));

        return haiku.toString();
    }

    public String getLine(int remainingSyllable) {
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
}
