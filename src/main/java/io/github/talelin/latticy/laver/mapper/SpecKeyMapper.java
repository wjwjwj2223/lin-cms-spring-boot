package io.github.talelin.latticy.laver.mapper;

import io.github.talelin.latticy.laver.model.SpecKeyDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author generator@Wangjie
 * @since 2020-06-14
 */
public interface SpecKeyMapper extends BaseMapper<SpecKeyDO> {
    List<SpecKeyDO> getBySpuId(Long spuId);
}
