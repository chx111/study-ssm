package top.whq6.study.entity;

import java.util.Date;

public class Test {
    private Integer testId;

    private Integer recordId;

    private Integer testAuthorId;

    private Date testPublishDate;

    private Integer testBankId;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getTestAuthorId() {
        return testAuthorId;
    }

    public void setTestAuthorId(Integer testAuthorId) {
        this.testAuthorId = testAuthorId;
    }

    public Date getTestPublishDate() {
        return testPublishDate;
    }

    public void setTestPublishDate(Date testPublishDate) {
        this.testPublishDate = testPublishDate;
    }

    public Integer getTestBankId() {
        return testBankId;
    }

    public void setTestBankId(Integer testBankId) {
        this.testBankId = testBankId;
    }
}