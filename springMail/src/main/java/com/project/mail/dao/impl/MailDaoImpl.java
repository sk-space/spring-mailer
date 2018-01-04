package com.project.mail.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.mail.dao.MailDao;
import com.project.mail.model.Mailer;

@Repository
public class MailDaoImpl implements MailDao{
	
	private SessionFactory sessionFactory;
	private Session session;

	@Override
	@Transactional
	public int sentEmail(Mailer m) {
		session = sessionFactory.getCurrentSession();
		try {
			session.save(m);		
			return 1; 
		} catch (Exception e) {
			e.getMessage();
			return 0;
		}
	}

}
