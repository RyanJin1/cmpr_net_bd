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
 * @date 2022/12/26 11:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@TableName("ingredient")
public class Ingredient {
    @TableId("ingredient_id")
    private String id;

    @TableField("alias")
    private String alias;

    @TableField("cas_id")
    private String casId;

    @TableField("DrugBank_id")
    private String drugBankId;

    @TableField("ingredient_smile")
    private String smiles;

    @TableField("ingredient_formula")
    private String formula;

    @TableField("HERB_id")
    private String herbId;

    @TableField("ingredient_name")
    private String name;

    @TableField("ingredient_weight")
    private String weight;

    @TableField("ob_score")
    private Float obScore;

    @TableField("type")
    private String type;

    @TableField("PubChem_id")
    private String pubChemId;

    @TableField("TCM_ID_id")
    private String tcm_idId;

    @TableField("TCMID_id")
    private String tcmidId;

    @TableField("TCMSP_id")
    private String tcmspId;

    @TableField("alogp")
    private Float alogp;

    @TableField("hdon")
    private Float hdon;

    @TableField("hacc")
    private Float hacc;

    @TableField("caco_2")
    private Float caco_2;

    @TableField("bbb")
    private Float bbb;

    @TableField("dl")
    private Float dl;

    @TableField("FASA")
    private Float fasa;

    @TableField("hl")
    private Float hl;

    private List<Target> targets;
}
