package io.github.talelin.latticy.laver.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.talelin.latticy.laver.model.Banner;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerMapper extends BaseMapper<Banner> {
    List<Banner> selectBanners();
    long insertBanner(Banner banner);

    @Select("select * from banner")
    List<Banner> selectBanners1();
}
