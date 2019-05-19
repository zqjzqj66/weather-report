package com.imooc.weatherssss.service.impl;

import com.imooc.weatherssss.service.WeatherReportService;
import com.imooc.weatherssss.vo.Weather;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author 周启江
 * @ClassName: WeatherReportServiceImpl
 * @date 2019/5/17 10:20
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    //TODO 调用weather-data 微服务

    @Override
    public Weather getDataByCityId(String cityId) {
        Weather weather = new Weather();
        weather.setCity("南京");
        return weather;
        //return weatherDataService.getDataByCityId(cityId).getData();
    }
}
