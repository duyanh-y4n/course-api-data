package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired //Dependency injection
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return this.topicService.getAllTopics();
    }

    @RequestMapping("/topics/{foo}") //foo is path variabale
    public Topic getTopicById(@PathVariable("foo") String id) { //foo here is passed into id parameter
        return this.topicService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics") //POST request
    // expect a Topic object in request body as payload, and then pass it to methode
    public void addTopic(@RequestBody Topic topic) {
        this.topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}") //PUT request
    public void updateTopicById(@PathVariable String id, @RequestBody Topic newTopic){
        this.topicService.updateTopic(id, newTopic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "topics/{id}")
    public void deleteTopic(@PathVariable String id){
        this.topicService.deleteTopic(id);
    }

}
