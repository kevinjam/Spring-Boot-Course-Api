package course_api.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import topic.Topic;

@Service
public class TopicService {
	private List<Topic> topics =new ArrayList<>(Arrays.asList(
			
			new Topic("student", "st.lawrence", "it students"),
			new Topic("Lecturer", "Muk", "it students"),
			new Topic("Programers", "Cave", "it students"),
			new Topic("Hackers", "Loui", "it students")
			));
	
	public List<Topic> getAllTopic(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		 topics.add(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		for(int i =0; i< topics.size(); i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
			
			return;
			}
			
			
		}
		
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t->t.getId().equals(id));
		
	}
	


}
