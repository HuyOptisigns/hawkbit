/**
 * Copyright (c) 2015 Bosch Software Innovations GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.hawkbit.mgmt.json.model.rollout;

import java.util.List;
import java.util.Optional;

import org.eclipse.hawkbit.mgmt.json.model.distributionset.MgmtActionType;
import org.eclipse.hawkbit.mgmt.json.model.rolloutgroup.MgmtRolloutGroup;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model for request containing a rollout body e.g. in a POST request of
 * creating a rollout via REST API.
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MgmtRolloutRestRequestBody extends AbstractMgmtRolloutConditionsEntity {

    private String targetFilterQuery;
    private long distributionSetId;

    private Integer amountGroups;

    private Long forcetime;

    private Long startAt;

    @JsonProperty(required = false)
    private Integer weight;

    //HUYK: Add a new json item for a client API to set a new OTA ID
    @JsonProperty(required = true)
    private Integer otaId;

    @JsonProperty(required = false)
    private Boolean confirmationRequired;

    private MgmtActionType type;

    private List<MgmtRolloutGroup> groups;

    /**
     * @return the targetFilterQuery
     */
    public String getTargetFilterQuery() {
        return targetFilterQuery;
    }

    /**
     * @param targetFilterQuery
     *            the targetFilterQuery to set
     */
    public void setTargetFilterQuery(final String targetFilterQuery) {
        this.targetFilterQuery = targetFilterQuery;
    }

    /**
     * @return the distributionSetId
     */
    public long getDistributionSetId() {
        return distributionSetId;
    }

    /**
     * @param distributionSetId
     *            the distributionSetId to set
     */
    public void setDistributionSetId(final long distributionSetId) {
        this.distributionSetId = distributionSetId;
    }

    /**
     * @return the groupSize
     */
    public Integer getAmountGroups() {
        return amountGroups;
    }

    /**
     * @param groupSize
     *            the groupSize to set
     */
    public void setAmountGroups(final Integer groupSize) {
        this.amountGroups = groupSize;
    }

    /**
     * @return the forcetime
     */
    public Long getForcetime() {
        return forcetime;
    }

    /**
     * @param forcetime
     *            the forcetime to set
     */
    public void setForcetime(final Long forcetime) {
        this.forcetime = forcetime;
    }

    /**
     * @return the type
     */
    public MgmtActionType getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(final MgmtActionType type) {
        this.type = type;
    }

    /**
     * @return the List of defined Groups
     */
    public List<MgmtRolloutGroup> getGroups() {
        return groups;
    }

    /**
     * @param groups
     *            List of {@link MgmtRolloutGroup}
     */
    public void setGroups(final List<MgmtRolloutGroup> groups) {
        this.groups = groups;
    }

    /**
     * @return the start at timestamp in millis or null
     */
    public Long getStartAt() {
        return startAt;
    }

    /**
     * @param startAt
     *            the start at timestamp in millis or null
     */
    public void setStartAt(final Long startAt) {
        this.startAt = startAt;
    }

    /**
     * @return the priority of {@link Rollout}
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * @param weight
     *            the priority of {@link Rollout}
     */
    public void setWeight(final Integer weight) {
        this.weight = weight;
    }

    //HUYK: To return OTA ID in a POST Rollout request
    /**
     * @return the priority of {@link Rollout}
     */
    public Integer getDeployBase() {
        return otaId;
    }

    /**
     * @param deployBase
     *            the priority of {@link Rollout}
     */
    public void setDeployBase(final Integer otaId) {
        this.otaId = otaId;
    }

    /**
     * Only considered if confirmation flow active
     * 
     * @return if the confirmation is required for this rollout
     */
    public Boolean isConfirmationRequired() {
        return confirmationRequired;
    }

    /**
     * @param confirmationRequired
     *            if the confirmation is required for this rollout
     */
    public void setConfirmationRequired(final boolean confirmationRequired) {
        this.confirmationRequired = confirmationRequired;
    }
}
