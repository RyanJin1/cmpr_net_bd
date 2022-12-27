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
 * @date 2022/12/26 11:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@TableName("symptom")
public class Symptom {
    @TableId("sym_id")
    private Integer id;

    @TableField("sym_name")
    private String name;
}
