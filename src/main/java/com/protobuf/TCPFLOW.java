package com.protobuf;

import java.io.Serializable;

public class TCPFLOW implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7576318046344362206L;
	
	private String serial_num;
	
	private String status;
	
	private String stime;
	
	private String dtime;
	
	private String sip;
	
	private String sipv6;
	
	private int sport;
	
	private String dip;
	
	private String dipv6;
	
	private int dport;
	
	private String proto;
	
	private long uplink_length;

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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the stime
	 */
	public String getStime() {
		return stime;
	}

	/**
	 * @param stime the stime to set
	 */
	public void setStime(String stime) {
		this.stime = stime;
	}

	/**
	 * @return the dtime
	 */
	public String getDtime() {
		return dtime;
	}

	/**
	 * @param dtime the dtime to set
	 */
	public void setDtime(String dtime) {
		this.dtime = dtime;
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
	 * @return the uplink_length
	 */
	public long getUplink_length() {
		return uplink_length;
	}

	/**
	 * @param uplink_length the uplink_length to set
	 */
	public void setUplink_length(long uplink_length) {
		this.uplink_length = uplink_length;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TCPFLOW [serial_num=" + serial_num + ", status=" + status + ", stime=" + stime + ", dtime=" + dtime
				+ ", sip=" + sip + ", sipv6=" + sipv6 + ", sport=" + sport + ", dip=" + dip + ", dipv6=" + dipv6
				+ ", dport=" + dport + ", proto=" + proto + ", uplink_length=" + uplink_length + "]";
	}
	

}
