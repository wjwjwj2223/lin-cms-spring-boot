package io.github.talelin.latticy.laver.service.impl;

import io.github.talelin.latticy.laver.model.SpuDO;
import io.github.talelin.latticy.laver.mapper.SpuMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.talelin.latticy.laver.model.SpuDetailDO;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author generator@Wangjie
 * @since 2020-05-31
 */
@Service
public class SpuService extends ServiceImpl<SpuMapper, SpuDO> {

    public SpuDetailDO getDetail(Long id) {
        return this.getBaseMapper().getDetail(id);
    }
}
