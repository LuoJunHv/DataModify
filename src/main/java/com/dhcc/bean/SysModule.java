package com.dhcc.bean;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author WJC
 * @date 2020/4/14 10:50
 */
@Data
public class SysModule implements Serializable {
    private int sysmoduleId;
    private String sysmoduleName;
    private int metamoduleId;
    private String executeMode;
    private int enabledMark;
    private Date lastUpdateDate;
    private Date addDate;
    private String operator;
    private int expressionConfigurableFlag;
    private int originBillSysmoduleId; //xgjadd 20201221
    private String subjectField;//xgjadd 20201221
}
