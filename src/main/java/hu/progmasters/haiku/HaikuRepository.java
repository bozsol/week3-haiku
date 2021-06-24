package hu.progmasters.haiku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class HaikuRepository {

    private final Random random;

    public HaikuRepository(Random random) {
        this.random = random;
    }

    private final List<List<String>> dictionary = new ArrayList<>(List.of(

            new ArrayList<>(List.of("life", "love", "world", "me", "day", "one", "heart", "home", "man", "end", "king",
                    "sky", "death", "time", "tree", "soul", "pain", "rain", "flame")),

            new ArrayList<>(List.of("perfect", "princess", "water", "people", "future", "happy", "freedom", "thousand",
                    "nature", "city", "father", "monster", "river", "nothing", "broken", "children", "mountain",
                    "journey", "secret", "mother", "fire")),

            new ArrayList<>(List.of("family", "happiness", "animal", "adventure", "dangerous", "harmony", "melody",
                    "perfection", "tomorrow", "medicine", "funeral", "innocent", "different", "paradise", "accident",
                    "fantasy", "character", "afterlife", "confusion", "abstinence"))
    ));

    public String getWord(int syllable) {
        List<String> subDictionary = dictionary.get(syllable - 1);
        return subDictionary.get(random.nextInt(subDictionary.size()));
    }

    public boolean addWord(int syllable, String word) {
        List<String> subDictionary = dictionary.get(syllable - 1);
        if (!subDictionary.contains(word)) {
            return subDictionary.add(word);
        } else {
            return false;
        }
    }

    public boolean deleteWord(String word) {
        return dictionary.get(0).remove(word) || dictionary.get(1).remove(word) || dictionary.get(2).remove(word);
    }
}
