package top.whq6.study.entity;

import java.util.Date;

public class Record {
    private Integer recordId;

    private Integer testId;

    private Integer recordUserId;

    private Integer recordBankId;

    private Date recordDoTime;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getRecordUserId() {
        return recordUserId;
    }

    public void setRecordUserId(Integer recordUserId) {
        this.recordUserId = recordUserId;
    }

    public Integer getRecordBankId() {
        return recordBankId;
    }

    public void setRecordBankId(Integer recordBankId) {
        this.recordBankId = recordBankId;
    }

    public Date getRecordDoTime() {
        return recordDoTime;
    }

    public void setRecordDoTime(Date recordDoTime) {
        this.recordDoTime = recordDoTime;
    }
}