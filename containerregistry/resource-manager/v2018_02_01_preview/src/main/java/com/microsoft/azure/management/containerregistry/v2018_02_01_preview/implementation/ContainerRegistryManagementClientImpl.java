/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the ContainerRegistryManagementClientImpl class.
 */
public class ContainerRegistryManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The Microsoft Azure subscription ID. */
    private String subscriptionId;

    /**
     * Gets The Microsoft Azure subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The Microsoft Azure subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public ContainerRegistryManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public ContainerRegistryManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public ContainerRegistryManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public ContainerRegistryManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The RegistriesInner object to access its operations.
     */
    private RegistriesInner registries;

    /**
     * Gets the RegistriesInner object to access its operations.
     * @return the RegistriesInner object.
     */
    public RegistriesInner registries() {
        return this.registries;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The ReplicationsInner object to access its operations.
     */
    private ReplicationsInner replications;

    /**
     * Gets the ReplicationsInner object to access its operations.
     * @return the ReplicationsInner object.
     */
    public ReplicationsInner replications() {
        return this.replications;
    }

    /**
     * The WebhooksInner object to access its operations.
     */
    private WebhooksInner webhooks;

    /**
     * Gets the WebhooksInner object to access its operations.
     * @return the WebhooksInner object.
     */
    public WebhooksInner webhooks() {
        return this.webhooks;
    }

    /**
     * The BuildsInner object to access its operations.
     */
    private BuildsInner builds;

    /**
     * Gets the BuildsInner object to access its operations.
     * @return the BuildsInner object.
     */
    public BuildsInner builds() {
        return this.builds;
    }

    /**
     * The BuildStepsInner object to access its operations.
     */
    private BuildStepsInner buildSteps;

    /**
     * Gets the BuildStepsInner object to access its operations.
     * @return the BuildStepsInner object.
     */
    public BuildStepsInner buildSteps() {
        return this.buildSteps;
    }

    /**
     * The BuildTasksInner object to access its operations.
     */
    private BuildTasksInner buildTasks;

    /**
     * Gets the BuildTasksInner object to access its operations.
     * @return the BuildTasksInner object.
     */
    public BuildTasksInner buildTasks() {
        return this.buildTasks;
    }

    /**
     * Initializes an instance of ContainerRegistryManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public ContainerRegistryManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of ContainerRegistryManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ContainerRegistryManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ContainerRegistryManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ContainerRegistryManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.registries = new RegistriesInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.replications = new ReplicationsInner(restClient().retrofit(), this);
        this.webhooks = new WebhooksInner(restClient().retrofit(), this);
        this.builds = new BuildsInner(restClient().retrofit(), this);
        this.buildSteps = new BuildStepsInner(restClient().retrofit(), this);
        this.buildTasks = new BuildTasksInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s)", super.userAgent(), "ContainerRegistryManagementClient");
    }
}
