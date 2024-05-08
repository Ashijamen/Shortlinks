package com.example.api.controllers;

import com.example.api.entity.ShortLink;
import com.example.api.service.ShortLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    @Autowired
    public ShortLinkController(ShortLinkService shortLinkService) {
        this.shortLinkService = shortLinkService;
    }

    @GetMapping("/link/{linkId}")
    public ResponseEntity<?> redirectToLink(@PathVariable UUID linkId) {
        Optional<ShortLink> optionalShortLink = shortLinkService.getLinkById(linkId);
        if (optionalShortLink.isPresent()) {
            return ResponseEntity.status(HttpStatus.FOUND)
                    .header("Location", optionalShortLink.get().getOriginalLink())
                    .build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Link not found");
        }
    }

    @GetMapping("/allLinks")
    public ResponseEntity<List<ShortLink>> getAllLinks() {
        List<ShortLink> shortLinks = shortLinkService.getAllLinks();
        return ResponseEntity.ok(shortLinks);
    }
}
