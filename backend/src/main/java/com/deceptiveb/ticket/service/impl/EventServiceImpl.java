package com.deceptiveb.ticket.service.impl;

import com.deceptiveb.ticket.dto.event.EventRequest;
import com.deceptiveb.ticket.entity.Event;
import com.deceptiveb.ticket.exception.ResourceNotFoundException;
import com.deceptiveb.ticket.repo.EventRepo;
import com.deceptiveb.ticket.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepo eventRepo;

    @Autowired
    public EventServiceImpl(
            EventRepo eventRepo
    ) {
        this.eventRepo = eventRepo;
    }

    public Event addEvent(EventRequest eventReq) {

    }

    public Event getEvent(Integer eventId) {
        return eventRepo.findById(eventId)
                .orElseThrow(() -> new ResourceNotFoundException("Event", "Id", eventId));
    }
}
