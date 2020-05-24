package io.github.talelin.latticy.laver.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.talelin.latticy.laver.model.BannerDO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerMapper extends BaseMapper<BannerDO> {

    long insertBanner(BannerDO bannerDO);

    List<BannerDO> selectBanners();

    @Select("select * from banner")
    List<BannerDO> selectBanners1();
}
