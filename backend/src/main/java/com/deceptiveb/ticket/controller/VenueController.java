package com.deceptiveb.ticket.controller;

import com.deceptiveb.ticket.dto.venue.VenueRequest;
import com.deceptiveb.ticket.dto.venue.VenueResponse;
import com.deceptiveb.ticket.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/venue")
public class VenueController {
    private final VenueService venueService;

    @Autowired
    public VenueController(
            VenueService venueService
    ){
        this.venueService = venueService;
    }

    private VenueResponse getVenue(VenueRequest venueRequest) {
        return null;
    }
}
