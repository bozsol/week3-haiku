package hu.progmasters.haiku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class HaikuRepository {

    @Autowired
    private Random random;

    private  final List<String> oneSyllable = new ArrayList<>(List.of("life","love","world","me","day","one","heart","home","man","end","king","sky","death","time","tree","soul","pain","rain","flame"));
    private final List<String> twoSyllable = new ArrayList<>(List.of("perfect","princess","water","people","future","happy","freedom","thousand","nature","city","father","monster","river","\n" +
            "nothing","broken","children","mountain","journey","secret","mother","fire"));
    private  final List<String> threeSyllable = new ArrayList<>(List.of("family","happiness","animal","adventure","dangerous","harmony","melody","perfection","tomorrow","medicine","\n" +
            "funeral","innocent","different","paradise","accident","fantasy","character","afterlife","confusion","abstinence"));

    public String getWord(int syllable) {
        switch (syllable) {
            case 1:
                return oneSyllable.get(random.nextInt(oneSyllable.size()));
            case 2:
                return twoSyllable.get(random.nextInt(twoSyllable.size()));
            case 3:
                return threeSyllable.get(random.nextInt(threeSyllable.size()));
            default:
                return "";
        }
    }
}
