package com.deceptiveb.ticket.service;

import com.deceptiveb.ticket.dto.event.EventRequest;
import com.deceptiveb.ticket.dto.event.EventResponse;
import com.deceptiveb.ticket.entity.Event;

public interface EventService {

    EventResponse addEvent(EventRequest eventReq);

    Event getEvent(Integer eventId);
}
