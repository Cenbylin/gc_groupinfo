package com.neuedu.model;

public class Product {
    private Integer prodid;

    private String prodname;

    private Double prodcount;

	private Integer provid;
	
	private Double buycount; 
	
	private Integer buyid;

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

	public Integer getProdid() {
        return prodid;
    }

    public void setProdid(Integer prodid) {
        this.prodid = prodid;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname == null ? null : prodname.trim();
    }

    public Double getProdcount() {
        return prodcount;
    }

    public void setProdcount(Double prodcount) {
        this.prodcount = prodcount;
    }

    public Integer getProvid() {
        return provid;
    }

    public void setProvid(Integer provid) {
        this.provid = provid;
    }
}