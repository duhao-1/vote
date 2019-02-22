package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item implements Serializable {
    private Integer viId;

    private Integer vuUserId;

    private Integer vsId;

    private Integer voId;


}