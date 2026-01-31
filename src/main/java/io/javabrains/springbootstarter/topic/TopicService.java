package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/* During startup, Spring automatically creates an instance (a "Bean") of the 
TopicService class and adds it to the Spring Application Context. This allows 
the TopicController class (or any other) to access this object at startup. */
@Service
public class TopicService {

    
    private List<Topic> topics = new ArrayList <> (Arrays.asList(
        new Topic("spring", "Spring Framework", "Spring Framework Description"),
        new Topic("java", "Core Java", "Core Java Description"),
        new Topic("javascript", "JavaScript", "JavaScript Framework Description"),
        new Topic()
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }


    public Topic getTopic(String id) {

        /* 
            .stream() --> Iterates over the list
            .filter() --> Tests if the object is legitimate
            t -> t.get() --> Lambda expression where the current element is assigned to 't'
                             and then t.getId() is called
            .getId() --> t is a Topic object, and .getId() is a class method
            .equals() --> Inherited from String class to compare text 
            .findFirst() --> Method of .stream(); returns an 'Optional' object
            .get() --> Method of the Optional class, returns the actual element found.
         */
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

}
