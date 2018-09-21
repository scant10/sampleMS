package com.sk.sampleMS.domain.sample.service;

import java.util.*;

import com.sk.sampleMS.domain.sample.model.manyToOne.*;


public interface MessagesService<T> {
	
	public List<Messages> findAll();
	public Messages findById(long id);
	public void save(Messages messages);
}
