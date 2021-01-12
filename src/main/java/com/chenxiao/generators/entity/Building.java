package com.chenxiao.generators.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 楼座
 * </p>
 *
 * @author chenxiao
 * @since 2021-01-12
 */
@Data
@Accessors(chain = true)
public class Building extends Model<Building> {

private static final long serialVersionUID = 1L;

    /**
     * id
     */
                    @TableId(value="id", type= IdType.AUTO)
                private Integer id;
    /**
     * 楼座名称
     */
        private String name;
    /**
     * 小区id
     */
        private Integer villageId;
    /**
     * 楼层数量
     */
        private Integer maxFloorNumber;
    /**
     * 备注
     */
        private String remark;
    /**
     * 是否删除
     */
        private Integer isDeleted;
    /**
     * 创建时间
     */
        private LocalDateTime createdAt;
    /**
     * 更新时间
     */
        private LocalDateTime updatedAt;
    /**
     * 最后更新者
     */
        private Integer updatedBy;

}


