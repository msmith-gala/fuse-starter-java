package org.galatea.starter.service.feign;


import org.galatea.starter.domain.modelresponse.AlphaPrices;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "PricesClient",
    url = "${alpha.url}",
    configuration = ClientConfiguration.class)

public interface PricesClient {

  @RequestMapping(method = RequestMethod.GET,
      value = "/query?function=TIME_SERIES_DAILY_ADJUSTED&apikey=Q4XJ9KJWS5A109C6")
  AlphaPrices getPricesByStock(
      @RequestParam("symbol") String stock,
      @RequestParam("outputsize") String outPutSize);
}