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
 * @date 2023/1/19 14:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@TableName("target")
public class Target {
    @TableId("HERB_target_id")
    private String id;

    @TableField("Tax_id")
    private String taxId;

    @TableField("Gene_id")
    private String geneId;

    @TableField("Gene_name")
    private String name;

    @TableField("Gene_alias")
    private String alias;

    @TableField("Chromosome")
    private String chromosome;

    @TableField("Map_location")
    private String mapLocation;

    @TableField("Description")
    private String description;

    @TableField("Type_of_gene")
    private String type;

    @TableField("OMIM_id")
    private String omimId;

    @TableField("HGNC_id")
    private String hgncId;

    @TableField("Ensembl_id")
    private String ensemblId;

    @TableField("MGI_id")
    private String mhiId;

    @TableField("TTD_target_id")
    private String ttdTargetId;

    @TableField("TTD_target_type")
    private String ttdTargetType;

}
