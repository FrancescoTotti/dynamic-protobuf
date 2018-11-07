package com.protobuf;

import java.io.Serializable;

public class SENSOR_LOG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4475924410961127202L;
	
	private int message_type;
	
	private TCPFLOW skyeye_tcpflow;
	
	private MAIL_BEHAVIOR skyeye_mail;

	/**
	 * @return the message_type
	 */
	public int getMessage_type() {
		return message_type;
	}

	/**
	 * @param message_type the message_type to set
	 */
	public void setMessage_type(int message_type) {
		this.message_type = message_type;
	}

	/**
	 * @return the skyeye_tcpflow
	 */
	public TCPFLOW getSkyeye_tcpflow() {
		return skyeye_tcpflow;
	}

	/**
	 * @param skyeye_tcpflow the skyeye_tcpflow to set
	 */
	public void setSkyeye_tcpflow(TCPFLOW skyeye_tcpflow) {
		this.skyeye_tcpflow = skyeye_tcpflow;
	}

	/**
	 * @return the skyeye_mail
	 */
	public MAIL_BEHAVIOR getSkyeye_mail() {
		return skyeye_mail;
	}

	/**
	 * @param skyeye_mail the skyeye_mail to set
	 */
	public void setSkyeye_mail(MAIL_BEHAVIOR skyeye_mail) {
		this.skyeye_mail = skyeye_mail;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SENSOR_LOG [message_type=" + message_type + ", skyeye_tcpflow=" + skyeye_tcpflow + ", skyeye_mail="
				+ skyeye_mail + "]";
	}

}
