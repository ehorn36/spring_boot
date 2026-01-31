package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    Use the @PathVariable annotation to pass the variable to the function. 
    Keep the variable names the same. */
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    /* Identifies the HTTP request as POST (Default == Get) 
    The @RequestBody annotation tells Spring Boot the JSON body of the 
    request contains a Topic object and to pass that object to addTopic(). */
    @RequestMapping(method=RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }


}
