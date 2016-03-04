package org.cloudcoder.app.wizard.exec;

import java.io.File;

/**
 * All of the information needed to do the install,
 * independent of which cloud provider is being used.
 */
public interface ICloudInfo {
	/**
	 * Set the local data directory where we can store
	 * files needed during the installation process.
	 * 
	 * @param dir the data directory
	 */
	public void setDataDir(File dir);
	
	/**
	 * Get the local directory where files needed during the
	 * installation process are stored.
	 *  
	 * @return the data directory
	 */
	public File getDataDir();
	
	/**
	 * Get the public IP address of the webapp server.
	 * 
	 * @return public IP address of the webapp server
	 */
	public String getWebappPublicIp();
	
	/**
	 * Determine whether the private key was generated, or was pre-existing.
	 * 
	 * @return true if the private key was generated, false if
	 *         it was pre-existing
	 */
	public boolean isPrivateKeyGenerated();
	
	/**
	 * Get the the private key file (or the keypair if a PEM file)
	 * used to connect to the webapp server.
	 * 
	 * @return the private key file
	 */
	public File getPrivateKeyFile();
	
	/**
	 * Get the private IP address of the webapp server:
	 * this is how the builder instances will connect to the
	 * webapp.
	 * 
	 * @return the private IP address of the webapp server
	 */
	public String getWebappPrivateIp();

	/**
	 * Get the Unix username used to do admin on the webapp instance.
	 * 
	 * @return Unix username used to do admin on the webapp instance
	 */
	public String getWebappServerUserName();
}