package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    // @RequestMapping("/topics")
    // public String getAllTopics() {
    //     return "All Topics";
    // }

    /* Spring Boot created an instance of the TopicService class elsewhere 
    and can be accessed by ininitalizing an instance of the class using @Autowired. */
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    /* Use {} in the URL request path to indicate a variable
    Use the @PathVariable annotation to pass the variable to the function */
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }


}
