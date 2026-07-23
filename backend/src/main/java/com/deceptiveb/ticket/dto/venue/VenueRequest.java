package com.deceptiveb.ticket.dto.venue;

import java.util.List;

public record VenueRequest(
        Integer id,
        String name,
        Integer destinationId,
        List<CreateSectionRequest> sections
) {
}
