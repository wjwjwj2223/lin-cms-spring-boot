package io.github.talelin.latticy.laver.mapper;

import io.github.talelin.latticy.laver.model.SpuDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.talelin.latticy.laver.model.SpuDetailDO;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author generator@Wangjie
 * @since 2020-05-31
 */
public interface SpuMapper extends BaseMapper<SpuDO> {
    SpuDetailDO getDetail(Long id);
}
