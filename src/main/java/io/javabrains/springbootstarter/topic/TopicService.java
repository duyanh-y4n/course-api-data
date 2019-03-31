package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "Awesome Course", "some description"),
            new Topic("2", "Ok Course", "some description"),
            new Topic("3", "New Course", "some description"),
            new Topic("4", "Old Course", "some description")
    ));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<Topic>();
        topicRepository.findAll().forEach(topics::add); //crud find all topic object in DB and add to topic
        return topics;
    }
    
    public Topic getTopicById(String id) {
        return this.topicRepository.findById(id).orElse(null);
        //crud find by id, orElse is needed to catch exeption of finding nothing
    }

    public void addTopic(Topic topic){
        this.topicRepository.save(topic); //save new onject to DB
    }

    public void updateTopic(String id, Topic newTopic){
        this.topicRepository.save(newTopic); //same as update, crud save can create or override the old object in DB
    }

    public void deleteTopic(String id){
        this.topicRepository.deleteById(id);
    }

}
