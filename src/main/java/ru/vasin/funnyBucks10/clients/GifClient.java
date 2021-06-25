package ru.vasin.funnyBucks10.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.vasin.funnyBucks10.models.GifModel;


@FeignClient(name="GifClient", url="${api.gif_host}")
public interface GifClient {
    @GetMapping (value = "?api_key=" + "${APIKeys.gifKey}" +"&tag=" + "{value}" + "&rating=g",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    GifModel getPicture(@PathVariable() String value);

}