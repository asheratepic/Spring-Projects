package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//spring data jpa will provide some implementation for CrudRepository
public interface CourseRepository extends CrudRepository<Course, String> {
	
	//Spring will provide implementation based on property name
	public List<Course> findByName(String name);
	
	//Spring looks at object Topic and looks for an id property 
	public List<Course> findByTopicId(String topicId);
	
}
