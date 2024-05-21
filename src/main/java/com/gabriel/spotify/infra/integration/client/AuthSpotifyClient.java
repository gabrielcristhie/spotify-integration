package com.gabriel.spotify.infra.integration.client;

import com.gabriel.spotify.infra.integration.config.FeignConfig;
import com.gabriel.spotify.infra.integration.dto.request.LoginRequest;
import com.gabriel.spotify.infra.integration.dto.response.LoginResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "authSpotifyClient",
        url = "${spotify.api.url}",
        configuration = FeignConfig.class
)
@Headers({
        "Content-Type: application/json; charset=utf-8",
        "Accept: application/json; charset=utf-8",
})
public interface AuthSpotifyClient {

    @PostMapping(value = "/api/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    LoginResponse login(@RequestBody LoginRequest loginRequest);

}
