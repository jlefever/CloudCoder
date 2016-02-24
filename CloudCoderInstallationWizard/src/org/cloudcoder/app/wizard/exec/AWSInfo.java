package org.cloudcoder.app.wizard.exec;

import com.amazonaws.services.ec2.model.Image;
import com.amazonaws.services.ec2.model.KeyPair;
import com.amazonaws.services.ec2.model.SecurityGroup;
import com.amazonaws.services.ec2.model.Subnet;
import com.amazonaws.services.ec2.model.Vpc;

// Collects information needed to do cloud service admin actions.
// This is the implementation for AWS.
public class AWSInfo {
	private Vpc vpc;
	private Subnet subnet;
	private KeyPair keyPair;
	private SecurityGroup securityGroup;
	private Image webappImage;
	
	public Vpc getVpc() {
		return vpc;
	}
	
	public void setVpc(Vpc vpc) {
		this.vpc = vpc;
	}
	
	public Subnet getSubnet() {
		return subnet;
	}

	public void setSubnet(Subnet subnet) {
		this.subnet = subnet;
	}
	
	public KeyPair getKeyPair() {
		return keyPair;
	}
	
	public void setKeyPair(KeyPair keyPair) {
		this.keyPair = keyPair;
	}
	
	public SecurityGroup getSecurityGroup() {
		return securityGroup;
	}

	public void setSecurityGroup(SecurityGroup group) {
		this.securityGroup = group;
	}
	
	public Image getWebappImage() {
		return webappImage;
	}

	public void setWebappImage(Image image) {
		this.webappImage = image;
	}
}