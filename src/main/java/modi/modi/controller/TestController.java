package modi.modi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String modi1() {

        return "new modi get";
    }

    @PostMapping
    public String modi2() {

        return "new modi post";
    }

}
