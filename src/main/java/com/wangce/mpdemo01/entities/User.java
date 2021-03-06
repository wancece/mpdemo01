package com.wangce.mpdemo01.entities;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class User {
//        @TableId("IdType.AUTO")
        private Long id;
        private String name;
        private Integer age;
        private String email;
        @Version//乐观锁
        @TableField(fill = FieldFill.INSERT)
        private Integer version;

        @TableField(fill = FieldFill.INSERT)
        private Date createTime;
        @TableField(fill = FieldFill.INSERT_UPDATE)
        private Date updateTime;

}
