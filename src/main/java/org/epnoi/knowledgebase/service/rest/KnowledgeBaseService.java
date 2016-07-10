package org.epnoi.knowledgebase.service.rest;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class KnowledgeBaseService {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    String home() {
        return "the knowledge base is up and running!!!!";
    }
}

