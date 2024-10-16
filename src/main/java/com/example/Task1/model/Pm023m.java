package com.example.Task1.model;

import java.math.BigDecimal;

@Entity
@Table(name="PM023M",schema="TSTDTAL")
public class Pm023m
{
    @EmbeddedId
    Pm023mId id;

    @Column(name="TEXTNB",precision=3,scale=0,nullable=false)
    private BigDecimal textnb = BigDecimal.ZERO;

    @Column(name="NAME1",length=50,nullable=false)
    private String name1 = " ";

    @Column(name="NAME2",length=50,nullable=false)
    private String name2 = " ";

    @Column(name="NAME3",length=50,nullable=false)
    private String name3 = " ";

    @Column(name="ADDRS1",length=50,nullable=false)
    private String addrs1 = " ";

    @Column(name="ADDRS2",length=50,nullable=false)
    private String addrs2 = " ";

    @Column(name="CITY",length=30,nullable=false)
    private String city = " ";

    @Column(name="STATE",length=2,nullable=false)
    private String state = " ";

    @Column(name="ZIP",length=9,nullable=false)
    private String zip = " ";

    @Column(name="TEXTLN",length=70,nullable=false)
    private String textln = " ";

    @Column(name="FNINTL",length=50,nullable=false)
    private String fnintl = " ";

    @Column(name="PRLCTL",length=50,nullable=false)
    private String prlctl = " ";

    @Column(name="CRTDTE",precision=7,scale=0,nullable=false)
    private BigDecimal crtDte = BigDecimal.ZERO;

    @Column(name="CRTUSR",length=10,nullable=false)
    private String crtUsr = " ";

    @Column(name="CRTTRM",length=10,nullable=false)
    private String crtTrm = " ";

    @Column(name="UPDDTE",precision=7,scale=0,nullable=false)
    private BigDecimal updDte = BigDecimal.ZERO;

    @Column(name="UPDUSR",length=10,nullable=false)
    private String updUsr = " ";

    @Column(name="UPDTRM",length=10,nullable=false)
    private String updTrm = " ";

    //DEFAULT CONSTRUCTOR
    public Pm023m() {}

    //GETTERS AND SETTERS
    public Pm023mId getId() {
        return id;
    }

    public void setId(Pm023mId id) {
        this.id = id;
    }

    public BigDecimal getTextnb() {
        return textnb;
    }

    public void setTextnb(BigDecimal textnb) {
        this.textnb = textnb;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getAddrs1() {
        return addrs1;
    }

    public void setAddrs1(String addrs1) {
        this.addrs1 = addrs1;
    }

    public String getAddrs2() {
        return addrs2;
    }

    public void setAddrs2(String addrs2) {
        this.addrs2 = addrs2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTextln() {
        return textln;
    }

    public void setTextln(String textln) {
        this.textln = textln;
    }

    public String getFnintl() {
        return fnintl;
    }

    public void setFnintl(String fnintl) {
        this.fnintl = fnintl;
    }

    public String getPrlctl() {
        return prlctl;
    }

    public void setPrlctl(String prlctl) {
        this.prlctl = prlctl;
    }

    public BigDecimal getCrtDte() {
        return crtDte;
    }

    public void setCrtDte(BigDecimal crtDte) {
        this.crtDte = crtDte;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public String getCrtTrm() {
        return crtTrm;
    }

    public void setCrtTrm(String crtTrm) {
        this.crtTrm = crtTrm;
    }

    public BigDecimal getUpdDte() {
        return updDte;
    }

    public void setUpdDte(BigDecimal updDte) {
        this.updDte = updDte;
    }

    public String getUpdUsr() {
        return updUsr;
    }

    public void setUpdUsr(String updUsr) {
        this.updUsr = updUsr;
    }

    public String getUpdTrm() {
        return updTrm;
    }

    public void setUpdTrm(String updTrm) {
        this.updTrm = updTrm;
    }
}
