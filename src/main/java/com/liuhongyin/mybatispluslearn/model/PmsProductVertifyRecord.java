package com.liuhongyin.mybatispluslearn.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 商品审核记录
 * </p>
 *
 * @author liuhongyin
 * @since 2019-11-07
 */
@Data
@ApiModel(value = "PmsProductVertifyRecord对象", description = "商品审核记录")
public class PmsProductVertifyRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long productId;

    private LocalDateTime createTime;

    @ApiModelProperty(value = "审核人")
    private String vertifyMan;

    private Integer status;

    @ApiModelProperty(value = "反馈详情")
    private String detail;


}
