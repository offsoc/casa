package org.gluu.casa.plugins.emailotp.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Represents a registered credential corresponding to a verified email address
 * 
 * 
 */
public class VerifiedEmail implements  Comparable<VerifiedEmail> {

    @SuppressWarnings("unused")
    private static Logger logger = LoggerFactory.getLogger(VerifiedEmail.class);

	private String email;

	private long addedOn;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickname) {
        this.nickName = nickname;
    }
	public VerifiedEmail() {
	}

	public VerifiedEmail(String email) {
		this.email = email;
	}

	public int compareTo(VerifiedEmail ph) {
		long date1 = getAddedOn();
		long date2 = ph.getAddedOn();
		return (date1 < date2) ? -1 : (date1 > date2 ? 1 : 0);
	}

	public long getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(long addedOn) {
		this.addedOn = addedOn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
