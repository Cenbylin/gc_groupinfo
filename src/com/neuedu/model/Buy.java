package com.neuedu.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Buy {
    private Integer buyid;

    private Double buycount;

    private Date buytime;
    
    private Integer provid;

    private Integer departid;

    private Integer prodid;

    public Integer getBuyid() {
        return buyid;
    }

    public void setBuyid(Integer buyid) {
        this.buyid = buyid;
    }

    public Double getBuycount() {
        return buycount;
    }

    public void setBuycount(Double buycount) {
        this.buycount = buycount;
    }

    public String getBuytime() {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	
        return sdf.format(this.buytime);
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    public Integer getProvid() {
        return provid;
    }

    public void setProvid(Integer provid) {
        this.provid = provid;
    }

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public Integer getProdid() {
        return prodid;
    }

    public void setProdid(Integer prodid) {
        this.prodid = prodid;
    }
}