package com.protobuf;

import java.io.Serializable;
import java.util.List;

public class MAIL_BEHAVIOR implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4919391098618191700L;
	
	private String serial_num;
	
	private String proto;
	
	private String access_time;
	
	private String sip;
	
	private String sipv6;
	
	private String  dip;
	
	private String dipv6;
	
	private int sport;
	
	private int dport;
	
	private List<mail_attachment> attachment;

	/**
	 * @return the attachment
	 */
	public List<mail_attachment> getAttachment() {
		return attachment;
	}

	/**
	 * @param attachment the attachment to set
	 */
	public void setAttachment(List<mail_attachment> attachment) {
		this.attachment = attachment;
	}

	/**
	 * @return the serial_num
	 */
	public String getSerial_num() {
		return serial_num;
	}

	/**
	 * @param serial_num the serial_num to set
	 */
	public void setSerial_num(String serial_num) {
		this.serial_num = serial_num;
	}

	/**
	 * @return the proto
	 */
	public String getProto() {
		return proto;
	}

	/**
	 * @param proto the proto to set
	 */
	public void setProto(String proto) {
		this.proto = proto;
	}

	/**
	 * @return the access_time
	 */
	public String getAccess_time() {
		return access_time;
	}

	/**
	 * @param access_time the access_time to set
	 */
	public void setAccess_time(String access_time) {
		this.access_time = access_time;
	}

	/**
	 * @return the sip
	 */
	public String getSip() {
		return sip;
	}

	/**
	 * @param sip the sip to set
	 */
	public void setSip(String sip) {
		this.sip = sip;
	}

	/**
	 * @return the sipv6
	 */
	public String getSipv6() {
		return sipv6;
	}

	/**
	 * @param sipv6 the sipv6 to set
	 */
	public void setSipv6(String sipv6) {
		this.sipv6 = sipv6;
	}

	/**
	 * @return the dip
	 */
	public String getDip() {
		return dip;
	}

	/**
	 * @param dip the dip to set
	 */
	public void setDip(String dip) {
		this.dip = dip;
	}

	/**
	 * @return the dipv6
	 */
	public String getDipv6() {
		return dipv6;
	}

	/**
	 * @param dipv6 the dipv6 to set
	 */
	public void setDipv6(String dipv6) {
		this.dipv6 = dipv6;
	}

	/**
	 * @return the sport
	 */
	public int getSport() {
		return sport;
	}

	/**
	 * @param sport the sport to set
	 */
	public void setSport(int sport) {
		this.sport = sport;
	}

	/**
	 * @return the dport
	 */
	public int getDport() {
		return dport;
	}

	/**
	 * @param dport the dport to set
	 */
	public void setDport(int dport) {
		this.dport = dport;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MAIL_BEHAVIOR [serial_num=" + serial_num + ", proto=" + proto + ", access_time=" + access_time
				+ ", sip=" + sip + ", sipv6=" + sipv6 + ", dip=" + dip + ", dipv6=" + dipv6 + ", sport=" + sport
				+ ", dport=" + dport + ", attachment=" + attachment + "]";
	}
	
	

}
