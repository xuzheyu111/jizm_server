package com.example.jizm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="com-example-jizm-model-Bill")
public class Bill {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Integer localId;

    @ApiModelProperty(value="")
    private Integer accountId;

    @ApiModelProperty(value="")
    private Integer categoryId;

    @ApiModelProperty(value="")
    private Integer userId;

    @ApiModelProperty(value="")
    private Integer type;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private Date date;

    @ApiModelProperty(value="")
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLocalId() {
        return localId;
    }

    public void setLocalId(Integer localId) {
        this.localId = localId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}