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
 * @date 2023/1/16 11:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@TableName("disease")
public class Disease {
    @TableId("disease_id")
    private String id;

    @TableField("disease_name")
    private String name;

    @TableField("umls_id")
    private String umlsId;

    @TableField("mesh_id")
    private String meshId;

    @TableField("omim_id")
    private String omimId;

    @TableField("orphanet_id")
    private String orphanetId;

    @TableField("icd10cm_id")
    private String icd10cmId;

    @TableField("meddra_id")
    private String meddraId;

    @TableField("link_disease_id")
    private String linkDiseaseId;

    private List<Target> targets;
}
