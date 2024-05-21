package com.gabriel.spotify.application.controller;

import com.gabriel.spotify.infra.integration.client.AuthSpotifyClient;
import com.gabriel.spotify.infra.integration.dto.request.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/spotify/api")
public class AlbumController {

    private final AuthSpotifyClient authSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
    }

    @GetMapping("/albums")
    public ResponseEntity<String>getAlbums() {
        var request = new LoginRequest(
                 "client_credentials",
                   "d330e0fde8714f01a201709deb42fe53",
                "beeb3575570d48daaf32bc52239b491c");
        return ResponseEntity.ok(authSpotifyClient.login(request).accessToken());
    }

}
