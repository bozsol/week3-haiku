package hu.progmasters.haiku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController
public class HaikuController {

    @Autowired
    HaikuService service;

    @GetMapping
    public ResponseEntity<String> getHaiku() {
        return new ResponseEntity<>(service.getHaiku(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> setWord(@RequestBody AddWordCommand addWordCommand) {
        try {
            if (service.addWord(addWordCommand)) {
                return new ResponseEntity<>("Word successfully added to dictionary!", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Word already exists in dictionary!", HttpStatus.ALREADY_REPORTED);
            }
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Syllable count can be 1, 2 or 3!");
        }
    }

    @DeleteMapping
    public ResponseEntity<String> deleteWord(@RequestBody Map<String, String> json) {
        if (service.deleteWord(json.get("word"))) {
            return new ResponseEntity<>("Word deleted.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Word not found!", HttpStatus.NOT_FOUND);
        }
    }
}
