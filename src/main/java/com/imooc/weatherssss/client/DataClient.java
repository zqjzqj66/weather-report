package com.imooc.weatherssss.client;

import com.imooc.weatherssss.vo.City;
import com.imooc.weatherssss.vo.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Description:
 *
 * @author 周启江
 * @ClassName: DataClient
 * @date 2019/5/20 18:57
 */
@FeignClient("WEATHER-ZUUL")
public interface DataClient {

    @GetMapping("/weatherCityList/cityList")
    List<City> getCityData();


    @GetMapping("/weatherData/getWeather/{cityId}")
    Weather getWeather(@PathVariable("cityId")String cityId);
}
