package com.wellingtonpn.emailsender.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellingtonpn.emailsender.model.EmailSenderModel;

public interface EmailSenderRepository extends JpaRepository<EmailSenderModel, Long>{

}
