package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
/**
 * @author Dilip Kirar 2019
 *
 */
@Data
@Entity
@Table(name = "work")
public class Work extends AbstractEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="workInc")
	@GenericGenerator(name="workInc", strategy = "increment")
	@Column(name = "work_id")
	private Long workId;
	
	@Column(name = "user_master_user_id")
	private String userMasterUserId;
	
	@Column(name = "party_name")
	private String partyName;
	
	@Column(name = "issue_date")
	private String issueDate;
	
	@Column(name = "top")
	private Integer top;
	
	@Column(name = "pant")
	private Integer pant;
	
	@Column(name = "size")
	private Integer size;
	
	@Column(name = "qty")
	private Integer qty;
	
	@Column(name = "work_name")
	private String workName;
	
	@Column(name = "work_desc")
	private String workDesc;
	/* created_by updated_by created_date updated_date */
	
	@Column(name = "work_flag")
	private String workFlag;

	public Long getWorkId() {
		return workId;
	}

	public void setWorkId(Long workId) {
		this.workId = workId;
	}

	public String getUserMasterUserId() {
		return userMasterUserId;
	}

	public void setUserMasterUserId(String userMasterUserId) {
		this.userMasterUserId = userMasterUserId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public Integer getTop() {
		return top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}

	public Integer getPant() {
		return pant;
	}

	public void setPant(Integer pant) {
		this.pant = pant;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getWorkDesc() {
		return workDesc;
	}

	public void setWorkDesc(String workDesc) {
		this.workDesc = workDesc;
	}

	public String getWorkFlag() {
		return workFlag;
	}

	public void setWorkFlag(String workFlag) {
		this.workFlag = workFlag;
	}

	@Override
	public String toString() {
		return "Work [workId=" + workId + ", userMasterUserId=" + userMasterUserId + ", partyName=" + partyName
				+ ", issueDate=" + issueDate + ", top=" + top + ", pant=" + pant + ", size=" + size + ", qty=" + qty
				+ ", workName=" + workName + ", workDesc=" + workDesc + ", workFlag=" + workFlag + "]";
	}
	
	
}
