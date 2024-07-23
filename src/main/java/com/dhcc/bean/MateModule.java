package com.dhcc.bean;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;


@Data
public class MateModule implements Serializable{


    private int metamoduleId;

    private String tableName;

    private String phyPkName;

    private String bizKeyFieldName;

    private Date lastUpdateDate;

    private Date addDate;

    private String operator;

    private Integer autoCodeMode;

}

