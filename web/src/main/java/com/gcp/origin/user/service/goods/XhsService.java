package com.gcp.origin.user.service.goods;

import com.xiaohongshu.fls.opensdk.client.ProductClient;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.CreateItemV3Request;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.CreateSkuV3Request;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.ItemDetail;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.SkuDetail;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class XhsService {

    private ProductClient productClient;

    @PostConstruct
    public void init() {
        productClient = new ProductClient("123","1123","1515","165145");
    }

    public void addProduct() throws IOException {
        log.info("addProduct");
        CreateItemV3Request createItemV3Request = new CreateItemV3Request();
        List<CreateItemV3Request.ItemAttribute> attributes = new ArrayList<>();
        createItemV3Request.setAttributes(attributes);
        String accessToken = "";
        BaseResponse<ItemDetail> itemResponseBaseResponse = productClient.execute(createItemV3Request,accessToken);
        log.info("itemResponseBaseResponse:{}",itemResponseBaseResponse);
        CreateSkuV3Request createSkuV3Request = new CreateSkuV3Request();
        createSkuV3Request.setItemId(itemResponseBaseResponse.getData().getId());
        BaseResponse<SkuDetail> skuDetailBaseResponse = productClient.execute(createSkuV3Request,accessToken);
    }

}
