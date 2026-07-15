package com.deceptiveb.ticket.mapper.event;

import com.deceptiveb.ticket.dto.event.EventRequest;
import com.deceptiveb.ticket.entity.Event;
import com.deceptiveb.ticket.entity.Venue;
import com.deceptiveb.ticket.exception.ResourceNotFoundException;
import com.deceptiveb.ticket.repo.VenueRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

public class EventRequestMapper implements Function<EventRequest, Event> {
    private final VenueRepo venueRepo;

    @Autowired
    public EventRequestMapper(
            VenueRepo venueRepo
            ) {
        this.venueRepo = venueRepo;
    }

    @Override
    public Event apply(EventRequest eventReq) {
        Venue venue = venueRepo.findById(eventReq.venueId())
                .orElseThrow(() -> new ResourceNotFoundException("Venue", "id", eventReq.venueId()));
        return new Event(
                venue,
                eventReq.eventDate(),
                eventReq.name()
        );
    }
}
