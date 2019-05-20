package com.imooc.weatherssss.client;

import com.imooc.weatherssss.vo.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description:
 *
 * @author 周启江
 * @ClassName: WeatherDataClient
 * @date 2019/5/20 13:15
 */
@FeignClient("WEATHER-DATA")
public interface WeatherDataClient {

    @GetMapping("/getWeather/{cityId}")
    Weather getWeather(@PathVariable("cityId")String cityId);
}
