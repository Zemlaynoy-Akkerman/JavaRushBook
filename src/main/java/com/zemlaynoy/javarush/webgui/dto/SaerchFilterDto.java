/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zemlaynoy.javarush.webgui.dto;

/**
 *
 * @author alex
 */
public class SaerchFilterDto {
    
    private String title;
    private String printYear;
    private String isNotReaded;

    public SaerchFilterDto() {
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrintYear() {
        return printYear;
    }

    public void setPrintYear(String printYear) {
        this.printYear = printYear;
    }

    public String getIsNotReaded() {
        return isNotReaded;
    }

    public void setIsNotReaded(String isNotReaded) {
        this.isNotReaded = isNotReaded;
    }
 
}
