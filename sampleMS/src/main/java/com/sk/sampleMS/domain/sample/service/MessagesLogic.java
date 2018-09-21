package com.sk.sampleMS.domain.sample.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import com.sk.sampleMS.domain.sample.model.manyToOne.*;
import com.sk.sampleMS.domain.sample.repository.*;


/**
 * <pre>
 * 
 * History
 * - 2018. 9. 19. | P126458 | 최초작성.
 * </pre>
 */
@Transactional
@Service
public class MessagesLogic implements MessagesService<MessagesService> {

        @Autowired
	private GuestRepository guestRepository;
        @Autowired
        private MessagesRopository messagesRopository;
	
	public MessagesLogic(){
		super();
	}
	
	@Override
	public List<Messages> findAll() {
		return messagesRopository.findAll();
	}

	@Override
	public Messages findById(long id) {
		return messagesRopository.findOne(id);
	}
        
        @Override
        public void save(Messages messages) {
            messagesRopository.save(messages);            
        }

}
