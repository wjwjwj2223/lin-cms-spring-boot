package io.github.talelin.latticy.laver.controller.v1;
import io.github.talelin.latticy.laver.model.BannerDO;
import io.github.talelin.latticy.laver.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/test")
@Validated
public class TestSleeveController {

    @Autowired
    BannerService bannerService;

    @GetMapping("/test1")
    public List<BannerDO> getBanners() {
        List<BannerDO> bannerDOS = bannerService.getBanners();
        return bannerDOS;
    }

    @GetMapping("/test2")
    public long insert() {
        BannerDO bannerDO = new BannerDO();
        bannerDO.setName("测试名字");
        bannerDO.setTitle("测试title");
        bannerService.insertBanner(bannerDO);
        return bannerDO.getId();
    }

    @GetMapping("/test3")
    public List<BannerDO> getBanners1() {
        List<BannerDO> bannerDOS = bannerService.getBanners1();
        return bannerDOS;
    }

}
