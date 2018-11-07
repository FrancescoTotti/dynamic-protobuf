package com.protobuf;

import java.io.Serializable;

public class mail_attachment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6119284620056577146L;
	
	private String attach_md5;
	
	private String mime_type;
	
	private String name;

	/**
	 * @return the attach_md5
	 */
	public String getAttach_md5() {
		return attach_md5;
	}

	/**
	 * @param attach_md5 the attach_md5 to set
	 */
	public void setAttach_md5(String attach_md5) {
		this.attach_md5 = attach_md5;
	}

	/**
	 * @return the mime_type
	 */
	public String getMime_type() {
		return mime_type;
	}

	/**
	 * @param mime_type the mime_type to set
	 */
	public void setMime_type(String mime_type) {
		this.mime_type = mime_type;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "mail_attachment [attach_md5=" + attach_md5 + ", mime_type=" + mime_type + ", name=" + name + "]";
	}
	
	

}
