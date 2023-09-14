package com.project.contactmessage.repository;

import com.project.contactmessage.entity.ContactMessage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ContactMessageRepository extends JpaRepository<ContactMessage,Long> {

   Page<ContactMessage> findByEmailEquals(String email, Pageable pageable);//burada bir hata alırsak bu iki yerde
   //olabilir biri service katinda digeri burada olmustur.
   Page<ContactMessage> findBySubjectEquals(String subject, Pageable pageable);

   Page<ContactMessage> findByStartDateBetweenDate1AndDate2(LocalDateTime localDateTime, LocalDateTime localDateTime2, Pageable pageable);
}