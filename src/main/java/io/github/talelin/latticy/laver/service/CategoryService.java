package io.github.talelin.latticy.laver.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.talelin.autoconfigure.exception.NotFoundException;
import io.github.talelin.latticy.laver.mapper.CategoryMapper;
import io.github.talelin.latticy.laver.model.CategoryDO;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author generator@Wangjie
 * @since 2020-06-14
 */
@Service
public class CategoryService extends ServiceImpl<CategoryMapper, CategoryDO> {

    public CategoryDO getCategoryById(Integer id) {
        CategoryDO categoryDO = this.getById(id);
        if (categoryDO == null) {
            throw new NotFoundException(40000);
        }
        return categoryDO;
    }

}
