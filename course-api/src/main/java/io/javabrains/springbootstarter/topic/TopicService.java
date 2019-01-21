package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(
				      new Topic("politics","Washington Politics","Current affairs at the hill"),		
				      new Topic("java","Head First Java","Best book for java in market"),		
				      new Topic("spring","Spring in Action","Covers great examples")		
						));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public String addTopic(Topic topic) {
		if(topics.add(topic))
			return "successfully added";
		else
			return "failed";
	}

	public String addTopic(String id, Topic topic) {
		for(int i=0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				break;
			}
		}
		return "success";
	}

	public String deleteTopic(String id) {
		if (topics.removeIf(t -> t.getId().equals(id)))
			return "success";
		else
			return "nothing removed";
	}
}
