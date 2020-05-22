package io.github.talelin.latticy.laver.service;

import io.github.talelin.latticy.laver.mapper.BannerMapper;
import io.github.talelin.latticy.laver.model.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService {

    @Autowired
    BannerMapper bannerMapper;

    public List<Banner> getBanners() {
        return bannerMapper.selectBanners();
    }

    public List<Banner> getBanners1() {
        return bannerMapper.selectBanners1();
    }

    public long insertBanner(Banner banner) {
        return bannerMapper.insertBanner(banner);
    }

}
