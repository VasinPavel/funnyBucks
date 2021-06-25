package ru.vasin.funnyBucks10.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.vasin.funnyBucks10.models.CurrencyModel;

@FeignClient(name = "CurrencyClient", url = "${api.currency_host}")
public interface CurrencyClient {
    @GetMapping(value = "/latest.json?app_id=" + "${APIKeys.currencyKey}" + "&base=" + "${base_currency}", consumes = MediaType.APPLICATION_JSON_VALUE)
    CurrencyModel getCurrentToday();

    @GetMapping(value = "/historical/" + "{yesterdayDate}" + ".json?app_id=" + "${APIKeys.currencyKey}" + "&base=" + "${base_currency}", consumes = MediaType.APPLICATION_JSON_VALUE)
    CurrencyModel getCurrentYesterday(@PathVariable String yesterdayDate);

}
