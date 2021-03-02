package com.example.restservice;

import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Class Notification that responsible for
 *
 * @author Mykola.Matsishin <br> created on 01 March 2021
 * @since 5.1
 */
public class Notification {
	private String subscriptionId;
	private String subscriptionExpirationDateTime;
	private String changeType;
	private String clientState;
	private String resource;
	private Map<String, String> resourceData;
	private String tenantId;

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionExpirationDateTime() {
		return subscriptionExpirationDateTime;
	}

	public void setSubscriptionExpirationDateTime(String subscriptionExpirationDateTime) {
		this.subscriptionExpirationDateTime = subscriptionExpirationDateTime;
	}

	public String getChangeType() {
		return changeType;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getClientState() {
		return clientState;
	}

	public void setClientState(String clientState) {
		this.clientState = clientState;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public Map<String, String> getResourceData() {
		return resourceData;
	}

	public void setResourceData(Map<String, String> resourceData) {
		this.resourceData = resourceData;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public Notification() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Notification that = (Notification) o;

		return new EqualsBuilder().append(subscriptionId, that.subscriptionId).append(subscriptionExpirationDateTime, that.subscriptionExpirationDateTime)
				.append(changeType, that.changeType).append(clientState, that.clientState).append(resource, that.resource).append(resourceData, that.resourceData).append(tenantId, that.tenantId).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(subscriptionId).append(subscriptionExpirationDateTime).append(changeType).append(clientState).append(resource).append(resourceData).append(tenantId)
				.toHashCode();
	}
}
