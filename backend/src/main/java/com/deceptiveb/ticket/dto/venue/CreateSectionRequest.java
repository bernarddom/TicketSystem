package com.deceptiveb.ticket.dto.venue;

import java.util.List;

public record CreateSectionRequest(
        String name,
        List<CreateSeatRequest> seats
) {
}
