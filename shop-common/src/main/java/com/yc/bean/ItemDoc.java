package com.yc.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
/**
 * ES用
 */
public class ItemDoc {
    @TableId(type = IdType.AUTO)
    private String id;
    private String name;    //商品名
    private Double price;   //价格
    private Integer stock;  //货量
    private String image;   //图片地址
    private String category;    //种类
    private String brand;   //品牌
    private String spec;    //规格
    private int sold;   //销量
    private Integer rating; //评分
    private Integer status; //是否下架 1?0
}
