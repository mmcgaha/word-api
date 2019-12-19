package io.mmcgaha.words.config;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.couchbase.client.java.PersistTo;
import com.couchbase.client.java.ReplicateTo;

public class CouchbaseConfiguration {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	private List<String> nodes;
    private String username;
    private String password;
    private String bucket;
    private long timeout;
    private int lockTime;
    private int numRetries;
    private long retryWaitInterval;

    private PersistTo persistTo;
    private ReplicateTo replicateTo;

    private String environment;
    private String application;
    
    private boolean sslEnabled;
    private String sslKeystoreFile;
    private String sslKeystorePassword;
    private boolean certAuthEnabled;
	
	/**
	 * @return the log
	 */
	public Logger getLog() {
		return log;
	}
	/**
	 * @param log the log to set
	 */
	public void setLog(Logger log) {
		this.log = log;
	}
	/**
	 * @return the nodes
	 */
	public List<String> getNodes() {
		return nodes;
	}
	/**
	 * @param nodes the nodes to set
	 */
	public void setNodes(List<String> nodes) {
		this.nodes = nodes;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the bucket
	 */
	public String getBucket() {
		return bucket;
	}
	/**
	 * @param bucket the bucket to set
	 */
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}
	/**
	 * @return the timeout
	 */
	public long getTimeout() {
		return timeout;
	}
	/**
	 * @param timeout the timeout to set
	 */
	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}
	/**
	 * @return the lockTime
	 */
	public int getLockTime() {
		return lockTime;
	}
	/**
	 * @param lockTime the lockTime to set
	 */
	public void setLockTime(int lockTime) {
		this.lockTime = lockTime;
	}
	/**
	 * @return the numRetries
	 */
	public int getNumRetries() {
		return numRetries;
	}
	/**
	 * @param numRetries the numRetries to set
	 */
	public void setNumRetries(int numRetries) {
		this.numRetries = numRetries;
	}
	/**
	 * @return the retryWaitInterval
	 */
	public long getRetryWaitInterval() {
		return retryWaitInterval;
	}
	/**
	 * @param retryWaitInterval the retryWaitInterval to set
	 */
	public void setRetryWaitInterval(long retryWaitInterval) {
		this.retryWaitInterval = retryWaitInterval;
	}
	/**
	 * @return the persistTo
	 */
	public PersistTo getPersistTo() {
		return persistTo;
	}
	/**
	 * @param persistTo the persistTo to set
	 */
	public void setPersistTo(PersistTo persistTo) {
		this.persistTo = persistTo;
	}
	/**
	 * @return the replicateTo
	 */
	public ReplicateTo getReplicateTo() {
		return replicateTo;
	}
	/**
	 * @param replicateTo the replicateTo to set
	 */
	public void setReplicateTo(ReplicateTo replicateTo) {
		this.replicateTo = replicateTo;
	}
	/**
	 * @return the environment
	 */
	public String getEnvironment() {
		return environment;
	}
	/**
	 * @param environment the environment to set
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	/**
	 * @return the application
	 */
	public String getApplication() {
		return application;
	}
	/**
	 * @param application the application to set
	 */
	public void setApplication(String application) {
		this.application = application;
	}
	/**
	 * @return the sslEnabled
	 */
	public boolean isSslEnabled() {
		return sslEnabled;
	}
	/**
	 * @param sslEnabled the sslEnabled to set
	 */
	public void setSslEnabled(boolean sslEnabled) {
		this.sslEnabled = sslEnabled;
	}
	/**
	 * @return the sslKeystoreFile
	 */
	public String getSslKeystoreFile() {
		return sslKeystoreFile;
	}
	/**
	 * @param sslKeystoreFile the sslKeystoreFile to set
	 */
	public void setSslKeystoreFile(String sslKeystoreFile) {
		this.sslKeystoreFile = sslKeystoreFile;
	}
	/**
	 * @return the sslKeystorePassword
	 */
	public String getSslKeystorePassword() {
		return sslKeystorePassword;
	}
	/**
	 * @param sslKeystorePassword the sslKeystorePassword to set
	 */
	public void setSslKeystorePassword(String sslKeystorePassword) {
		this.sslKeystorePassword = sslKeystorePassword;
	}
	/**
	 * @return the certAuthEnabled
	 */
	public boolean isCertAuthEnabled() {
		return certAuthEnabled;
	}
	/**
	 * @param certAuthEnabled the certAuthEnabled to set
	 */
	public void setCertAuthEnabled(boolean certAuthEnabled) {
		this.certAuthEnabled = certAuthEnabled;
	}
	
}
