package com.derster.booknetwork.feedback;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class FeedbackService {

    public Integer save(FeedbackRequest request, Authentication connectedUser) {
        return null;
    }
}
