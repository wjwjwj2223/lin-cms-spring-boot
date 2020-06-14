package io.github.talelin.latticy.laver.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.talelin.latticy.laver.mapper.SpecKeyMapper;
import io.github.talelin.latticy.laver.model.SpecKeyDO;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author generator@Wangjie
 * @since 2020-06-14
 */
@Service
public class SpecKeyService extends ServiceImpl<SpecKeyMapper, SpecKeyDO> {

    public List<SpecKeyDO> getBySpuId(Long spuId) {
        return this.baseMapper.getBySpuId(spuId);
    }
}
