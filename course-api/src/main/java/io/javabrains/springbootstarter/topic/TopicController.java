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

//	@RequestMapping("/topics")
//	public String getAllTopics() {
//		return "All Topics";
//	}
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public String addTopic(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public String updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		return topicService.addTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value= "/topics/{id}")
	public String deleteTopic(@PathVariable String id) {
		return topicService.deleteTopic(id);
	}
}
