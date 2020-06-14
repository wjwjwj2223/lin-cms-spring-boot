package io.github.talelin.latticy.laver.model;

import io.github.talelin.latticy.model.BaseModel;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author generator@Wangjie
 * @since 2020-06-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("spu_img")
public class SpuImgDO extends BaseModel {


    private String img;

    private Integer spuId;


}
