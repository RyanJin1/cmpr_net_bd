package com.jyc.cmpr_net_bd.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2022/12/26 11:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@TableName("herb")
public class Herb {
    @TableId("herb_id")
    private String id;

    @TableField("chinese_name")
    private String chineseName;

    @TableField("pinyin_name")
    private String pinyinName;

    @TableField("latin_name")
    private String latinName;

    @TableField("english_name")
    private String englishName;

    @TableField("properties_cn")
    private String propertiesCn;

    @TableField("properties_en")
    private String propertiesEn;

    @TableField("meridians_cn")
    private String meridiansCn;

    @TableField("meridians_en")
    private String meridiansEn;

    @TableField("class_cn")
    private String classCn;

    @TableField("class_en")
    private String classEn;

    @TableField("usepart")
    private String usepart;

    @TableField("alias")
    private String alias;

    @TableField("toxicity_cn")
    private String toxicityCn;

    @TableField("props_cn")
    private String propsCn;

    @TableField("flavour_cn")
    private String flavourCn;

    @TableField("toxicity_en")
    private String toxicityEn;

    @TableField("props_en")
    private String propsEn;

    @TableField("flavour_en")
    private String flavourEn;

    @TableField("function")
    private String func;

    private List<Ingredient> ingredients;
}
