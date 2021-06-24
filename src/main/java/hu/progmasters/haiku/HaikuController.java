package hu.progmasters.haiku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaikuController {

    @Autowired
    HaikuService service;

    @GetMapping
    public ResponseEntity<String> getHaiku() {
        return new ResponseEntity<>(service.getHaiku(), HttpStatus.OK);
    }
}
