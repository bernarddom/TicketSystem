package com.deceptiveb.ticket.dto.venue;

public record CreateSeatRequest(
        String row,
        Integer number,
        int x,
        int y
) {
}
