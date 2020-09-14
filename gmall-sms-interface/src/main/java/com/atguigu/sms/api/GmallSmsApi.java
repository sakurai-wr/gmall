package com.atguigu.sms.api;

import com.atguigu.gmall.common.bean.ResponseVo;
import com.atguigu.sms.vo.SkuSaleVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface GmallSmsApi {

    @PostMapping("sales/sale")
    public ResponseVo<Object> saveSkuSales(@RequestBody SkuSaleVo skuSaleVo);
}
