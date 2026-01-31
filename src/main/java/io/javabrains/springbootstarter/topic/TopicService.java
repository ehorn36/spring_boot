package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/* During startup, Spring automatically creates an instance (a "Bean") of the 
TopicService class and adds it to the Spring Application Context. This allows 
the TopicController class (or any other) to access this object at startup. */
@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
        new Topic(),
        new Topic(),
        new Topic(),
        new Topic("spring", "Spring Framework", "Spring Framework Description")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

}
