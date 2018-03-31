package me.spring.boot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Byungwook Lee on 2018-03-31
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
public interface MeetingRepository extends JpaRepository<Meeting, Long> {
}
