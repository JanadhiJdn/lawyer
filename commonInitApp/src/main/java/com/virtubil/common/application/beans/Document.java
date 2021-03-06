package com.virtubil.common.application.beans;
// Generated Feb 9, 2017 11:21:33 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Document generated by hbm2java
 */
@Entity
@Table(name = "document",
         catalog = "diary"
)
public class Document implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "documentID", unique = true, nullable = false)
    private Integer documentId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "caseID")
    private Cases cases;
    
    @Column(name = "description", length = 2000)
    private String description;
    
    @Column(name = "isOriginal")
    private Boolean isOriginal;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "receivedDate", length = 10)
    private Date receivedDate;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "filedInCourtDate", length = 10)
    private Date filedInCourtDate;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "returnedDate", length = 10)
    private Date returnedDate;

    public Document() {
    }

    public Document(Cases cases, String description, Boolean isOriginal, Date receivedDate, Date filedInCourtDate, Date returnedDate) {
        this.cases = cases;
        this.description = description;
        this.isOriginal = isOriginal;
        this.receivedDate = receivedDate;
        this.filedInCourtDate = filedInCourtDate;
        this.returnedDate = returnedDate;
    }

    public Integer getDocumentId() {
        return this.documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public Cases getCases() {
        return this.cases;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsOriginal() {
        return this.isOriginal;
    }

    public void setIsOriginal(Boolean isOriginal) {
        this.isOriginal = isOriginal;
    }

    public Date getReceivedDate() {
        return this.receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getFiledInCourtDate() {
        return this.filedInCourtDate;
    }

    public void setFiledInCourtDate(Date filedInCourtDate) {
        this.filedInCourtDate = filedInCourtDate;
    }

    public Date getReturnedDate() {
        return this.returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }

}
