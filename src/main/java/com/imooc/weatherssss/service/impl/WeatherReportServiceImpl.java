package com.imooc.weatherssss.service.impl;

import com.imooc.weatherssss.client.WeatherDataClient;
import com.imooc.weatherssss.service.WeatherReportService;
import com.imooc.weatherssss.vo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private WeatherDataClient weatherDataClient;

    @Override
    public Weather getDataByCityId(String cityId) {
        return weatherDataClient.getWeather(cityId);
    }
}
