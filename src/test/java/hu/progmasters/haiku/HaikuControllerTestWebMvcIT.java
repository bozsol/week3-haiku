package hu.progmasters.haiku;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = HaikuController.class)
class HaikuControllerTestWebMvcIT {

    @MockBean
    HaikuService service;

    @Autowired
    MockMvc mockMvc;

    @Test
    void getHaiku() throws Exception {

        String haiku = "happy confusion\n" +
                "heart character family\n" +
                "day man monster tree\n";

        when(service.getHaiku()).thenReturn(haiku);

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(haiku)));
    }
}