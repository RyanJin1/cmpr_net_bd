package com.jyc.cmpr_net_bd.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2023/1/16 11:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@TableName("tcm_symptom")
public class TcmSymptom {
    @TableId("tcm_symptom_id")
    private String id;

    @TableField("tcm_symptom_name")
    private String name;

    @TableField("pinyin")
    private String pinyin;

    @TableField("definition")
    private String definition;

    @TableField("symptom_locus")
    private String symptomLocus;

    @TableField("symptom_property")
    private String symptomProp;

    @TableField("type")
    private String type;
}
