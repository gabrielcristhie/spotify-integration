package com.gabriel.spotify.infra.integration.dto.request;

import feign.form.FormProperty;

public record LoginRequest(
        @FormProperty("grant_type")
        String grantType,
        @FormProperty("client_id")
        String clientId,
        @FormProperty("client_secret")
        String clientSecret
){}
