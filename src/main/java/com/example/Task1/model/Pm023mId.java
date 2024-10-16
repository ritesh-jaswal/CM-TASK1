package com.example.Task1.model;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Pm023mId implements Serializable
{
    @Column(name="COMPNY",length=1,nullable=false)
    private String compny = " ";

    @Column(name="ACCNT",length=7,nullable=false)
    private String accnt = " ";

    @Column(name="ADRTYP",length=1,nullable=false)
    private String adrtyp = " ";

    public Pm023mId(String compny, String accnt, String adrtyp) {
        this.compny = compny;
        this.accnt = accnt;
        this.adrtyp = adrtyp;
    }

    public String getCompny() {
        return compny;
    }

    public void setCompny(String compny) {
        this.compny = compny;
    }

    public String getAccnt() {
        return accnt;
    }

    public void setAccnt(String accnt) {
        this.accnt = accnt;
    }

    public String getAdrtyp() {
        return adrtyp;
    }

    public void setAdrtyp(String adrtyp) {
        this.adrtyp = adrtyp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pm023mId pm023mId = (Pm023mId) o;
        return Objects.equals(compny, pm023mId.compny) && Objects.equals(accnt, pm023mId.accnt) && Objects.equals(adrtyp, pm023mId.adrtyp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compny, accnt, adrtyp);
    }

}
