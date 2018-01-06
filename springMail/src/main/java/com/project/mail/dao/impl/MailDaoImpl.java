package com.project.mail.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateJdbcException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.mail.dao.MailDao;
import com.project.mail.model.Mailer;

@Repository
public class MailDaoImpl implements MailDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;

	@Override
	@Transactional
	public boolean sentEmail(Mailer m) {
//		System.out.println("From Email: "+m.getFrom_email());
//		System.out.println("To Email: "+m.getTo_email());
//		System.out.println("Subject: "+m.getSubject_email());
//		System.out.println("Message: "+m.getMessage_email());
//		System.out.println("Created At: "+m.getCreatedAt());
		session = sessionFactory.getCurrentSession();
		try {
		if(session.save(m) != null) {
			return true;
		}}catch(HibernateJdbcException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
//		session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(m);
//        session.getTransaction().commit();
	}

}
