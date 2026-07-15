package com.deceptiveb.ticket.dto.event;

import java.time.LocalDateTime;

public record EventRequest(
    Integer venueId,
    String name,
    LocalDateTime eventDate
) {
}
