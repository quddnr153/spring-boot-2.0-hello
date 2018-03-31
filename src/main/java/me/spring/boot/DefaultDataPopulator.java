package me.spring.boot;

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

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Meeting meeting = new Meeting();
		meeting.setTitle("New Meeting");
		meeting.setStartAt(new Date());
		meetingRepository.save(meeting);

		meetingRepository.findAll().forEach(meeeting -> {
			System.out.println("============");
			System.out.println(meeeting.getTitle() + " " + meeeting.getStartAt());
		});
	}
}
