package io.github.talelin.latticy.laver.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.talelin.autoconfigure.exception.NotFoundException;
import io.github.talelin.latticy.laver.bo.BannerWithItemsBO;
import io.github.talelin.latticy.laver.dto.BannerDTO;
import io.github.talelin.latticy.laver.mapper.BannerItemMapper;
import io.github.talelin.latticy.laver.mapper.BannerMapper;
import io.github.talelin.latticy.laver.model.BannerDO;
import io.github.talelin.latticy.laver.model.BannerItemDO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService extends ServiceImpl<BannerMapper, BannerDO> {

    @Autowired
    BannerMapper bannerMapper;

    @Autowired
    BannerItemMapper bannerItemMapper;

    public void update(BannerDTO bannerDTO, Long id) {
        BannerDO bannerDO = this.getById(id);
        if (bannerDO == null) {
            throw new NotFoundException(20000);
        }
        BeanUtils.copyProperties(bannerDTO, bannerDO);
        this.updateById(bannerDO);
    }

    public void delete(Long id) {
        BannerDO bannerDO = this.getById(id);
        if (bannerDO == null) {
            throw new NotFoundException(20000);
        }
        this.getBaseMapper().deleteById(id);
    }

    public BannerWithItemsBO getWithItems(Long id) {
        BannerDO bannerDO = this.getById(id);
        if (bannerDO == null) {
            throw new NotFoundException(20000);
        }
//        List<BannerItemDO> bannerItemDOS = new LambdaQueryChainWrapper<>(bannerItemMapper)
//                .eq(BannerItemDO::getBannerId, id)
//                .list();
//        return new BannerWithItemsBO(bannerDO, bannerItemDOS);

        QueryWrapper<BannerItemDO> wrapper = new QueryWrapper();
//        wrapper.eq("banner_id", id);
        wrapper.lambda().eq(BannerItemDO::getBannerId, id);
        List<BannerItemDO> bannerItemDOS = bannerItemMapper.selectList(wrapper);
        return new BannerWithItemsBO(bannerDO, bannerItemDOS);
    }

    public List<BannerDO> getBanners() {
        return bannerMapper.selectBanners();
    }

    public List<BannerDO> getBanners1() {
        return bannerMapper.selectBanners1();
    }

    public long insertBanner(BannerDO bannerDO) {
        return bannerMapper.insertBanner(bannerDO);
    }

}
