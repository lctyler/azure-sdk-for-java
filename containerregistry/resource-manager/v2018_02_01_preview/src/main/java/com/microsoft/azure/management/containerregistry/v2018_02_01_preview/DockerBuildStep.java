/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview;

import java.util.List;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation.BuildArgumentInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The Docker build step.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Docker")
public class DockerBuildStep extends BuildStepProperties {
    /**
     * The repository branch name.
     */
    @JsonProperty(value = "branch")
    private String branch;

    /**
     * The fully qualified image names including the repository and tag.
     */
    @JsonProperty(value = "imageNames")
    private List<String> imageNames;

    /**
     * The value of this property indicates whether the image built should be
     * pushed to the registry or not.
     */
    @JsonProperty(value = "isPushEnabled")
    private Boolean isPushEnabled;

    /**
     * The value of this property indicates whether the image cache is enabled
     * or not.
     */
    @JsonProperty(value = "noCache")
    private Boolean noCache;

    /**
     * The Docker file path relative to the source control root.
     */
    @JsonProperty(value = "dockerFilePath")
    private String dockerFilePath;

    /**
     * The relative context path for a docker build in the source.
     */
    @JsonProperty(value = "contextPath")
    private String contextPath;

    /**
     * The custom arguments for building this build step.
     */
    @JsonProperty(value = "buildArguments")
    private List<BuildArgumentInner> buildArguments;

    /**
     * List of base image dependencies for a step.
     */
    @JsonProperty(value = "baseImageDependencies", access = JsonProperty.Access.WRITE_ONLY)
    private List<BaseImageDependency> baseImageDependencies;

    /**
     * The type of the auto trigger for base image dependency updates. Possible
     * values include: 'All', 'Runtime', 'None'.
     */
    @JsonProperty(value = "baseImageTrigger")
    private BaseImageTriggerType baseImageTrigger;

    /**
     * Get the repository branch name.
     *
     * @return the branch value
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the repository branch name.
     *
     * @param branch the branch value to set
     * @return the DockerBuildStep object itself.
     */
    public DockerBuildStep withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the fully qualified image names including the repository and tag.
     *
     * @return the imageNames value
     */
    public List<String> imageNames() {
        return this.imageNames;
    }

    /**
     * Set the fully qualified image names including the repository and tag.
     *
     * @param imageNames the imageNames value to set
     * @return the DockerBuildStep object itself.
     */
    public DockerBuildStep withImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
        return this;
    }

    /**
     * Get the value of this property indicates whether the image built should be pushed to the registry or not.
     *
     * @return the isPushEnabled value
     */
    public Boolean isPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Set the value of this property indicates whether the image built should be pushed to the registry or not.
     *
     * @param isPushEnabled the isPushEnabled value to set
     * @return the DockerBuildStep object itself.
     */
    public DockerBuildStep withIsPushEnabled(Boolean isPushEnabled) {
        this.isPushEnabled = isPushEnabled;
        return this;
    }

    /**
     * Get the value of this property indicates whether the image cache is enabled or not.
     *
     * @return the noCache value
     */
    public Boolean noCache() {
        return this.noCache;
    }

    /**
     * Set the value of this property indicates whether the image cache is enabled or not.
     *
     * @param noCache the noCache value to set
     * @return the DockerBuildStep object itself.
     */
    public DockerBuildStep withNoCache(Boolean noCache) {
        this.noCache = noCache;
        return this;
    }

    /**
     * Get the Docker file path relative to the source control root.
     *
     * @return the dockerFilePath value
     */
    public String dockerFilePath() {
        return this.dockerFilePath;
    }

    /**
     * Set the Docker file path relative to the source control root.
     *
     * @param dockerFilePath the dockerFilePath value to set
     * @return the DockerBuildStep object itself.
     */
    public DockerBuildStep withDockerFilePath(String dockerFilePath) {
        this.dockerFilePath = dockerFilePath;
        return this;
    }

    /**
     * Get the relative context path for a docker build in the source.
     *
     * @return the contextPath value
     */
    public String contextPath() {
        return this.contextPath;
    }

    /**
     * Set the relative context path for a docker build in the source.
     *
     * @param contextPath the contextPath value to set
     * @return the DockerBuildStep object itself.
     */
    public DockerBuildStep withContextPath(String contextPath) {
        this.contextPath = contextPath;
        return this;
    }

    /**
     * Get the custom arguments for building this build step.
     *
     * @return the buildArguments value
     */
    public List<BuildArgumentInner> buildArguments() {
        return this.buildArguments;
    }

    /**
     * Set the custom arguments for building this build step.
     *
     * @param buildArguments the buildArguments value to set
     * @return the DockerBuildStep object itself.
     */
    public DockerBuildStep withBuildArguments(List<BuildArgumentInner> buildArguments) {
        this.buildArguments = buildArguments;
        return this;
    }

    /**
     * Get list of base image dependencies for a step.
     *
     * @return the baseImageDependencies value
     */
    public List<BaseImageDependency> baseImageDependencies() {
        return this.baseImageDependencies;
    }

    /**
     * Get the type of the auto trigger for base image dependency updates. Possible values include: 'All', 'Runtime', 'None'.
     *
     * @return the baseImageTrigger value
     */
    public BaseImageTriggerType baseImageTrigger() {
        return this.baseImageTrigger;
    }

    /**
     * Set the type of the auto trigger for base image dependency updates. Possible values include: 'All', 'Runtime', 'None'.
     *
     * @param baseImageTrigger the baseImageTrigger value to set
     * @return the DockerBuildStep object itself.
     */
    public DockerBuildStep withBaseImageTrigger(BaseImageTriggerType baseImageTrigger) {
        this.baseImageTrigger = baseImageTrigger;
        return this;
    }

}
