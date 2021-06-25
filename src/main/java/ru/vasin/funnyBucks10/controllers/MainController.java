package ru.vasin.funnyBucks10.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import ru.vasin.funnyBucks10.clients.GifClient;
import ru.vasin.funnyBucks10.utils.SelectionTag;
import ru.vasin.funnyBucks10.utils.YesterdayDate;
import ru.vasin.funnyBucks10.clients.CurrencyClient;


@Controller
@RequiredArgsConstructor
public class MainController {

    private final CurrencyClient currencyClient;
    private final GifClient gifClient;
    private final YesterdayDate yesterdayDate;



    @GetMapping("/main")
    public String main(Model model)
    {
        model.addAttribute("page", currencyClient.getCurrentToday().getRates());
        model.addAttribute("title", "Курсы Валют");
        return "main";
    }



    @GetMapping("/main/{getKey}")
    public String details(@PathVariable("getKey") String getKey, Model model){
        String yesterdayDateInString = yesterdayDate.getYesterdayDate();

        Double todaysСourse = currencyClient.getCurrentToday().getRates().get(getKey);
        Double yesterdayCourse = currencyClient.getCurrentYesterday(yesterdayDateInString).getRates().get(getKey);

        SelectionTag selectionTag = new SelectionTag();
        String tag = selectionTag.getTag(todaysСourse,yesterdayCourse);
        String gif = gifClient.getPicture(tag).getData().getImages().getOriginal().get("url");

        model.addAttribute("gif", gif);

        return "randomGIF";
    }



}
