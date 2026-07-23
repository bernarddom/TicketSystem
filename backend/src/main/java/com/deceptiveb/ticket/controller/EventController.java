package com.deceptiveb.ticket.controller;

import com.deceptiveb.ticket.dto.event.EventRequest;
import com.deceptiveb.ticket.dto.event.EventResponse;
import com.deceptiveb.ticket.service.EventService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event")
public class EventController {
    private final EventService eventService;
    public EventController(
            EventService eventService
    ) {
        this.eventService = eventService;
    }

    @GetMapping
    public ResponseEntity<EventResponse> getEvent(
            @Valid @RequestBody EventRequest eventRequest
    ) {
        EventResponse er = eventService.addEvent(eventRequest);
        return ResponseEntity.ok().body(null);
    }
}
