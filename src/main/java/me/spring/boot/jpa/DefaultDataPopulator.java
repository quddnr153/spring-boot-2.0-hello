package me.spring.boot.jpa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author Byungwook Lee on 2018-03-31
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Component
public class DefaultDataPopulator implements ApplicationRunner {
	@Autowired
	MeetingRepository meetingRepository;

	@Autowired
	PersonRepository personRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Person person = new Person();
		person.setEmail("quddnr153@gmail.com");
		person.setName("bw");
		person.setJoined(new Date());
		personRepository.save(person);

		System.out.println(personRepository.findByEmail(person.getEmail()));

		Meeting meeting = new Meeting();
		meeting.setTitle("New Meeting");
		meeting.setLocation("Suwon");
		meetingRepository.save(meeting);
	}
}
