package com.example.api.controllers;

import com.example.api.entity.ShortLink;
import com.example.api.service.ShortLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    @Autowired
    public ShortLinkController(ShortLinkService shortLinkService) {
        this.shortLinkService = shortLinkService;
    }

    @PostMapping("/link/create")
    public ShortLink createLink(@RequestBody ShortLink body) {
        return shortLinkService.shortenLink(body.getOriginalLink());
    }
}
