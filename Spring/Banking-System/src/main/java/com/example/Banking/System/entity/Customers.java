package com.example.Banking.System.entity;

import jakarta.persistence.*;

@Entity
public class Customers {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(
            name="acc_name"
    )
    private String accName;

    @Column(
            name="acc_number"
    )
    private long accNumber;

    @Column(
            name="acc_type"
    )
    private String accType;

    @Column(
            name="acc_branch"
    )
    private String accBranch;

    public Customers() {
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id=id;
    }

    public  String getAccName() {
        return this.accName;
    }
    public void setAccName(String accName) {
        this.accName=accName;
    }

    public long getAccNumber() {
        return this.accNumber;
    }
    public void setAccNumber(long accNumber) {
        this.accNumber=accNumber;
    }

    public String getAccType() {
        return this.accType;
    }
    public void setAccType(String accType) {
        this.accType=accType;
    }

    public String getAccBranch() {
        return this.accBranch;
    }
    public void setAccBranch(String accBranch) {
        this.accBranch=accBranch;
    }
}
