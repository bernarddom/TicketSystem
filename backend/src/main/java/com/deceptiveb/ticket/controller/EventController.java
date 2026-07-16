package com.deceptiveb.ticket.controller;

import com.deceptiveb.ticket.dto.event.EventResponse;
import com.deceptiveb.ticket.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    public ResponseEntity<EventResponse> getEvent() {
        EventResponse er = eventService.f
        return ResponseEntity.ok().body(null);
    }
}
