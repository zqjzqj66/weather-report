package com.imooc.weatherssss.controller;

import com.imooc.weatherssss.client.CityClient;
import com.imooc.weatherssss.client.DataClient;
import com.imooc.weatherssss.service.WeatherReportService;
import com.imooc.weatherssss.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Description:
 *
 * @author 周启江
 * @ClassName: WeatherReportController
 * @date 2019/5/17 10:22
 */
@Controller
@RequestMapping("/report")
public class WeatherReportController {

    @Autowired
    private WeatherReportService weatherReportService;

    @Autowired
    private DataClient dataClient;

    @GetMapping("/cityId/{cityId}")
    public ModelAndView reportWeather(@PathVariable("cityId") String cityId, Model model){
        model.addAttribute("title","格调的天气预报" );
        model.addAttribute("cityId",cityId );
        List<City> cityData = dataClient.getCityData();
        model.addAttribute("cityList", cityData);
        model.addAttribute("report",weatherReportService.getDataByCityId(cityId));
        return new ModelAndView("weather/report","reportModel",model);
    }

}
