package com.atguigu.gmall.pms.feign;


import com.atguigu.sms.api.GmallSmsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("sms/skubounds/sms-service")
public interface GmallSmsClient extends GmallSmsApi {


}
