package com.deceptiveb.ticket.mapper.event;

import com.deceptiveb.ticket.dto.event.EventResponse;
import com.deceptiveb.ticket.entity.Event;

import java.util.function.Function;

public class EventResponseMapper implements Function<Event, EventResponse> {

    @Override
    public EventResponse apply(Event event) {
        return new EventResponse(
                event.getId(),
                event.getName(),
                event.getVenue().getName()
        );
    }
}
