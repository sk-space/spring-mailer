package com.project.mail.dao;

import com.project.mail.model.Mailer;

public interface MailDao {

	public int sentEmail(Mailer m);
	
}
