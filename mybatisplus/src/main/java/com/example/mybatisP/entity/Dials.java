package com.example.mybatisP.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 仪表
 * </p>
 *
 * @author zhengweihe
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Dials extends Model<Dials> {

    private static final long serialVersionUID=1L;

    /**
     * id
     */
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 仪表名称
     */
    private String name;

    /**
     * 收费名称
     */
    private String chargeName;

    /**
     * 单价
     */
    private Integer unitPrice;

    /**
     * 计量单位
     */
    private String unit;

    /**
     * 备注
     */
    private String remark;

    /**
     * 仪表状态（0 启用 1禁用）
     */
    private Integer status;

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
    private Integer createdBy;

    /**
     * 最后更新者
     */
    private Integer updatedBy;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
