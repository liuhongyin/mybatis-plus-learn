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
 * 产品评价回复表
 * </p>
 *
 * @author liuhongyin
 * @since 2019-11-07
 */
@Data
@ApiModel(value = "PmsCommentReplay对象", description = "产品评价回复表")
public class PmsCommentReplay implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long commentId;

    private String memberNickName;

    private String memberIcon;

    private String content;

    private LocalDateTime createTime;

    @ApiModelProperty(value = "评论人员类型；0->会员；1->管理员")
    private Integer type;


}
