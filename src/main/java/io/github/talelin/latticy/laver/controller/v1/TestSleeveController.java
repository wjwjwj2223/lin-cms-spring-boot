package io.github.talelin.latticy.laver.controller.v1;
import io.github.talelin.latticy.laver.model.Banner;
import io.github.talelin.latticy.laver.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/test")
public class TestSleeveController {

    @Autowired
    BannerService bannerService;

    @GetMapping("/test1")
    public List<Banner> getBanners() {
        List<Banner> banners = bannerService.getBanners();
        return banners;
    }

    @GetMapping("/test3")
    public List<Banner> getBanners1() {
        List<Banner> banners = bannerService.getBanners1();
        return banners;
    }

    @GetMapping("/test2")
    public long insert() {
        Banner banner = new Banner();
        banner.setName("测试名字");
        banner.setTitle("测试title");
        bannerService.insertBanner(banner);
        return banner.getId();
    }


}
