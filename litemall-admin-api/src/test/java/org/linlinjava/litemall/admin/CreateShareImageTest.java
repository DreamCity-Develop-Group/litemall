package org.linlinjava.litemall.admin;

import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.linlinjava.litemall.core.qcode.QCodeService;
import org.linlinjava.litemall.db.domain.LitemallGoods;
import org.linlinjava.litemall.db.service.LitemallGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CreateShareImageTest {
    private static final Logger log = LoggerFactory.getLogger(WxMaServiceImpl.class);
    @Autowired
    QCodeService qCodeService;
    @Autowired
    LitemallGoodsService litemallGoodsService;

    @Test
    public void test() {
        LitemallGoods good = litemallGoodsService.findById(1116011);
        qCodeService.createGoodShareImage(good.getId().toString(), good.getPicUrl(), good.getName());
    }

    @Test
    public void getQrCodeUnlimit(){
        String accessToken = "28_tmR-0P6ULl0v2V_kF9MQtNRVvu1uFSAl87m33U8BcXuNhuFoBIlwXoQoIXwxkOASKEX66sZSR4VWK7MpbwShtO3LhLJXtKkBoMNCazoCLfZ1VPMhpAFC1-ZI6hnS7ysE3wwPuNkpnfj9mIuoBEBaACAMPM";
        RestTemplate restTemplate = new RestTemplate();
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            String url = "https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token="+accessToken;
            //String url = "https://api.weixin.qq.com/wxa/getwxacode?access_token="+accessToken;
            Map<String,Object> params = new HashMap<>();
            params.put("page","pages/index/index");
            params.put("width",430);
            params.put("auto_color",false);
            Map<String,Object> line_color = new HashMap<>();
            line_color.put("r",0);
            line_color.put("g",0);
            line_color.put("b",0);
            params.put("line_color",line_color);
            log.debug("\n调用生成微信URL接口传参: {}\n", params);
            MultiValueMap<String,String>headers = new LinkedMultiValueMap<>();
            HttpEntity request = new HttpEntity(params,headers);
            ResponseEntity<byte[]>entity = restTemplate.exchange(url, HttpMethod.POST,request,byte[].class,new Object[0]);
            log.debug("调用小程序生成微信永久小程序码URL接口返回结果:{}",  entity.getBody());
            byte[] result = entity.getBody();
            log.info(Base64.encodeBase64String(result));
            inputStream = new ByteArrayInputStream(result);
            File file= new File("2.png");
            if (!file.exists()){
                file.createNewFile();
            }
            outputStream = new FileOutputStream(file);
            int len = 0;
            byte[] buffer = new byte[1024];
            while ((len=inputStream.read(buffer,0,1024))!= -1){
                outputStream.write(buffer,0,len);
            }
            outputStream.flush();
        }catch (Exception e){
            log.error("调用小程序生成微信永久小程序码URL接口异常",e);
        }finally {
            if (inputStream!=null){
                try {
                    inputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (outputStream!=null){
                try {
                    outputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
