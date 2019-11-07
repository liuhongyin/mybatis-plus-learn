package com.liuhongyin.mybatispluslearn.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 新鲜好物表
 * </p>
 *
 * @author liuhongyin
 * @since 2019-11-07
 */
@Data
@ApiModel(value = "SmsHomeNewProduct对象", description = "新鲜好物表")
public class SmsHomeNewProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long productId;

    private String productName;

    private Integer recommendStatus;

    private Integer sort;


}
