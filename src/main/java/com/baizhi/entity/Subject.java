package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject implements Serializable {
    private Integer vsId;

    private String vsTitle;

    private Integer vsType;

}