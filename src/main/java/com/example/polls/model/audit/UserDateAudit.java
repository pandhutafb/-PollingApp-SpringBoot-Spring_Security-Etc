package com.example.polls.model.audit;

//Untuk mencapai pengauditan pengguna, mari kita definisikan model audit yang disebut UserDateAudit yang 
//memperluas model DateAudit yang kami tetapkan di bagian pertama.
//
//Ini mencakup bidang yang dibuat oleh dan yang diperbarui oleh.

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
@JsonIgnoreProperties(
        value = {"createdBy", "updatedBy"},
        allowGetters = true
)

public class UserDateAudit extends DateAudit {

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	
	@CreatedBy
    @Column(updatable = false)
    private Long createdBy;

    @LastModifiedBy
    private Long updatedBy;

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }
}
