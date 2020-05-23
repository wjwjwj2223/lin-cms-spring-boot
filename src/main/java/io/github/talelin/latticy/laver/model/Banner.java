package io.github.talelin.latticy.laver.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@TableName("banner")
public class Banner {
    private long id;
    private String name;
    private String description;
    private String title;
    private String img;
}
