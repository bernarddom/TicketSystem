package com.deceptiveb.ticket.service.impl;

import com.deceptiveb.ticket.dto.event.EventRequest;
import com.deceptiveb.ticket.entity.Event;
import com.deceptiveb.ticket.entity.EventSeat;
import com.deceptiveb.ticket.entity.Seat;
import com.deceptiveb.ticket.exception.ResourceNotFoundException;
import com.deceptiveb.ticket.mapper.event.EventRequestMapper;
import com.deceptiveb.ticket.repo.EventRepo;
import com.deceptiveb.ticket.repo.EventSeatRepo;
import com.deceptiveb.ticket.repo.SeatRepo;
import com.deceptiveb.ticket.repo.SectionRepo;
import com.deceptiveb.ticket.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepo eventRepo;
    private final EventSeatRepo eventSeatRepo;
    private final SeatRepo seatRepo;
    private final EventRequestMapper eventRequestMapper;

    @Autowired
    public EventServiceImpl(
            EventRequestMapper eventRequestMapper,
            EventRepo eventRepo,
            SectionRepo sectionRepo,
            SeatRepo seatRepo,
            EventSeatRepo eventSeatRepo
    ) {
        this.eventRepo = eventRepo;
        this.eventRequestMapper = eventRequestMapper;
        this.seatRepo = seatRepo;
        this.eventSeatRepo = eventSeatRepo;
    }

    public Event addEvent(EventRequest eventReq) {
        Event event = eventRequestMapper.apply(eventReq);

        List<Seat> eventSeats = seatRepo.findAllBySectionVenueId(event.getId());
        eventSeats.stream().map(i -> eventSeatRepo.save(new EventSeat()));
        return this.eventRepo.save(event);
    }

    public Event getEvent(Integer eventId) {
        return eventRepo.findById(eventId)
                .orElseThrow(() -> new ResourceNotFoundException("Event", "Id", eventId));
    }
}
