package modi.modi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TestController {

    @GetMapping("/value1")
    public String modi1() {

        return "new modi get";
    }

    @PostMapping("value2")
    public String modi2() {

        return "new modi post";
    }

}
