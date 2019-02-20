package org.kiran.nbos.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.kiran.nbos.messenger.model.Message;

public class MessageService {
	public List<Message> getAllMessages(){
		Message m1=new Message(1,"Good Morning","Kiran");
		Message m2=new Message(2,"Good Night","Kumar");
		List<Message> listOfMessages=new ArrayList<Message>();
		listOfMessages.add(m1);
		listOfMessages.add(m2);
		return listOfMessages;
	}

}
