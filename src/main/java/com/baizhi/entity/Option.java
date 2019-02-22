package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Option implements Serializable {
    private Integer voId;

    private Integer vsId;

    private String voOption;

    private Integer voOrder;

    private Integer voIsDelete;

}