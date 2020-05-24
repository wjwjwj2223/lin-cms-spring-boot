package io.github.talelin.latticy.laver.model;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@TableName("banner")
public class BannerDO {

    private long id;
    private String name;
    private String description;
    private String title;
    private String img;

    @JsonIgnore
    private Date createTime;
    @JsonIgnore
    private Date updateTime;

    @JsonIgnore
    @TableLogic
    private Date deleteTime;
}
